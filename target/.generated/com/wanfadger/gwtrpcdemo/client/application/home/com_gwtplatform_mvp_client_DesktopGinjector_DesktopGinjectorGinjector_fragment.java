package com.wanfadger.gwtrpcdemo.client.application.home;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$MyProxy$_annotation$$none$$(com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$_annotation$$none$$(com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePageView$Binder$_annotation$$none$$(com.wanfadger.gwtrpcdemo.client.application.home.HomePageView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePageView$_annotation$$none$$(com.wanfadger.gwtrpcdemo.client.application.home.HomePageView injectee) {
    
  }
  
  
  /**
   * Binding for com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter.MyView get_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$MyView$_annotation$$none$$() {
    com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter.MyView result = get_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePageView$_annotation$$none$$();
    return result;
    
  }
  
  private com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter.MyProxy singleton_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter.MyProxy get_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter.MyProxy.class);
    assert created instanceof com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter.MyProxy;
    com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter.MyProxy result = (com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter.MyProxy) created;
    
    memberInject_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter singleton_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$_annotation$$none$$ = null;
  
  public com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter get_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$_annotation$$none$$ == null) {
    com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter result = com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter_com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$MyView$_annotation$$none$$(), get_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$MyProxy$_annotation$$none$$(), injector.getFragment_com_gwtplatform_dispatch_rpc_shared().get_Key$type$com$gwtplatform$dispatch$rpc$shared$DispatchAsync$_annotation$$none$$());
    memberInject_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$_annotation$$none$$;
    
  }
  
  public com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter_com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter.MyView _1, com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter.MyProxy _2, com.gwtplatform.dispatch.rpc.shared.DispatchAsync _3) {
    return new com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter(_0, _1, _2, _3);
  }
  
  
  /**
   * Binding for com.google.inject.Provider<com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter> declared at:
   *   Implicit provider for com.google.inject.Provider<com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter>
   */
  public com.google.inject.Provider<com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter> get_Key$type$com$google$inject$Provider$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$$_annotation$$none$$() {
    com.google.inject.Provider<com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter> result = new com.google.inject.Provider<com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter>() { 
      public com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter get() { 
        return get_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$_annotation$$none$$();
      }
    };
    return result;
    
  }
  
  
  /**
   * Binding for com.wanfadger.gwtrpcdemo.client.application.home.HomePageView$Binder declared at:
   *   Implicit GWT.create binding for com.wanfadger.gwtrpcdemo.client.application.home.HomePageView$Binder
   */
  public com.wanfadger.gwtrpcdemo.client.application.home.HomePageView.Binder get_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePageView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.wanfadger.gwtrpcdemo.client.application.home.HomePageView.Binder.class);
    assert created instanceof com.wanfadger.gwtrpcdemo.client.application.home.HomePageView.Binder;
    com.wanfadger.gwtrpcdemo.client.application.home.HomePageView.Binder result = (com.wanfadger.gwtrpcdemo.client.application.home.HomePageView.Binder) created;
    
    memberInject_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePageView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.wanfadger.gwtrpcdemo.client.application.home.HomePageView singleton_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePageView$_annotation$$none$$ = null;
  
  public com.wanfadger.gwtrpcdemo.client.application.home.HomePageView get_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePageView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePageView$_annotation$$none$$ == null) {
    com.wanfadger.gwtrpcdemo.client.application.home.HomePageView result = com$wanfadger$gwtrpcdemo$client$application$home$HomePageView_com$wanfadger$gwtrpcdemo$client$application$home$HomePageView_methodInjection(get_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePageView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePageView$_annotation$$none$$(result);
    
        singleton_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePageView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePageView$_annotation$$none$$;
    
  }
  
  public com.wanfadger.gwtrpcdemo.client.application.home.HomePageView com$wanfadger$gwtrpcdemo$client$application$home$HomePageView_com$wanfadger$gwtrpcdemo$client$application$home$HomePageView_methodInjection(com.wanfadger.gwtrpcdemo.client.application.home.HomePageView.Binder _0) {
    return new com.wanfadger.gwtrpcdemo.client.application.home.HomePageView(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector) {
    this.injector = injector;
  }
  
  public void initializeEagerSingletons() {
    // Eager singleton bound at:
    //   Implicit GWT.create binding for com.wanfadger.gwtrpcdemo.client.application.home.HomePagePresenter$MyProxy
    get_Key$type$com$wanfadger$gwtrpcdemo$client$application$home$HomePagePresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
