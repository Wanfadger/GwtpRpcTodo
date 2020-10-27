package com.gwtplatform.dispatch.rpc.shared;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class DispatchService_Proxy extends RemoteServiceProxy implements com.gwtplatform.dispatch.rpc.shared.DispatchServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.gwtplatform.dispatch.rpc.shared.DispatchService";
  private static final String SERIALIZATION_POLICY ="FD7D123A7CB8AE61C6B58E8B7816FE4C";
  private static final com.gwtplatform.dispatch.rpc.shared.DispatchService_TypeSerializer SERIALIZER = new com.gwtplatform.dispatch.rpc.shared.DispatchService_TypeSerializer();
  
  public DispatchService_Proxy() {
    super(GWT.getModuleBaseURL(),
      null, 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public com.google.gwt.http.client.Request execute(java.lang.String cookieSentByRPC, com.gwtplatform.dispatch.rpc.shared.Action action, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("DispatchService_Proxy", "execute");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("com.gwtplatform.dispatch.rpc.shared.Action");
      streamWriter.writeString(cookieSentByRPC);
      streamWriter.writeObject(action);
      return helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
      return new com.google.gwt.user.client.rpc.impl.FailedRequest();
    }
  }
  
  public com.google.gwt.http.client.Request undo(java.lang.String cookieSentByRPC, com.gwtplatform.dispatch.rpc.shared.Action action, com.gwtplatform.dispatch.rpc.shared.Result result, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("DispatchService_Proxy", "undo");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("com.gwtplatform.dispatch.rpc.shared.Action");
      streamWriter.writeString("com.gwtplatform.dispatch.rpc.shared.Result");
      streamWriter.writeString(cookieSentByRPC);
      streamWriter.writeObject(action);
      streamWriter.writeObject(result);
      return helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
      return new com.google.gwt.user.client.rpc.impl.FailedRequest();
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
