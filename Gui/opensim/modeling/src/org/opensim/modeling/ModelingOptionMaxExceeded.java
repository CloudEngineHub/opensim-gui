/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelingOptionMaxExceeded extends OpenSimException {
  private transient long swigCPtr;

  public ModelingOptionMaxExceeded(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.ModelingOptionMaxExceeded_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelingOptionMaxExceeded obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ModelingOptionMaxExceeded obj) {
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
        opensimCommonJNI.delete_ModelingOptionMaxExceeded(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ModelingOptionMaxExceeded(String file, long line, String methodName, String componentName, String moName, int flag, int max) {
    this(opensimCommonJNI.new_ModelingOptionMaxExceeded(file, line, methodName, componentName, moName, flag, max), true);
  }

}
