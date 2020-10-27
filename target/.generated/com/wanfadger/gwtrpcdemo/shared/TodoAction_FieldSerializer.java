package com.wanfadger.gwtrpcdemo.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TodoAction_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getCommand(com.wanfadger.gwtrpcdemo.shared.TodoAction instance) /*-{
    return instance.@com.wanfadger.gwtrpcdemo.shared.TodoAction::command;
  }-*/;
  
  private static native void setCommand(com.wanfadger.gwtrpcdemo.shared.TodoAction instance, java.lang.String value) 
  /*-{
    instance.@com.wanfadger.gwtrpcdemo.shared.TodoAction::command = value;
  }-*/;
  
  private static native com.wanfadger.gwtrpcdemo.shared.Todo getTodo(com.wanfadger.gwtrpcdemo.shared.TodoAction instance) /*-{
    return instance.@com.wanfadger.gwtrpcdemo.shared.TodoAction::todo;
  }-*/;
  
  private static native void setTodo(com.wanfadger.gwtrpcdemo.shared.TodoAction instance, com.wanfadger.gwtrpcdemo.shared.Todo value) 
  /*-{
    instance.@com.wanfadger.gwtrpcdemo.shared.TodoAction::todo = value;
  }-*/;
  
  private static native java.util.List getTodos(com.wanfadger.gwtrpcdemo.shared.TodoAction instance) /*-{
    return instance.@com.wanfadger.gwtrpcdemo.shared.TodoAction::todos;
  }-*/;
  
  private static native void setTodos(com.wanfadger.gwtrpcdemo.shared.TodoAction instance, java.util.List value) 
  /*-{
    instance.@com.wanfadger.gwtrpcdemo.shared.TodoAction::todos = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.wanfadger.gwtrpcdemo.shared.TodoAction instance) throws SerializationException {
    setCommand(instance, streamReader.readString());
    setTodo(instance, (com.wanfadger.gwtrpcdemo.shared.Todo) streamReader.readObject());
    setTodos(instance, (java.util.List) streamReader.readObject());
    
    com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.wanfadger.gwtrpcdemo.shared.TodoAction instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.wanfadger.gwtrpcdemo.shared.TodoAction();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.wanfadger.gwtrpcdemo.shared.TodoAction instance) throws SerializationException {
    streamWriter.writeString(getCommand(instance));
    streamWriter.writeObject(getTodo(instance));
    streamWriter.writeObject(getTodos(instance));
    
    com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.wanfadger.gwtrpcdemo.shared.TodoAction_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.wanfadger.gwtrpcdemo.shared.TodoAction_FieldSerializer.deserialize(reader, (com.wanfadger.gwtrpcdemo.shared.TodoAction)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.wanfadger.gwtrpcdemo.shared.TodoAction_FieldSerializer.serialize(writer, (com.wanfadger.gwtrpcdemo.shared.TodoAction)object);
  }
  
}
