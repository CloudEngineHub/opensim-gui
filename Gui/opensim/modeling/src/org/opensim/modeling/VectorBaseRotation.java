/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This is a dataless rehash of the MatrixBase class to specialize it for Vectors.<br>
 *  This mostly entails overriding a few of the methods. Note that all the MatrixBase<br>
 *  operations remain available if you static_cast&lt;&gt; this up to a MatrixBase.
 */
public class VectorBaseRotation extends MatrixBaseRotation {
  private transient long swigCPtr;

  public VectorBaseRotation(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.VectorBaseRotation_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(VectorBaseRotation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(VectorBaseRotation obj) {
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
        opensimSimbodyJNI.delete_VectorBaseRotation(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  These constructors create new VectorBase objects which own their<br>
   *  own data and are (at least by default) resizable. The resulting matrices<br>
   *  are m X 1 with the number of columns locked at 1. If there is any data<br>
   *  allocated but not explicitly initialized, that data will be uninitialized<br>
   *  garbage in Release builds but will be initialized to NaN (at a performance<br>
   *  cost) in Debug builds.<br>
   *  <br>
   *  Default constructor makes a 0x1 matrix locked at 1 column; you can<br>
   *  provide an initial allocation if you want.
   */
  public VectorBaseRotation(int m) {
    this(opensimSimbodyJNI.new_VectorBaseRotation__SWIG_0(m), true);
  }

  /**
   *  These constructors create new VectorBase objects which own their<br>
   *  own data and are (at least by default) resizable. The resulting matrices<br>
   *  are m X 1 with the number of columns locked at 1. If there is any data<br>
   *  allocated but not explicitly initialized, that data will be uninitialized<br>
   *  garbage in Release builds but will be initialized to NaN (at a performance<br>
   *  cost) in Debug builds.<br>
   *  <br>
   *  Default constructor makes a 0x1 matrix locked at 1 column; you can<br>
   *  provide an initial allocation if you want.
   */
  public VectorBaseRotation() {
    this(opensimSimbodyJNI.new_VectorBaseRotation__SWIG_1(), true);
  }

  /**
   *  Copy constructor is a deep copy (not appropriate for views!). That<br>
   *  means it creates a new, densely packed vector whose elements are<br>
   *  initialized from the source object.
   */
  public VectorBaseRotation(VectorBaseRotation source) {
    this(opensimSimbodyJNI.new_VectorBaseRotation__SWIG_2(VectorBaseRotation.getCPtr(source), source), true);
  }

  public int size() {
    return opensimSimbodyJNI.VectorBaseRotation_size(swigCPtr, this);
  }

  public int nrow() {
    return opensimSimbodyJNI.VectorBaseRotation_nrow(swigCPtr, this);
  }

  public int ncol() {
    return opensimSimbodyJNI.VectorBaseRotation_ncol(swigCPtr, this);
  }

  public VectorBaseRotation resize(int m) {
    return new VectorBaseRotation(opensimSimbodyJNI.VectorBaseRotation_resize(swigCPtr, this, m), false);
  }

  public VectorBaseRotation resizeKeep(int m) {
    return new VectorBaseRotation(opensimSimbodyJNI.VectorBaseRotation_resizeKeep(swigCPtr, this, m), false);
  }

  public void clear() {
    opensimSimbodyJNI.VectorBaseRotation_clear(swigCPtr, this);
  }

  public Rotation sum() {
    return new Rotation(opensimSimbodyJNI.VectorBaseRotation_sum(swigCPtr, this), true);
  }

}
