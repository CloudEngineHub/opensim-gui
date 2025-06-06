/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Associate a control variable with a column from the reference data. 
 */
public class MocoControlTrackingGoalReference extends OpenSimObject {
  private transient long swigCPtr;

  public MocoControlTrackingGoalReference(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoControlTrackingGoalReference_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoControlTrackingGoalReference obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MocoControlTrackingGoalReference obj) {
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
        opensimMocoJNI.delete_MocoControlTrackingGoalReference(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoControlTrackingGoalReference safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoControlTrackingGoalReference_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoControlTrackingGoalReference(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoControlTrackingGoalReference_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoControlTrackingGoalReference_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoControlTrackingGoalReference_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoControlTrackingGoalReference(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoControlTrackingGoalReference_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_reference(MocoControlTrackingGoalReference source) {
    opensimMocoJNI.MocoControlTrackingGoalReference_copyProperty_reference(swigCPtr, this, MocoControlTrackingGoalReference.getCPtr(source), source);
  }

  public String get_reference(int i) {
    return opensimMocoJNI.MocoControlTrackingGoalReference_get_reference__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_reference(int i) {
    return new SWIGTYPE_p_std__string(opensimMocoJNI.MocoControlTrackingGoalReference_upd_reference__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_reference(int i, String value) {
    opensimMocoJNI.MocoControlTrackingGoalReference_set_reference__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_reference(String value) {
    return opensimMocoJNI.MocoControlTrackingGoalReference_append_reference(swigCPtr, this, value);
  }

  public void constructProperty_reference(String initValue) {
    opensimMocoJNI.MocoControlTrackingGoalReference_constructProperty_reference(swigCPtr, this, initValue);
  }

  public String get_reference() {
    return opensimMocoJNI.MocoControlTrackingGoalReference_get_reference__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_reference() {
    return new SWIGTYPE_p_std__string(opensimMocoJNI.MocoControlTrackingGoalReference_upd_reference__SWIG_1(swigCPtr, this), false);
  }

  public void set_reference(String value) {
    opensimMocoJNI.MocoControlTrackingGoalReference_set_reference__SWIG_1(swigCPtr, this, value);
  }

  public MocoControlTrackingGoalReference() {
    this(opensimMocoJNI.new_MocoControlTrackingGoalReference__SWIG_0(), true);
  }

  /**
   *  Provide the name of a control and the label of the column from the<br>
   *     reference that this control should track. 
   */
  public MocoControlTrackingGoalReference(String name, String reference) {
    this(opensimMocoJNI.new_MocoControlTrackingGoalReference__SWIG_1(name, reference), true);
  }

}
