/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class HopperDevice extends ModelComponent {
  private transient long swigCPtr;

  public HopperDevice(long cPtr, boolean cMemoryOwn) {
    super(opensimExampleComponentsJNI.HopperDevice_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HopperDevice obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(HopperDevice obj) {
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
        opensimExampleComponentsJNI.delete_HopperDevice(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static HopperDevice safeDownCast(OpenSimObject obj) {
    long cPtr = opensimExampleComponentsJNI.HopperDevice_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new HopperDevice(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimExampleComponentsJNI.HopperDevice_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimExampleComponentsJNI.HopperDevice_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimExampleComponentsJNI.HopperDevice_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new HopperDevice(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimExampleComponentsJNI.HopperDevice_getConcreteClassName(swigCPtr, this);
  }

  public void set_has_output_length(boolean value) {
    opensimExampleComponentsJNI.HopperDevice__has_output_length_set(swigCPtr, this, value);
  }

  public boolean get_has_output_length() {
    return opensimExampleComponentsJNI.HopperDevice__has_output_length_get(swigCPtr, this);
  }

  public void set_has_output_speed(boolean value) {
    opensimExampleComponentsJNI.HopperDevice__has_output_speed_set(swigCPtr, this, value);
  }

  public boolean get_has_output_speed() {
    return opensimExampleComponentsJNI.HopperDevice__has_output_speed_get(swigCPtr, this);
  }

  public void set_has_output_tension(boolean value) {
    opensimExampleComponentsJNI.HopperDevice__has_output_tension_set(swigCPtr, this, value);
  }

  public boolean get_has_output_tension() {
    return opensimExampleComponentsJNI.HopperDevice__has_output_tension_get(swigCPtr, this);
  }

  public void set_has_output_power(boolean value) {
    opensimExampleComponentsJNI.HopperDevice__has_output_power_set(swigCPtr, this, value);
  }

  public boolean get_has_output_power() {
    return opensimExampleComponentsJNI.HopperDevice__has_output_power_get(swigCPtr, this);
  }

  public void set_has_output_height(boolean value) {
    opensimExampleComponentsJNI.HopperDevice__has_output_height_set(swigCPtr, this, value);
  }

  public boolean get_has_output_height() {
    return opensimExampleComponentsJNI.HopperDevice__has_output_height_get(swigCPtr, this);
  }

  public void set_has_output_com_height(boolean value) {
    opensimExampleComponentsJNI.HopperDevice__has_output_com_height_set(swigCPtr, this, value);
  }

  public boolean get_has_output_com_height() {
    return opensimExampleComponentsJNI.HopperDevice__has_output_com_height_get(swigCPtr, this);
  }

  public void copyProperty_actuator_name(HopperDevice source) {
    opensimExampleComponentsJNI.HopperDevice_copyProperty_actuator_name(swigCPtr, this, HopperDevice.getCPtr(source), source);
  }

  public String get_actuator_name(int i) {
    return opensimExampleComponentsJNI.HopperDevice_get_actuator_name__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_actuator_name(int i) {
    return new SWIGTYPE_p_std__string(opensimExampleComponentsJNI.HopperDevice_upd_actuator_name__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_actuator_name(int i, String value) {
    opensimExampleComponentsJNI.HopperDevice_set_actuator_name__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_actuator_name(String value) {
    return opensimExampleComponentsJNI.HopperDevice_append_actuator_name(swigCPtr, this, value);
  }

  public void constructProperty_actuator_name(String initValue) {
    opensimExampleComponentsJNI.HopperDevice_constructProperty_actuator_name(swigCPtr, this, initValue);
  }

  public String get_actuator_name() {
    return opensimExampleComponentsJNI.HopperDevice_get_actuator_name__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_actuator_name() {
    return new SWIGTYPE_p_std__string(opensimExampleComponentsJNI.HopperDevice_upd_actuator_name__SWIG_1(swigCPtr, this), false);
  }

  public void set_actuator_name(String value) {
    opensimExampleComponentsJNI.HopperDevice_set_actuator_name__SWIG_1(swigCPtr, this, value);
  }

  public HopperDevice() {
    this(opensimExampleComponentsJNI.new_HopperDevice(), true);
  }

  public double getLength(State s) {
    return opensimExampleComponentsJNI.HopperDevice_getLength(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getSpeed(State s) {
    return opensimExampleComponentsJNI.HopperDevice_getSpeed(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getTension(State s) {
    return opensimExampleComponentsJNI.HopperDevice_getTension(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getPower(State s) {
    return opensimExampleComponentsJNI.HopperDevice_getPower(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getHeight(State s) {
    return opensimExampleComponentsJNI.HopperDevice_getHeight(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getCenterOfMassHeight(State s) {
    return opensimExampleComponentsJNI.HopperDevice_getCenterOfMassHeight(swigCPtr, this, State.getCPtr(s), s);
  }

}
