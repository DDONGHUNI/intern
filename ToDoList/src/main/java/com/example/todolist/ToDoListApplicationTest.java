package com.example.todolist;

import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ToDoListApplicationTest {

    @Autowired
    private ToDoRepository toDoRepository;

    @Test
    void testJpa(){
        ToDoEntity todo1 = new ToDoEntity();
        todo1.setContent("밥먹기");
        todo1.setCompleted(Boolean.TRUE);
        this.toDoRepository.save(todo1);

        ToDoEntity todo2 = new ToDoEntity();
        todo2.setContent("스프링 공부하기");
        todo2.setCompleted(Boolean.FALSE);
        this.toDoRepository.save(todo2);
    }
}
