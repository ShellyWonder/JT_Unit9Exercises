package com.wonderwebdev.arraylist;

import java.util.*;

public class ToDo {
	private List<String> toDo = new ArrayList<>();
	

	public ToDo(List<String> toDo, ToDo data) {
		super();
		this.toDo = toDo;
		
	}

	public ToDo() {
	}

	public List<String> getToDo() {
		return toDo;
	}

	public void setToDo(List<String> toDo) {
		this.toDo = toDo;
	}
}