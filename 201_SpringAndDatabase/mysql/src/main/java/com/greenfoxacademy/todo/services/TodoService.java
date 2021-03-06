package com.greenfoxacademy.todo.services;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoService (TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Iterable<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Iterable<Todo> findAllByIsDone() {
        return todoRepository.findAllByIsDone(true);
    }

    public Iterable<Todo> findAllByIsNotDone() {
        return todoRepository.findAllByIsDone(false);
    }

    public void add(String title) {
        todoRepository.save(new Todo(title));
    }

    public void add(Todo todo) {
        todoRepository.save(todo);
    }

    public void edit(Todo todo) {
        todoRepository.save(todo);
    }

    public void deleteById(Long id) {
        todoRepository.deleteById(id);
    }

    public Todo findTodoById(Long id) {
        Optional<Todo> findOneById = todoRepository.findById(id);
        if (findOneById.isPresent()) {
            return findOneById.get();
        }
        return null;
        //return findOneById.orElse(null);
    }

    public Iterable<Todo> findAllByTitleContains(String input) {
        return todoRepository.findAllByTitleContains(input);
    }

    public Iterable<Todo> findAllByAssignee(Assignee assignee) {
        return todoRepository.findAllByAssignee(assignee);
    }

    public void setAssigneeNull(Todo todo) {
        todo.setAssignee(null);
        todoRepository.save(todo);
    }

    public void setAssigneeNullForTodoList (List<Todo> todos) {
        for (Todo todo : todos) {
            setAssigneeNull(todo);
        }
    }
}
