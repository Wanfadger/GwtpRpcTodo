package com.gwtplatform.dispatch.rpc.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class MultipleResult_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.ArrayList getValue(com.gwtplatform.dispatch.rpc.shared.MultipleResult instance) /*-{
    return instance.@com.gwtplatform.dispatch.rpc.shared.MultipleResult::value;
  }-*/;
  
  private static native void setValue(com.gwtplatform.dispatch.rpc.shared.MultipleResult instance, java.util.ArrayList value) 
  /*-{
    instance.@com.gwtplatform.dispatch.rpc.shared.MultipleResult::value = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.gwtplatform.dispatch.rpc.shared.MultipleResult instance) throws SerializationException {
    setValue(instance, (java.util.ArrayList) streamReader.readObject());
    
  }
  
  public static com.gwtplatform.dispatch.rpc.shared.MultipleResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.gwtplatform.dispatch.rpc.shared.MultipleResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwtplatform.dispatch.rpc.shared.MultipleResult instance) throws SerializationException {
    streamWriter.writeObject(getValue(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.gwtplatform.dispatch.rpc.shared.MultipleResult_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.gwtplatform.dispatch.rpc.shared.MultipleResult_FieldSerializer.deserialize(reader, (com.gwtplatform.dispatch.rpc.shared.MultipleResult)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.gwtplatform.dispatch.rpc.shared.MultipleResult_FieldSerializer.serialize(writer, (com.gwtplatform.dispatch.rpc.shared.MultipleResult)object);
  }
  
}
