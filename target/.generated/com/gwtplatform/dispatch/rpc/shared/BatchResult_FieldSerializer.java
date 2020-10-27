package com.gwtplatform.dispatch.rpc.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BatchResult_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.ArrayList getResults(com.gwtplatform.dispatch.rpc.shared.BatchResult instance) /*-{
    return instance.@com.gwtplatform.dispatch.rpc.shared.BatchResult::results;
  }-*/;
  
  private static native void setResults(com.gwtplatform.dispatch.rpc.shared.BatchResult instance, java.util.ArrayList value) 
  /*-{
    instance.@com.gwtplatform.dispatch.rpc.shared.BatchResult::results = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.gwtplatform.dispatch.rpc.shared.BatchResult instance) throws SerializationException {
    setResults(instance, (java.util.ArrayList) streamReader.readObject());
    
  }
  
  public static com.gwtplatform.dispatch.rpc.shared.BatchResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.gwtplatform.dispatch.rpc.shared.BatchResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwtplatform.dispatch.rpc.shared.BatchResult instance) throws SerializationException {
    streamWriter.writeObject(getResults(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.gwtplatform.dispatch.rpc.shared.BatchResult_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.gwtplatform.dispatch.rpc.shared.BatchResult_FieldSerializer.deserialize(reader, (com.gwtplatform.dispatch.rpc.shared.BatchResult)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.gwtplatform.dispatch.rpc.shared.BatchResult_FieldSerializer.serialize(writer, (com.gwtplatform.dispatch.rpc.shared.BatchResult)object);
  }
  
}
