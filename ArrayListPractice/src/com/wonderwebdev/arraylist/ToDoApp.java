package com.wonderwebdev.arraylist;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToDoApp {

	public static void main(String[] args) throws IOException {
		
		ToDoServiceImpl toDoService = new ToDoServiceImpl();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input;
		String item;
		int index;
		
		while(true) {
			
			System.out.println("Please select an option:");
			System.out.println("1. Add a Task.");//Create
			System.out.println("2. Display Tasks.");//Read
			System.out.println("3. Update a Task.");//Update
			System.out.println("4. Delete a Task");//Delete
			System.out.println("5. Exit");
			input = reader.readLine();
			
			switch(input) {
			
			case "1":
				System.out.println("Enter a Task:");
				item = reader.readLine();
				toDoService.addItem(item);
				break;
				
			case "2":
				toDoService.displayItems();
				break;
				
			case "3":
				System.out.println("Enter the task to be updated:");
				item = reader.readLine();
				
				if(toDoService.data.getToDo().contains(item)) {
					
					index = toDoService.data.getToDo().indexOf(item);
					System.out.println("Thank you. Enter the updated task:");
					String newItem = reader.readLine();
					toDoService.updateItem(index, newItem);
					
				} else {
					System.out.println("No such Task found. Please try again.");
				}
				break;
				
			case "4":
				System.out.println("Enter the task to be deleted:");
				item = reader.readLine();
				if(toDoService.data.getToDo().contains(item)) {
					
					index = toDoService.data.getToDo().indexOf(item);
					toDoService.removeItem(index);
										
				} else {
					System.out.println("No such Task found. Please try again.");
				}
				break;
				
			case "5":
				System.out.println("Thanks for stopping by!");
				System.exit(0);
				
				default:
					System.out.println("Invalid Selection. Please make another selection.");
			}
		}

	}

}
