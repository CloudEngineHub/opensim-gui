/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * This is a derived class from the base class actuator (e.g., a torque motor, <br>
 * muscle, ...) that requires exactly one external input (control) to generate <br>
 * a scalar value force, such as a torque/force magnitude or a tension.<br>
 * <br>
 * @author Ajay Seth
 */
public class ScalarActuator extends Actuator {
  private transient long swigCPtr;

  public ScalarActuator(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ScalarActuator_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ScalarActuator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ScalarActuator obj) {
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
        opensimSimulationJNI.delete_ScalarActuator(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ScalarActuator safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ScalarActuator_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ScalarActuator(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ScalarActuator_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ScalarActuator_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ScalarActuator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ScalarActuator(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ScalarActuator_getConcreteClassName(swigCPtr, this);
  }

  /**
   *  Default is -Infinity (no limit). *
   */
  public void copyProperty_min_control(ScalarActuator source) {
    opensimSimulationJNI.ScalarActuator_copyProperty_min_control(swigCPtr, this, ScalarActuator.getCPtr(source), source);
  }

  public double get_min_control(int i) {
    return opensimSimulationJNI.ScalarActuator_get_min_control__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_min_control(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ScalarActuator_upd_min_control__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_min_control(int i, double value) {
    opensimSimulationJNI.ScalarActuator_set_min_control__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_min_control(double value) {
    return opensimSimulationJNI.ScalarActuator_append_min_control(swigCPtr, this, value);
  }

  public void constructProperty_min_control(double initValue) {
    opensimSimulationJNI.ScalarActuator_constructProperty_min_control(swigCPtr, this, initValue);
  }

  public double get_min_control() {
    return opensimSimulationJNI.ScalarActuator_get_min_control__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_min_control() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ScalarActuator_upd_min_control__SWIG_1(swigCPtr, this), false);
  }

  public void set_min_control(double value) {
    opensimSimulationJNI.ScalarActuator_set_min_control__SWIG_1(swigCPtr, this, value);
  }

  /**
   *  Default is Infinity (no limit). *
   */
  public void copyProperty_max_control(ScalarActuator source) {
    opensimSimulationJNI.ScalarActuator_copyProperty_max_control(swigCPtr, this, ScalarActuator.getCPtr(source), source);
  }

  public double get_max_control(int i) {
    return opensimSimulationJNI.ScalarActuator_get_max_control__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_max_control(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ScalarActuator_upd_max_control__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_max_control(int i, double value) {
    opensimSimulationJNI.ScalarActuator_set_max_control__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_max_control(double value) {
    return opensimSimulationJNI.ScalarActuator_append_max_control(swigCPtr, this, value);
  }

  public void constructProperty_max_control(double initValue) {
    opensimSimulationJNI.ScalarActuator_constructProperty_max_control(swigCPtr, this, initValue);
  }

  public double get_max_control() {
    return opensimSimulationJNI.ScalarActuator_get_max_control__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_max_control() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ScalarActuator_upd_max_control__SWIG_1(swigCPtr, this), false);
  }

  public void set_max_control(double value) {
    opensimSimulationJNI.ScalarActuator_set_max_control__SWIG_1(swigCPtr, this, value);
  }

  public void set_has_output_actuation(boolean value) {
    opensimSimulationJNI.ScalarActuator__has_output_actuation_set(swigCPtr, this, value);
  }

  public boolean get_has_output_actuation() {
    return opensimSimulationJNI.ScalarActuator__has_output_actuation_get(swigCPtr, this);
  }

  public void set_has_output_speed(boolean value) {
    opensimSimulationJNI.ScalarActuator__has_output_speed_set(swigCPtr, this, value);
  }

  public boolean get_has_output_speed() {
    return opensimSimulationJNI.ScalarActuator__has_output_speed_get(swigCPtr, this);
  }

  /**
   *  Convenience method to get control given scalar (double) valued control
   */
  public double getControl(State s) {
    return opensimSimulationJNI.ScalarActuator_getControl(swigCPtr, this, State.getCPtr(s), s);
  }

  public int numControls() {
    return opensimSimulationJNI.ScalarActuator_numControls(swigCPtr, this);
  }

  public void setActuation(State s, double aActuation) {
    opensimSimulationJNI.ScalarActuator_setActuation(swigCPtr, this, State.getCPtr(s), s, aActuation);
  }

  public double getActuation(State s) {
    return opensimSimulationJNI.ScalarActuator_getActuation(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getSpeed(State s) {
    return opensimSimulationJNI.ScalarActuator_getSpeed(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getPower(State s) {
    return opensimSimulationJNI.ScalarActuator_getPower(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getStress(State s) {
    return opensimSimulationJNI.ScalarActuator_getStress(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getOptimalForce() {
    return opensimSimulationJNI.ScalarActuator_getOptimalForce(swigCPtr, this);
  }

  /**
   *  Methods to manage the bounds on ScalarActuator's control 
   */
  public void setMinControl(double aMinControl) {
    opensimSimulationJNI.ScalarActuator_setMinControl(swigCPtr, this, aMinControl);
  }

  public double getMinControl() {
    return opensimSimulationJNI.ScalarActuator_getMinControl(swigCPtr, this);
  }

  public void setMaxControl(double aMaxControl) {
    opensimSimulationJNI.ScalarActuator_setMaxControl(swigCPtr, this, aMaxControl);
  }

  public double getMaxControl() {
    return opensimSimulationJNI.ScalarActuator_getMaxControl(swigCPtr, this);
  }

  /**
   * Enable/disable a ScalarActuator's override actuation.<br>
   * <br>
   * The actuation normally produced by a ScalarActuator can be overridden and<br>
   * When the ScalarActuator's actuation is overridden, the ScalarActuator will<br>
   * by default produce a constant actuation which can be set with<br>
   * setOverrideActuation().<br>
   * <br>
   * @param s    current state<br>
   * @param flag true = override ScalarActuator's output actuation<br>
   *             false = use ScalarActuator's computed force (normal operation)
   */
  public void overrideActuation(State s, boolean flag) {
    opensimSimulationJNI.ScalarActuator_overrideActuation(swigCPtr, this, State.getCPtr(s), s, flag);
  }

  /**
   *  return ScalarActuator's override status
   */
  public boolean isActuationOverridden(State s) {
    return opensimSimulationJNI.ScalarActuator_isActuationOverridden(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   * set the actuation value used when the override is true <br>
   * <br>
   * @param s      current state<br>
   * @param value  value of override actuation   
   */
  public void setOverrideActuation(State s, double value) {
    opensimSimulationJNI.ScalarActuator_setOverrideActuation(swigCPtr, this, State.getCPtr(s), s, value);
  }

  /**
   * return override actuation 
   */
  public double getOverrideActuation(State s) {
    return opensimSimulationJNI.ScalarActuator_getOverrideActuation(swigCPtr, this, State.getCPtr(s), s);
  }

}
