package com.todo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class AppTest {
    @Test
    public void testAddTodo() {
        App.addTodo("Test Task");
        List<String> todos = App.getTodos();
        assertEquals(1, todos.size());
        assertEquals("Test Task", todos.get(0));
    }
}
