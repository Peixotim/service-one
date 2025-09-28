package dev.peixotim.service.tasks.Repository;

import dev.peixotim.service.tasks.Entity.TasksEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<TasksEntity,Long> {
}
