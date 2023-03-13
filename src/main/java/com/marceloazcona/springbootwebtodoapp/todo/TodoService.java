package com.marceloazcona.springbootwebtodoapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();

	private static int todosCount = 0;

	static {
		todos.add(new Todo(++todosCount, "Marcelo", "Learn AWS", LocalDate.now(), false));
		todos.add(new Todo(++todosCount, "Azcona", "Learn Java", LocalDate.now(), true));
	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean isDone) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, isDone);

		todos.add(todo);
	}

	public void deleteTodoById(int id) {
		Todo toRemove = todos.stream().filter(todo -> todo.getId() == id).findAny().orElse(null);

		todos.remove(toRemove);
	}
}
