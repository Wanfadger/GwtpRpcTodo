package com.wanfadger.gwtrpcdemo.client.application.home;

import java.util.List;

import javax.inject.Inject;

import com.wanfadger.gwtrpcdemo.client.application.ApplicationPresenter;
import com.wanfadger.gwtrpcdemo.client.place.NameTokens;
import com.wanfadger.gwtrpcdemo.shared.AsyncCallbackImpl;
import com.wanfadger.gwtrpcdemo.shared.Todo;
import com.wanfadger.gwtrpcdemo.shared.TodoAction;
import com.wanfadger.gwtrpcdemo.shared.TodoResult;
import com.wanfadger.gwtrpcdemo.shared.utils.ActionCommands;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.web.bindery.event.shared.EventBus;

import com.gwtplatform.dispatch.rpc.shared.DispatchAsync;

import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

public class HomePagePresenter extends Presenter<HomePagePresenter.MyView, HomePagePresenter.MyProxy> {
    interface MyView extends View {
    }

    @ProxyStandard
    @NameToken(NameTokens.home)
    interface MyProxy extends ProxyPlace<HomePagePresenter> {
    }
    
    private DispatchAsync dispatcher;

    @Inject
    HomePagePresenter(EventBus eventBus,
                      MyView view,
                      MyProxy proxy, 
                      final DispatchAsync dispatcher) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
        
        this.dispatcher = dispatcher;
    }
    
    
    @Override
    protected void onBind() {
    	// TODO Auto-generated method stub
    	super.onBind();
    	
    	TodoAction action  = new TodoAction(ActionCommands.GET_TODOS_ACTION_COMMAND);
    	
    	
    	
    	this.dispatcher.execute(action, new AsyncCallbackImpl<TodoResult>() {


			@Override
			public void onSuccess(TodoResult result) {
			List<Todo> todos = result.getTodos();
			GWT.log("todos "+todos);
				// TODO Auto-generated method stub
				
			}
		});
    	
    }
    
    
}