package com.wanfadger.gwtrpcdemo.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl;

public class TodoAction extends UnsecuredActionImpl<TodoResult> implements IsSerializable {
	private Todo todo;
	 private List<Todo> todos; 
	 private String command;
	 
	public TodoAction() {
		// TODO Auto-generated constructor stub
	}
	
	public TodoAction(String command) {
	this.command = command;
	}
	
	
	public TodoAction(String command , Todo todo) {
		this.todo = todo;
		this.command = command;
	}


   public	Todo getTodo() {
		return todo;
	}

public List<Todo> getTodos() {
	return todos;
}

public String getCommand() {
	return command;
}
	
	
	
	
	
	
	
	
	

}
