package com.wanfadger.gwtrpcdemo.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Todo_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getId(com.wanfadger.gwtrpcdemo.shared.Todo instance) /*-{
    return instance.@com.wanfadger.gwtrpcdemo.shared.Todo::id;
  }-*/;
  
  private static native void setId(com.wanfadger.gwtrpcdemo.shared.Todo instance, java.lang.String value) 
  /*-{
    instance.@com.wanfadger.gwtrpcdemo.shared.Todo::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.wanfadger.gwtrpcdemo.shared.Todo instance) /*-{
    return instance.@com.wanfadger.gwtrpcdemo.shared.Todo::name;
  }-*/;
  
  private static native void setName(com.wanfadger.gwtrpcdemo.shared.Todo instance, java.lang.String value) 
  /*-{
    instance.@com.wanfadger.gwtrpcdemo.shared.Todo::name = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.wanfadger.gwtrpcdemo.shared.Todo instance) throws SerializationException {
    setId(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    
  }
  
  public static com.wanfadger.gwtrpcdemo.shared.Todo instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.wanfadger.gwtrpcdemo.shared.Todo();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.wanfadger.gwtrpcdemo.shared.Todo instance) throws SerializationException {
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.wanfadger.gwtrpcdemo.shared.Todo_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.wanfadger.gwtrpcdemo.shared.Todo_FieldSerializer.deserialize(reader, (com.wanfadger.gwtrpcdemo.shared.Todo)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.wanfadger.gwtrpcdemo.shared.Todo_FieldSerializer.serialize(writer, (com.wanfadger.gwtrpcdemo.shared.Todo)object);
  }
  
}
