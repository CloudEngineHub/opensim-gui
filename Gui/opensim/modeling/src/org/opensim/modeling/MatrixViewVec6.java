/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This class is identical to a Matrix_; it is used only to manage the C++ rules<br>
 *  for when copy constructors are called by introducing a separate type to<br>
 *  prevent certain allowed optimizations from occuring when we don't want them.<br>
 *  Despite the name, this may be an owner if a Matrix_ is recast to a MatrixView_.<br>
 *  However, there are no owner constructors for MatrixView_. 
 */
public class MatrixViewVec6 extends MatrixBaseVec6 {
  private transient long swigCPtr;

  public MatrixViewVec6(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.MatrixViewVec6_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MatrixViewVec6 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MatrixViewVec6 obj) {
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
        opensimSimbodyJNI.delete_MatrixViewVec6(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MatrixViewVec6(MatrixViewVec6 m) {
    this(opensimSimbodyJNI.new_MatrixViewVec6(MatrixViewVec6.getCPtr(m), m), true);
  }

}
