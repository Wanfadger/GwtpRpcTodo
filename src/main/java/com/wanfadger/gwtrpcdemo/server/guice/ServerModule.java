package com.wanfadger.gwtrpcdemo.server.guice;

import com.gwtplatform.dispatch.rpc.server.guice.HandlerModule;
import com.wanfadger.gwtrpcdemo.server.ActionHandler.TodoActionHandler;
import com.wanfadger.gwtrpcdemo.shared.TodoAction;

public class ServerModule extends HandlerModule {
    
//	@Bean
//	 TodoActionHandler getTodoActionHandler() {
//		return new TodoActionHandler();
//	}
	
	@Override
    protected void configureHandlers() {
    
    	bindHandler(TodoAction.class, TodoActionHandler.class);
    }
}