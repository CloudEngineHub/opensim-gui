/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This Force subclass implements an elastic foundation contact model. It <br>
 * places a spring at the center of each face of each ContactMesh it acts on.  <br>
 * Those springs interact with all objects (both meshes and other objects) the <br>
 * mesh comes in contact with.<br>
 * <br>
 * @author Peter Eastman *
 */
public class ElasticFoundationForce extends Force {
  private transient long swigCPtr;

  public ElasticFoundationForce(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ElasticFoundationForce_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ElasticFoundationForce obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ElasticFoundationForce obj) {
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
        opensimSimulationJNI.delete_ElasticFoundationForce(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ElasticFoundationForce safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ElasticFoundationForce_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ElasticFoundationForce(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ElasticFoundationForce_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ElasticFoundationForce_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ElasticFoundationForce_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ElasticFoundationForce(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ElasticFoundationForce_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_contact_parameters(ElasticFoundationForce source) {
    opensimSimulationJNI.ElasticFoundationForce_copyProperty_contact_parameters(swigCPtr, this, ElasticFoundationForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet get_contact_parameters(int i) {
    return new SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet(opensimSimulationJNI.ElasticFoundationForce_get_contact_parameters__SWIG_0(swigCPtr, this, i), false);
  }

  public SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet upd_contact_parameters(int i) {
    return new SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet(opensimSimulationJNI.ElasticFoundationForce_upd_contact_parameters__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_contact_parameters(int i, SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet value) {
    opensimSimulationJNI.ElasticFoundationForce_set_contact_parameters__SWIG_0(swigCPtr, this, i, SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet.getCPtr(value));
  }

  public int append_contact_parameters(SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet value) {
    return opensimSimulationJNI.ElasticFoundationForce_append_contact_parameters(swigCPtr, this, SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet.getCPtr(value));
  }

  public void constructProperty_contact_parameters(SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet initValue) {
    opensimSimulationJNI.ElasticFoundationForce_constructProperty_contact_parameters(swigCPtr, this, SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet.getCPtr(initValue));
  }

  public SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet get_contact_parameters() {
    return new SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet(opensimSimulationJNI.ElasticFoundationForce_get_contact_parameters__SWIG_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet upd_contact_parameters() {
    return new SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet(opensimSimulationJNI.ElasticFoundationForce_upd_contact_parameters__SWIG_1(swigCPtr, this), false);
  }

  public void set_contact_parameters(SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet value) {
    opensimSimulationJNI.ElasticFoundationForce_set_contact_parameters__SWIG_1(swigCPtr, this, SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet.getCPtr(value));
  }

  public void copyProperty_transition_velocity(ElasticFoundationForce source) {
    opensimSimulationJNI.ElasticFoundationForce_copyProperty_transition_velocity(swigCPtr, this, ElasticFoundationForce.getCPtr(source), source);
  }

  public double get_transition_velocity(int i) {
    return opensimSimulationJNI.ElasticFoundationForce_get_transition_velocity__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_transition_velocity(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ElasticFoundationForce_upd_transition_velocity__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_transition_velocity(int i, double value) {
    opensimSimulationJNI.ElasticFoundationForce_set_transition_velocity__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_transition_velocity(double value) {
    return opensimSimulationJNI.ElasticFoundationForce_append_transition_velocity(swigCPtr, this, value);
  }

  public void constructProperty_transition_velocity(double initValue) {
    opensimSimulationJNI.ElasticFoundationForce_constructProperty_transition_velocity(swigCPtr, this, initValue);
  }

  public double get_transition_velocity() {
    return opensimSimulationJNI.ElasticFoundationForce_get_transition_velocity__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_transition_velocity() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ElasticFoundationForce_upd_transition_velocity__SWIG_1(swigCPtr, this), false);
  }

  public void set_transition_velocity(double value) {
    opensimSimulationJNI.ElasticFoundationForce_set_transition_velocity__SWIG_1(swigCPtr, this, value);
  }

  public ElasticFoundationForce() {
    this(opensimSimulationJNI.new_ElasticFoundationForce__SWIG_0(), true);
  }

  public ElasticFoundationForce(SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParameters params) {
    this(opensimSimulationJNI.new_ElasticFoundationForce__SWIG_1(SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParameters.getCPtr(params)), true);
  }

  /**
   * Create a SimTK::Force which implements this Force.
   */
  public void extendAddToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimSimulationJNI.ElasticFoundationForce_extendAddToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet updContactParametersSet() {
    return new SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet(opensimSimulationJNI.ElasticFoundationForce_updContactParametersSet(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet getContactParametersSet() {
    return new SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParametersSet(opensimSimulationJNI.ElasticFoundationForce_getContactParametersSet(swigCPtr, this), false);
  }

  /**
   *  Takes over ownership of the passed-in object. *
   */
  public void addContactParameters(SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParameters params) {
    opensimSimulationJNI.ElasticFoundationForce_addContactParameters(swigCPtr, this, SWIGTYPE_p_OpenSim__ElasticFoundationForce__ContactParameters.getCPtr(params));
  }

  /**
   * Get the transition velocity for switching between static and dynamic friction.
   */
  public double getTransitionVelocity() {
    return opensimSimulationJNI.ElasticFoundationForce_getTransitionVelocity(swigCPtr, this);
  }

  /**
   * %Set the transition velocity for switching between static and dynamic friction.
   */
  public void setTransitionVelocity(double velocity) {
    opensimSimulationJNI.ElasticFoundationForce_setTransitionVelocity(swigCPtr, this, velocity);
  }

  /**
   * Access to ContactParameters. Methods assume size 1 of ContactParametersSet and add one ContactParameter if needed
   */
  public double getStiffness() {
    return opensimSimulationJNI.ElasticFoundationForce_getStiffness(swigCPtr, this);
  }

  public void setStiffness(double stiffness) {
    opensimSimulationJNI.ElasticFoundationForce_setStiffness(swigCPtr, this, stiffness);
  }

  public double getDissipation() {
    return opensimSimulationJNI.ElasticFoundationForce_getDissipation(swigCPtr, this);
  }

  public void setDissipation(double dissipation) {
    opensimSimulationJNI.ElasticFoundationForce_setDissipation(swigCPtr, this, dissipation);
  }

  public double getStaticFriction() {
    return opensimSimulationJNI.ElasticFoundationForce_getStaticFriction(swigCPtr, this);
  }

  public void setStaticFriction(double friction) {
    opensimSimulationJNI.ElasticFoundationForce_setStaticFriction(swigCPtr, this, friction);
  }

  public double getDynamicFriction() {
    return opensimSimulationJNI.ElasticFoundationForce_getDynamicFriction(swigCPtr, this);
  }

  public void setDynamicFriction(double friction) {
    opensimSimulationJNI.ElasticFoundationForce_setDynamicFriction(swigCPtr, this, friction);
  }

  public double getViscousFriction() {
    return opensimSimulationJNI.ElasticFoundationForce_getViscousFriction(swigCPtr, this);
  }

  public void setViscousFriction(double friction) {
    opensimSimulationJNI.ElasticFoundationForce_setViscousFriction(swigCPtr, this, friction);
  }

  public void addGeometry(String name) {
    opensimSimulationJNI.ElasticFoundationForce_addGeometry(swigCPtr, this, name);
  }

  /**
   * Provide name(s) of the quantities (column labels) of the force value(s) to be reported
   */
  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimSimulationJNI.ElasticFoundationForce_getRecordLabels(swigCPtr, this), true);
  }

  /**
   *  Provide the value(s) to be reported that correspond to the labels
   */
  public ArrayDouble getRecordValues(State state) {
    return new ArrayDouble(opensimSimulationJNI.ElasticFoundationForce_getRecordValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

}
