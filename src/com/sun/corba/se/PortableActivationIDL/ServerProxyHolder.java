package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/ServerProxyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-macosx-x86_64/jdk8u73/6086/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Friday, January 29, 2016 3:03:46 PM PST
*/


/** Server callback interface, passed to Activator in registerServer method.
    */
public final class ServerProxyHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.ServerProxy value = null;

  public ServerProxyHolder ()
  {
  }

  public ServerProxyHolder (com.sun.corba.se.PortableActivationIDL.ServerProxy initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.ServerProxyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.ServerProxyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.ServerProxyHelper.type ();
  }

}
