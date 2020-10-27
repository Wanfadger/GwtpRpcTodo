package com.wanfadger.gwtrpcdemo.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Todo implements IsSerializable {
	
	private String id;
	
	private String name;
	
	public Todo() {
		// TODO Auto-generated constructor stub
	}

	
	public Todo(String id , String name ) { 
		this.id = id;
		this.name = name;
	}

	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + "]";
	}
	
	
	
	

}
