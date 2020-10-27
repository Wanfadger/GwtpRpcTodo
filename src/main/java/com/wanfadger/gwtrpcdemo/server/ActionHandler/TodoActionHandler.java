package com.wanfadger.gwtrpcdemo.server.ActionHandler;

import java.util.Arrays;
import java.util.List;

import com.google.inject.Inject;
import com.gwtplatform.dispatch.rpc.server.ExecutionContext;
import com.gwtplatform.dispatch.rpc.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;
import com.wanfadger.gwtrpcdemo.shared.Todo;
import com.wanfadger.gwtrpcdemo.shared.TodoAction;
import com.wanfadger.gwtrpcdemo.shared.TodoResult;
import com.wanfadger.gwtrpcdemo.shared.utils.ActionCommands;

public class TodoActionHandler implements ActionHandler <TodoAction, TodoResult>{
	
	@Inject
	public TodoActionHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public TodoResult execute(TodoAction action, ExecutionContext context) throws ActionException {
		
		if(action.getCommand().equals(ActionCommands.GET_TODOS_ACTION_COMMAND)) {
			//http:localhost/todos
			List<Todo> todos  = Arrays.asList(
					new Todo("1" , "todo 1") , 
					new Todo("2" , "todo 2") ,
					new Todo("3" , "todo 3") ,
					new Todo("4" , "todo 4") ,
					new Todo("5" , "todo 5"));
			
			
			return new TodoResult(todos);
			
		   
		}else {
			// TODO Auto-generated method stub
			return null;	
		}
		
	}

	@Override
	public Class<TodoAction> getActionType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void undo(TodoAction action, TodoResult result, ExecutionContext context) throws ActionException {
		// TODO Auto-generated method stub
		
	}

}
