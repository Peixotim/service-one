package dev.peixotim.service.tasks.Service;

import dev.peixotim.service.tasks.Entity.TasksEntity;
import dev.peixotim.service.tasks.Repository.TasksRepository;
import org.springframework.stereotype.Service;

@Service
public class TasksService {

    private final TasksRepository repository;

    public TasksService(TasksRepository repository){
        this.repository = repository;
    }

    //Create

    public TasksEntity create(TasksEntity tasks){
        if(tasks != null) {
            return repository.save(tasks);
        }else{
            throw new RuntimeException("Error tasks is not filled !");
        }

    }
}
