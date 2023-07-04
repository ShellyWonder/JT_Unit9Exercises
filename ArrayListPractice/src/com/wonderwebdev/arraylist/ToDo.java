package com.wonderwebdev.arraylist;

import java.util.List;

public class ToDo {
	private List<String> toDo;
	private ToDo data = new ToDo();

	public ToDo(List<String> toDo, ToDo data) {
		super();
		this.toDo = toDo;
		this.data = data;
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