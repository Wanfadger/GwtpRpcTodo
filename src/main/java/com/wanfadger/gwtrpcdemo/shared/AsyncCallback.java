package com.wanfadger.gwtrpcdemo.shared;

@Deprecated
public interface AsyncCallback<T> {

	void onSuccess(T result);
	
	void onFailure(Throwable t);
	
}
