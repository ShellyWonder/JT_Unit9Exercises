package com.wonderwebdev.arraylist;

import java.io.IOException;
import java.util.*;

public class ToDoServiceImpl implements ToDoService {

	public ToDo data = new ToDo();
	List<String> toDo = new ArrayList<String>();

	public void addItem(String item) {

		data.getToDo().add(item);
		System.out.println(data.getToDo());

	}

	public void displayItems() {
		if (data.getToDo().isEmpty()) {
			System.out.println("The To Do list is empty.");
		}

		else {
			System.out.println("Here are the items in your To Do list: ");
			for (String item : data.getToDo()) {
				System.out.println(item);
			}
		}
	}

	@Override
	public void updateItem(int index, String newItem) throws IOException {

		if (index >= 0 && index < data.getToDo().size()) {
			data.getToDo().set(index, newItem);
			System.out.println("Updated item at index " + index + " to: " + newItem);

		} else {
			System.out.println("Index out of bounds. No item was updated.");
		}

	}

	@Override
	public void removeItem(int index) throws IOException {
		if (index >= 0 && index < data.getToDo().size()) {
			data.getToDo().remove(index);
			System.out.println("Item is deleted!");

		} else {
			System.out.println("Index out of bounds. No item was deleted.");
		}
	}
}
