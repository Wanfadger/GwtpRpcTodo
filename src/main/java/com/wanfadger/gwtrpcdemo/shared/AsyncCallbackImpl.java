package com.wanfadger.gwtrpcdemo.shared;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public  abstract class AsyncCallbackImpl<T> implements AsyncCallback<T>  {


	@Override
	public void onFailure(Throwable t) {
		GWT.log("Communication to the server has failed.");

		GWT.log("error "+t.getMessage());
	}

}
