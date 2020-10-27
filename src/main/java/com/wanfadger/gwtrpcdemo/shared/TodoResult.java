package com.wanfadger.gwtrpcdemo.shared;

import java.util.List;

import com.gwtplatform.dispatch.rpc.shared.Result;

public class TodoResult implements Result {
	private Todo todo;
	 private List<Todo> todos; 
	 private String command;
	 
	 public TodoResult() {
		// TODO Auto-generated constructor stub
	}
	 
	 public TodoResult(String command) {
		 this.command = command;
		}
	 
	public TodoResult(String command ,Todo todo){
		 this.todo = todo;
		 this.command = command;
	 }
	
	public TodoResult(List<Todo> todos){
		 this.todos = todos;
	 }
	

	public Todo getTodo() {
		return todo;
	}

	public List<Todo> getTodos() {
		return todos;
	}

	public String getCommand() {
		return command;
	}
	
	
	
	
	
	
}
