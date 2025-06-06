/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  A reporter that simply prints quantities to the console<br>
 *  (command window or terminal), perhaps to monitor the progress of a simulation <br>
 *  as it executes.<br>
 *  
 */
public class ConsoleReporterVec3 extends ReporterVec3 {
  private transient long swigCPtr;

  public ConsoleReporterVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.ConsoleReporterVec3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ConsoleReporterVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ConsoleReporterVec3 obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_ConsoleReporterVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ConsoleReporterVec3 safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.ConsoleReporterVec3_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ConsoleReporterVec3(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.ConsoleReporterVec3_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.ConsoleReporterVec3_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.ConsoleReporterVec3_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ConsoleReporterVec3(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.ConsoleReporterVec3_getConcreteClassName(swigCPtr, this);
  }

  public ConsoleReporterVec3() {
    this(opensimCommonJNI.new_ConsoleReporterVec3(), true);
  }

}
