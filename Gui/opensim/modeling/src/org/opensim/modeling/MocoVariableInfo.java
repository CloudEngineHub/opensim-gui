/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Bounds on continuous variables (states, controls, multipliers, etc). For<br>
 * states, the name should correspond to a path of a state variable in the<br>
 * model. For controls, the name should correspond to a path of an actuator<br>
 * in the model, or, for controls associated with actuators that have more than<br>
 * one control, the path of an actuator in the model appended by the control<br>
 * index (e.g. "/actuator_0"). 
 */
public class MocoVariableInfo extends OpenSimObject {
  private transient long swigCPtr;

  public MocoVariableInfo(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoVariableInfo_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoVariableInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MocoVariableInfo obj) {
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
        opensimMocoJNI.delete_MocoVariableInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoVariableInfo safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoVariableInfo_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoVariableInfo(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoVariableInfo_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoVariableInfo_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoVariableInfo_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoVariableInfo(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoVariableInfo_getConcreteClassName(swigCPtr, this);
  }

  public MocoVariableInfo() {
    this(opensimMocoJNI.new_MocoVariableInfo__SWIG_0(), true);
  }

  public MocoVariableInfo(String name, MocoBounds arg1, MocoInitialBounds arg2, MocoFinalBounds arg3) {
    this(opensimMocoJNI.new_MocoVariableInfo__SWIG_1(name, MocoBounds.getCPtr(arg1), arg1, MocoInitialBounds.getCPtr(arg2), arg2, MocoFinalBounds.getCPtr(arg3), arg3), true);
  }

  /**
   *  Note: the return value is constructed fresh on every call from<br>
   *  the internal property. Avoid repeated calls to this function.
   */
  public MocoBounds getBounds() {
    return new MocoBounds(opensimMocoJNI.MocoVariableInfo_getBounds(swigCPtr, this), true);
  }

  /**
   *  
   */
  public MocoInitialBounds getInitialBounds() {
    return new MocoInitialBounds(opensimMocoJNI.MocoVariableInfo_getInitialBounds(swigCPtr, this), true);
  }

  /**
   *  
   */
  public MocoFinalBounds getFinalBounds() {
    return new MocoFinalBounds(opensimMocoJNI.MocoVariableInfo_getFinalBounds(swigCPtr, this), true);
  }

  public void setBounds(MocoBounds bounds) {
    opensimMocoJNI.MocoVariableInfo_setBounds(swigCPtr, this, MocoBounds.getCPtr(bounds), bounds);
  }

  public void setInitialBounds(MocoInitialBounds bounds) {
    opensimMocoJNI.MocoVariableInfo_setInitialBounds(swigCPtr, this, MocoInitialBounds.getCPtr(bounds), bounds);
  }

  public void setFinalBounds(MocoFinalBounds bounds) {
    opensimMocoJNI.MocoVariableInfo_setFinalBounds(swigCPtr, this, MocoFinalBounds.getCPtr(bounds), bounds);
  }

  /**
   *  Throws an exception if initial and final bounds are not within bounds.
   */
  public void validate() {
    opensimMocoJNI.MocoVariableInfo_validate(swigCPtr, this);
  }

  /**
   *  Print the bounds on this variable.
   */
  public void printDescription() {
    opensimMocoJNI.MocoVariableInfo_printDescription(swigCPtr, this);
  }

}
