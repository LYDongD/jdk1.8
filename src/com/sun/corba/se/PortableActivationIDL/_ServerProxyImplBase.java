package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/_ServerProxyImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-macosx-x86_64/jdk8u73/6086/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Friday, January 29, 2016 3:03:46 PM PST
*/


/** Server callback interface, passed to Activator in registerServer method.
    */
public abstract class _ServerProxyImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements com.sun.corba.se.PortableActivationIDL.ServerProxy, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _ServerProxyImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("shutdown", new java.lang.Integer (0));
    _methods.put ("install", new java.lang.Integer (1));
    _methods.put ("uninstall", new java.lang.Integer (2));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /** Shutdown this server.  Returns after orb.shutdown() completes.
  	*/
       case 0:  // PortableActivationIDL/ServerProxy/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }


  /** Install the server.  Returns after the install hook completes
  	* execution in the server.
  	*/
       case 1:  // PortableActivationIDL/ServerProxy/install
       {
         this.install ();
         out = $rh.createReply();
         break;
       }


  /** Uninstall the server.  Returns after the uninstall hook
  	* completes execution.
  	*/
       case 2:  // PortableActivationIDL/ServerProxy/uninstall
       {
         this.uninstall ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:PortableActivationIDL/ServerProxy:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _ServerProxyImplBase
