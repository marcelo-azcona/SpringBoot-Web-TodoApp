package com.marceloazcona.springbootwebtodoapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
	private static List<Todo> todos;

	static {
		todos.add(new Todo(1, "Marcelo", "Learn AWS", LocalDate.now(), false));

		todos.add(new Todo(1, "Azcona", "Learn Java", LocalDate.now(), true));
	}

	private List<Todo> findByUsername(String username) {
		return todos;
	}
}
