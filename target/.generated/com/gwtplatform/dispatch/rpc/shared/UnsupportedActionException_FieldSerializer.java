package com.gwtplatform.dispatch.rpc.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class UnsupportedActionException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.gwtplatform.dispatch.rpc.shared.UnsupportedActionException instance) throws SerializationException {
    
    com.gwtplatform.dispatch.rpc.shared.ServiceException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.gwtplatform.dispatch.rpc.shared.UnsupportedActionException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.gwtplatform.dispatch.rpc.shared.UnsupportedActionException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwtplatform.dispatch.rpc.shared.UnsupportedActionException instance) throws SerializationException {
    
    com.gwtplatform.dispatch.rpc.shared.ServiceException_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.gwtplatform.dispatch.rpc.shared.UnsupportedActionException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.gwtplatform.dispatch.rpc.shared.UnsupportedActionException_FieldSerializer.deserialize(reader, (com.gwtplatform.dispatch.rpc.shared.UnsupportedActionException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.gwtplatform.dispatch.rpc.shared.UnsupportedActionException_FieldSerializer.serialize(writer, (com.gwtplatform.dispatch.rpc.shared.UnsupportedActionException)object);
  }
  
}
