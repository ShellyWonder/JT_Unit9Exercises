package com.wonderwebdev.arraylist;

import java.io.IOException;

public interface ToDoService {
	// Adds an item to the todo list
    void addItem(String item);

    // Displays all items in the todo list
    void displayItems();

    // Updates an item in the todo list
    void updateItem(int index, String newItem) throws IOException;

    // Removes an item from the todo list
    void removeItem(int index) throws IOException;
}
