/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This is the Vector class intended to appear in user code. It can be a <br>
 *  fixed-size view of someone else's data, or can be a resizable data owner <br>
 *  itself, although of course it will always have just one column.
 */
public class VectorVec6 extends VectorBaseVec6 {
  private transient long swigCPtr;

  public VectorVec6(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.VectorVec6_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(VectorVec6 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(VectorVec6 obj) {
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
        opensimSimbodyJNI.delete_VectorVec6(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VectorVec6() {
    this(opensimSimbodyJNI.new_VectorVec6__SWIG_0(), true);
  }

  public VectorVec6(VectorVec6 src) {
    this(opensimSimbodyJNI.new_VectorVec6__SWIG_1(VectorVec6.getCPtr(src), src), true);
  }

  public VectorVec6(int m, Vec6 initialValue) {
    this(opensimSimbodyJNI.new_VectorVec6__SWIG_2(m, Vec6.getCPtr(initialValue), initialValue), true);
  }

  public String toString() {
    return opensimSimbodyJNI.VectorVec6_toString(swigCPtr, this);
  }

  /**
   *  Variant of operator[] that's scripting friendly to get ith entry *
   */
  public Vec6 get(int i) {
    return new Vec6(opensimSimbodyJNI.VectorVec6_get(swigCPtr, this, i), false);
  }

  /**
   *  Variant of operator[] that's scripting friendly to set ith entry *
   */
  public void set(int i, Vec6 value) {
    opensimSimbodyJNI.VectorVec6_set(swigCPtr, this, i, Vec6.getCPtr(value), value);
  }

}
