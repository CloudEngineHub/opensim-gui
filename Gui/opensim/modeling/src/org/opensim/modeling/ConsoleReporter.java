/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ConsoleReporter extends ReporterDouble {
  private transient long swigCPtr;

  public ConsoleReporter(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.ConsoleReporter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ConsoleReporter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_ConsoleReporter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ConsoleReporter safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.ConsoleReporter_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ConsoleReporter(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.ConsoleReporter_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.ConsoleReporter_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.ConsoleReporter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ConsoleReporter(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.ConsoleReporter_getConcreteClassName(swigCPtr, this);
  }

  public ConsoleReporter() {
    this(opensimCommonJNI.new_ConsoleReporter(), true);
  }

}