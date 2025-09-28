package dev.peixotim.service.tasks.Controller;

import dev.peixotim.service.tasks.Entity.TasksEntity;
import dev.peixotim.service.tasks.Service.TasksService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks/")
public class TasksController {

    private final TasksService service;

    public TasksController(TasksService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TasksEntity> createTask(@RequestBody TasksEntity tasks){
        var saved = service.create(tasks);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
