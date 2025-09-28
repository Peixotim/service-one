package dev.peixotim.service.tasks.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "service-notification")
public interface NotificationClient {

    @PostMapping("/notification")
    void sendNotification();
}
