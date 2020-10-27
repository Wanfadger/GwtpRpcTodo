package com.gwtplatform.dispatch.rpc.client.interceptor;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$dispatch$rpc$client$interceptor$DefaultRpcInterceptorRegistry$_annotation$$none$$(com.gwtplatform.dispatch.rpc.client.interceptor.DefaultRpcInterceptorRegistry injectee) {
    
  }
  
  private com.gwtplatform.dispatch.rpc.client.interceptor.RpcInterceptorRegistry singleton_Key$type$com$gwtplatform$dispatch$rpc$client$interceptor$RpcInterceptorRegistry$_annotation$$none$$ = null;
  
  public com.gwtplatform.dispatch.rpc.client.interceptor.RpcInterceptorRegistry get_Key$type$com$gwtplatform$dispatch$rpc$client$interceptor$RpcInterceptorRegistry$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$dispatch$rpc$client$interceptor$RpcInterceptorRegistry$_annotation$$none$$ == null) {
    com.gwtplatform.dispatch.rpc.client.interceptor.RpcInterceptorRegistry result = get_Key$type$com$gwtplatform$dispatch$rpc$client$interceptor$DefaultRpcInterceptorRegistry$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$dispatch$rpc$client$interceptor$RpcInterceptorRegistry$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$dispatch$rpc$client$interceptor$RpcInterceptorRegistry$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.rpc.client.interceptor.DefaultRpcInterceptorRegistry declared at:
   *   Implicit GWT.create binding for com.gwtplatform.dispatch.rpc.client.interceptor.DefaultRpcInterceptorRegistry
   */
  public com.gwtplatform.dispatch.rpc.client.interceptor.DefaultRpcInterceptorRegistry get_Key$type$com$gwtplatform$dispatch$rpc$client$interceptor$DefaultRpcInterceptorRegistry$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.dispatch.rpc.client.interceptor.DefaultRpcInterceptorRegistry.class);
    assert created instanceof com.gwtplatform.dispatch.rpc.client.interceptor.DefaultRpcInterceptorRegistry;
    com.gwtplatform.dispatch.rpc.client.interceptor.DefaultRpcInterceptorRegistry result = (com.gwtplatform.dispatch.rpc.client.interceptor.DefaultRpcInterceptorRegistry) created;
    
    memberInject_Key$type$com$gwtplatform$dispatch$rpc$client$interceptor$DefaultRpcInterceptorRegistry$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
