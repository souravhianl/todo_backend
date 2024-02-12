package com.todo.todoapp.service;

import com.todo.todoapp.entity.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {

    //Create a new todo item
    Todo createTodo(Todo todo);

    //Get all todo items
    List<Todo> getAllTodos();

    //Get a single todo item by id
    Optional<Todo> getTodoById(Long id);

    //Update an existing todo item
    Todo updateTodo(Long id, Todo todoDetails);

    //Delete a todo item by id
    void deleteTodo(Long id);
}
