/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class that represents a constant control curve.  That is, the value<br>
 * of the control curve is the same at any value of time.<br>
 * <br>
 * @author Frank C. Anderson<br>
 * @version 1.0
 */
public class ControlConstant extends Control {
  private transient long swigCPtr;

  public ControlConstant(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ControlConstant_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ControlConstant obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ControlConstant obj) {
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
        opensimSimulationJNI.delete_ControlConstant(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ControlConstant safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ControlConstant_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ControlConstant(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ControlConstant_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ControlConstant_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ControlConstant_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ControlConstant(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ControlConstant_getConcreteClassName(swigCPtr, this);
  }

  public int getNumParameters() {
    return opensimSimulationJNI.ControlConstant_getNumParameters(swigCPtr, this);
  }

  public void setParameterMin(int aI, double aMin) {
    opensimSimulationJNI.ControlConstant_setParameterMin(swigCPtr, this, aI, aMin);
  }

  public double getParameterMin(int aI) {
    return opensimSimulationJNI.ControlConstant_getParameterMin(swigCPtr, this, aI);
  }

  public void setParameterMax(int aI, double aMax) {
    opensimSimulationJNI.ControlConstant_setParameterMax(swigCPtr, this, aI, aMax);
  }

  public double getParameterMax(int aI) {
    return opensimSimulationJNI.ControlConstant_getParameterMax(swigCPtr, this, aI);
  }

  /**
   * For ControlConstant, parameters are not associated with any specific time.<br>
   * <br>
   * @param aI Index of the parameter.<br>
   * @return SimTK::NaN
   */
  public double getParameterTime(int aI) {
    return opensimSimulationJNI.ControlConstant_getParameterTime(swigCPtr, this, aI);
  }

  /**
   * @param aI Index of the parameter.<br>
   * @param rTLower -%SimTK::Infinity<br>
   * @param rTUpper %SimTK::Infinity
   */
  public void getParameterNeighborhood(int aI, SWIGTYPE_p_double rTLower, SWIGTYPE_p_double rTUpper) {
    opensimSimulationJNI.ControlConstant_getParameterNeighborhood(swigCPtr, this, aI, SWIGTYPE_p_double.getCPtr(rTLower), SWIGTYPE_p_double.getCPtr(rTUpper));
  }

  /**
   * @param aT time<br>
   * @param rList Parameter at index 0 (i.e., the value of the constant)<br>
   * is the only parameter on the list.
   */
  public int getParameterList(double aT, ArrayInt rList) {
    return opensimSimulationJNI.ControlConstant_getParameterList__SWIG_0(swigCPtr, this, aT, ArrayInt.getCPtr(rList), rList);
  }

  public int getParameterList(double aT1, double aT2, ArrayInt rList) {
    return opensimSimulationJNI.ControlConstant_getParameterList__SWIG_1(swigCPtr, this, aT1, aT2, ArrayInt.getCPtr(rList), rList);
  }

  /**
   * @param aI Only 0 is valid for ControlConstant.<br>
   * @param aX The constant value of this control curve.
   */
  public void setParameterValue(int aI, double aX) {
    opensimSimulationJNI.ControlConstant_setParameterValue(swigCPtr, this, aI, aX);
  }

  /**
   * @see setParameterValue()<br>
   * @param aI Only 0 is valid for ControlConstant.<br>
   * @return The constant value of this control curve.
   */
  public double getParameterValue(int aI) {
    return opensimSimulationJNI.ControlConstant_getParameterValue(swigCPtr, this, aI);
  }

  /**
   * @param aT Not used since the control value is constant in time.<br>
   * @param aX Control value.
   */
  public void setControlValue(double aT, double aX) {
    opensimSimulationJNI.ControlConstant_setControlValue(swigCPtr, this, aT, aX);
  }

  /**
   * @param aT Not used since the control value is constant in time.
   */
  public double getControlValue(double aT) {
    return opensimSimulationJNI.ControlConstant_getControlValue(swigCPtr, this, aT);
  }

  public double getControlValueMin(double aT) {
    return opensimSimulationJNI.ControlConstant_getControlValueMin__SWIG_0(swigCPtr, this, aT);
  }

  public double getControlValueMin() {
    return opensimSimulationJNI.ControlConstant_getControlValueMin__SWIG_1(swigCPtr, this);
  }

  public void setControlValueMin(double aT, double aX) {
    opensimSimulationJNI.ControlConstant_setControlValueMin(swigCPtr, this, aT, aX);
  }

  public double getControlValueMax(double aT) {
    return opensimSimulationJNI.ControlConstant_getControlValueMax__SWIG_0(swigCPtr, this, aT);
  }

  public double getControlValueMax() {
    return opensimSimulationJNI.ControlConstant_getControlValueMax__SWIG_1(swigCPtr, this);
  }

  public void setControlValueMax(double aT, double aX) {
    opensimSimulationJNI.ControlConstant_setControlValueMax(swigCPtr, this, aT, aX);
  }

}
