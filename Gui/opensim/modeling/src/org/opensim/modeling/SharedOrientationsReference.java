/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SharedOrientationsReference {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public SharedOrientationsReference(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SharedOrientationsReference obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(SharedOrientationsReference obj) {
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

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_SharedOrientationsReference(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SharedOrientationsReference() {
    this(opensimSimulationJNI.new_SharedOrientationsReference(), true);
  }

}