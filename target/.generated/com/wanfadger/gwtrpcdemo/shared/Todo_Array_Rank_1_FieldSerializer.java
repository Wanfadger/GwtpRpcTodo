package com.wanfadger.gwtrpcdemo.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Todo_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.wanfadger.gwtrpcdemo.shared.Todo[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.wanfadger.gwtrpcdemo.shared.Todo[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new com.wanfadger.gwtrpcdemo.shared.Todo[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.wanfadger.gwtrpcdemo.shared.Todo[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.wanfadger.gwtrpcdemo.shared.Todo_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.wanfadger.gwtrpcdemo.shared.Todo_Array_Rank_1_FieldSerializer.deserialize(reader, (com.wanfadger.gwtrpcdemo.shared.Todo[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.wanfadger.gwtrpcdemo.shared.Todo_Array_Rank_1_FieldSerializer.serialize(writer, (com.wanfadger.gwtrpcdemo.shared.Todo[])object);
  }
  
}
