package com.todo;

import java.util.ArrayList;
import java.util.List;

public class App{
    private static List<String> todos = new ArrayList<>();

    public static void addTodo(String task) {
        todos.add(task);
        System.out.println("Added:" + task);
    }

    public static void listTodos(){
        System.out.println("Your Todos:");
        for (int i = 0; i < todos.size(); i++ ) {
            System.out.println((i + 1) + ". " + todos.get(i));
        }
    }

    public static List<String> getTodos() {
        return todos;
    }

    public static void removeTodos(String task) {
        for (int i = 0; i < todos.size(); i++) {
            if( todos.get(i).equals(task)) {
                todos.remove(i);
                System.out.println("Removed:" + task );
                return;
            }
        }
        System.out.println("Task not found");
    }
    

    public static void main(String[] args) {
        addTodo("Learn CI/CD");
        addTodo("Write Java Tests");
        listTodos();
        removeTodos("Learn CI/CD");
    }

}