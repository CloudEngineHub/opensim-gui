/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * SystemEnergyProbe is a ModelComponent Probe for computing an operation on a <br>
 * total system energy during a simulation.<br>
 * E.g. Work is the integral of power with respect to time.<br>
 * <br>
 * @author Tim Dorn
 */
public class SystemEnergyProbe extends Probe {
  private transient long swigCPtr;

  public SystemEnergyProbe(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.SystemEnergyProbe_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SystemEnergyProbe obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(SystemEnergyProbe obj) {
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
        opensimSimulationJNI.delete_SystemEnergyProbe(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SystemEnergyProbe safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.SystemEnergyProbe_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SystemEnergyProbe(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.SystemEnergyProbe_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.SystemEnergyProbe_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.SystemEnergyProbe_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SystemEnergyProbe(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.SystemEnergyProbe_getConcreteClassName(swigCPtr, this);
  }

  /**
   *  Default is true. *
   */
  public void copyProperty_compute_kinetic_energy(SystemEnergyProbe source) {
    opensimSimulationJNI.SystemEnergyProbe_copyProperty_compute_kinetic_energy(swigCPtr, this, SystemEnergyProbe.getCPtr(source), source);
  }

  public boolean get_compute_kinetic_energy(int i) {
    return opensimSimulationJNI.SystemEnergyProbe_get_compute_kinetic_energy__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_compute_kinetic_energy(int i) {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.SystemEnergyProbe_upd_compute_kinetic_energy__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_compute_kinetic_energy(int i, boolean value) {
    opensimSimulationJNI.SystemEnergyProbe_set_compute_kinetic_energy__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_compute_kinetic_energy(boolean value) {
    return opensimSimulationJNI.SystemEnergyProbe_append_compute_kinetic_energy(swigCPtr, this, value);
  }

  public void constructProperty_compute_kinetic_energy(boolean initValue) {
    opensimSimulationJNI.SystemEnergyProbe_constructProperty_compute_kinetic_energy(swigCPtr, this, initValue);
  }

  public boolean get_compute_kinetic_energy() {
    return opensimSimulationJNI.SystemEnergyProbe_get_compute_kinetic_energy__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_compute_kinetic_energy() {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.SystemEnergyProbe_upd_compute_kinetic_energy__SWIG_1(swigCPtr, this), false);
  }

  public void set_compute_kinetic_energy(boolean value) {
    opensimSimulationJNI.SystemEnergyProbe_set_compute_kinetic_energy__SWIG_1(swigCPtr, this, value);
  }

  /**
   *  Default is true. *
   */
  public void copyProperty_compute_potential_energy(SystemEnergyProbe source) {
    opensimSimulationJNI.SystemEnergyProbe_copyProperty_compute_potential_energy(swigCPtr, this, SystemEnergyProbe.getCPtr(source), source);
  }

  public boolean get_compute_potential_energy(int i) {
    return opensimSimulationJNI.SystemEnergyProbe_get_compute_potential_energy__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_compute_potential_energy(int i) {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.SystemEnergyProbe_upd_compute_potential_energy__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_compute_potential_energy(int i, boolean value) {
    opensimSimulationJNI.SystemEnergyProbe_set_compute_potential_energy__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_compute_potential_energy(boolean value) {
    return opensimSimulationJNI.SystemEnergyProbe_append_compute_potential_energy(swigCPtr, this, value);
  }

  public void constructProperty_compute_potential_energy(boolean initValue) {
    opensimSimulationJNI.SystemEnergyProbe_constructProperty_compute_potential_energy(swigCPtr, this, initValue);
  }

  public boolean get_compute_potential_energy() {
    return opensimSimulationJNI.SystemEnergyProbe_get_compute_potential_energy__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_compute_potential_energy() {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.SystemEnergyProbe_upd_compute_potential_energy__SWIG_1(swigCPtr, this), false);
  }

  public void set_compute_potential_energy(boolean value) {
    opensimSimulationJNI.SystemEnergyProbe_set_compute_potential_energy__SWIG_1(swigCPtr, this, value);
  }

  /**
   *  Default constructor 
   */
  public SystemEnergyProbe() {
    this(opensimSimulationJNI.new_SystemEnergyProbe__SWIG_0(), true);
  }

  /**
   *  Convenience constructor 
   */
  public SystemEnergyProbe(boolean computeKE, boolean computePE) {
    this(opensimSimulationJNI.new_SystemEnergyProbe__SWIG_1(computeKE, computePE), true);
  }

  /**
   *  Returns whether kinetic energy is to be included in the system energy <br>
   *     computation. 
   */
  public boolean getComputeKineticEnergy() {
    return opensimSimulationJNI.SystemEnergyProbe_getComputeKineticEnergy(swigCPtr, this);
  }

  /**
   *  Returns whether potential energy is to be included in the system energy <br>
   *     computation. 
   */
  public boolean getComputePotentialEnergy() {
    return opensimSimulationJNI.SystemEnergyProbe_getComputePotentialEnergy(swigCPtr, this);
  }

  /**
   *  Sets whether kinetic energy is to be included in the system energy <br>
   *     computation. 
   */
  public void setComputeKineticEnergy(boolean c) {
    opensimSimulationJNI.SystemEnergyProbe_setComputeKineticEnergy(swigCPtr, this, c);
  }

  /**
   *  Sets whether potential energy is to be included in the system energy <br>
   *     computation. 
   */
  public void setComputePotentialEnergy(boolean c) {
    opensimSimulationJNI.SystemEnergyProbe_setComputePotentialEnergy(swigCPtr, this, c);
  }

  /**
   *  Compute the System energy which the Probe operation will be based on. 
   */
  public Vector computeProbeInputs(State state) {
    return new Vector(opensimSimulationJNI.SystemEnergyProbe_computeProbeInputs(swigCPtr, this, State.getCPtr(state), state), true);
  }

  /**
   *  Returns the number of probe inputs in the vector returned by computeProbeInputs(). 
   */
  public int getNumProbeInputs() {
    return opensimSimulationJNI.SystemEnergyProbe_getNumProbeInputs(swigCPtr, this);
  }

  /**
   *  Returns the column labels of the probe values for reporting. <br>
   *         Currently uses the Probe name as the column label, so be sure<br>
   *         to name your probe appropriately! 
   */
  public ArrayStr getProbeOutputLabels() {
    return new ArrayStr(opensimSimulationJNI.SystemEnergyProbe_getProbeOutputLabels(swigCPtr, this), true);
  }

}
