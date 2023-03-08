package com.marceloazcona.springbootwebtodoapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();

	static {
		todos.add(new Todo(1, "Marcelo", "Learn AWS", LocalDate.now(), false));

		todos.add(new Todo(1, "Azcona", "Learn Java", LocalDate.now(), true));
	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}
}
