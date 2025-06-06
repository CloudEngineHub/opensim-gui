/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A base class for modeling a muscle-tendon actuator. It defines muscle parameters<br>
 * and methods to PathActuator, but does not implement all of the necessary methods,<br>
 * and remains an abstract class. The path information for a muscle is contained<br>
 * in PathActuator, and the force-generating behavior should be defined in<br>
 * the derived classes.<br>
 * <br>
 * This class defines a subset of muscle models that include an active fiber<br>
 * (contractile element) in series with a tendon. This class defines common <br>
 * data members and handles the geometry of a unipennate fiber in connection<br>
 * with a tendon. No states are assumed, but concrete classes are free to<br>
 * add whatever states are necessary to describe the specific behavior of a<br>
 * muscle.<br>
 * <br>
 * @author Ajay Seth, Matt Millard<br>
 * <br>
 * (Based on earlier work by Peter Loan and Frank C. Anderson.)
 */
public class Muscle extends PathActuator {
  private transient long swigCPtr;

  public Muscle(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Muscle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Muscle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(Muscle obj) {
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
        opensimSimulationJNI.delete_Muscle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Muscle safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Muscle_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Muscle(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Muscle_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Muscle_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Muscle_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Muscle(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Muscle_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_max_isometric_force(Muscle source) {
    opensimSimulationJNI.Muscle_copyProperty_max_isometric_force(swigCPtr, this, Muscle.getCPtr(source), source);
  }

  public double get_max_isometric_force(int i) {
    return opensimSimulationJNI.Muscle_get_max_isometric_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_max_isometric_force(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Muscle_upd_max_isometric_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_max_isometric_force(int i, double value) {
    opensimSimulationJNI.Muscle_set_max_isometric_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_max_isometric_force(double value) {
    return opensimSimulationJNI.Muscle_append_max_isometric_force(swigCPtr, this, value);
  }

  public void constructProperty_max_isometric_force(double initValue) {
    opensimSimulationJNI.Muscle_constructProperty_max_isometric_force(swigCPtr, this, initValue);
  }

  public double get_max_isometric_force() {
    return opensimSimulationJNI.Muscle_get_max_isometric_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_max_isometric_force() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Muscle_upd_max_isometric_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_max_isometric_force(double value) {
    opensimSimulationJNI.Muscle_set_max_isometric_force__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_optimal_fiber_length(Muscle source) {
    opensimSimulationJNI.Muscle_copyProperty_optimal_fiber_length(swigCPtr, this, Muscle.getCPtr(source), source);
  }

  public double get_optimal_fiber_length(int i) {
    return opensimSimulationJNI.Muscle_get_optimal_fiber_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_optimal_fiber_length(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Muscle_upd_optimal_fiber_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_optimal_fiber_length(int i, double value) {
    opensimSimulationJNI.Muscle_set_optimal_fiber_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_optimal_fiber_length(double value) {
    return opensimSimulationJNI.Muscle_append_optimal_fiber_length(swigCPtr, this, value);
  }

  public void constructProperty_optimal_fiber_length(double initValue) {
    opensimSimulationJNI.Muscle_constructProperty_optimal_fiber_length(swigCPtr, this, initValue);
  }

  public double get_optimal_fiber_length() {
    return opensimSimulationJNI.Muscle_get_optimal_fiber_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_optimal_fiber_length() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Muscle_upd_optimal_fiber_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_optimal_fiber_length(double value) {
    opensimSimulationJNI.Muscle_set_optimal_fiber_length__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_tendon_slack_length(Muscle source) {
    opensimSimulationJNI.Muscle_copyProperty_tendon_slack_length(swigCPtr, this, Muscle.getCPtr(source), source);
  }

  public double get_tendon_slack_length(int i) {
    return opensimSimulationJNI.Muscle_get_tendon_slack_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_tendon_slack_length(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Muscle_upd_tendon_slack_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_tendon_slack_length(int i, double value) {
    opensimSimulationJNI.Muscle_set_tendon_slack_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_tendon_slack_length(double value) {
    return opensimSimulationJNI.Muscle_append_tendon_slack_length(swigCPtr, this, value);
  }

  public void constructProperty_tendon_slack_length(double initValue) {
    opensimSimulationJNI.Muscle_constructProperty_tendon_slack_length(swigCPtr, this, initValue);
  }

  public double get_tendon_slack_length() {
    return opensimSimulationJNI.Muscle_get_tendon_slack_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_tendon_slack_length() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Muscle_upd_tendon_slack_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_tendon_slack_length(double value) {
    opensimSimulationJNI.Muscle_set_tendon_slack_length__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_pennation_angle_at_optimal(Muscle source) {
    opensimSimulationJNI.Muscle_copyProperty_pennation_angle_at_optimal(swigCPtr, this, Muscle.getCPtr(source), source);
  }

  public double get_pennation_angle_at_optimal(int i) {
    return opensimSimulationJNI.Muscle_get_pennation_angle_at_optimal__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_pennation_angle_at_optimal(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Muscle_upd_pennation_angle_at_optimal__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_pennation_angle_at_optimal(int i, double value) {
    opensimSimulationJNI.Muscle_set_pennation_angle_at_optimal__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_pennation_angle_at_optimal(double value) {
    return opensimSimulationJNI.Muscle_append_pennation_angle_at_optimal(swigCPtr, this, value);
  }

  public void constructProperty_pennation_angle_at_optimal(double initValue) {
    opensimSimulationJNI.Muscle_constructProperty_pennation_angle_at_optimal(swigCPtr, this, initValue);
  }

  public double get_pennation_angle_at_optimal() {
    return opensimSimulationJNI.Muscle_get_pennation_angle_at_optimal__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_pennation_angle_at_optimal() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Muscle_upd_pennation_angle_at_optimal__SWIG_1(swigCPtr, this), false);
  }

  public void set_pennation_angle_at_optimal(double value) {
    opensimSimulationJNI.Muscle_set_pennation_angle_at_optimal__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_max_contraction_velocity(Muscle source) {
    opensimSimulationJNI.Muscle_copyProperty_max_contraction_velocity(swigCPtr, this, Muscle.getCPtr(source), source);
  }

  public double get_max_contraction_velocity(int i) {
    return opensimSimulationJNI.Muscle_get_max_contraction_velocity__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_max_contraction_velocity(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Muscle_upd_max_contraction_velocity__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_max_contraction_velocity(int i, double value) {
    opensimSimulationJNI.Muscle_set_max_contraction_velocity__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_max_contraction_velocity(double value) {
    return opensimSimulationJNI.Muscle_append_max_contraction_velocity(swigCPtr, this, value);
  }

  public void constructProperty_max_contraction_velocity(double initValue) {
    opensimSimulationJNI.Muscle_constructProperty_max_contraction_velocity(swigCPtr, this, initValue);
  }

  public double get_max_contraction_velocity() {
    return opensimSimulationJNI.Muscle_get_max_contraction_velocity__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_max_contraction_velocity() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Muscle_upd_max_contraction_velocity__SWIG_1(swigCPtr, this), false);
  }

  public void set_max_contraction_velocity(double value) {
    opensimSimulationJNI.Muscle_set_max_contraction_velocity__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_ignore_tendon_compliance(Muscle source) {
    opensimSimulationJNI.Muscle_copyProperty_ignore_tendon_compliance(swigCPtr, this, Muscle.getCPtr(source), source);
  }

  public boolean get_ignore_tendon_compliance(int i) {
    return opensimSimulationJNI.Muscle_get_ignore_tendon_compliance__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_ignore_tendon_compliance(int i) {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Muscle_upd_ignore_tendon_compliance__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_ignore_tendon_compliance(int i, boolean value) {
    opensimSimulationJNI.Muscle_set_ignore_tendon_compliance__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_ignore_tendon_compliance(boolean value) {
    return opensimSimulationJNI.Muscle_append_ignore_tendon_compliance(swigCPtr, this, value);
  }

  public void constructProperty_ignore_tendon_compliance(boolean initValue) {
    opensimSimulationJNI.Muscle_constructProperty_ignore_tendon_compliance(swigCPtr, this, initValue);
  }

  public boolean get_ignore_tendon_compliance() {
    return opensimSimulationJNI.Muscle_get_ignore_tendon_compliance__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_ignore_tendon_compliance() {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Muscle_upd_ignore_tendon_compliance__SWIG_1(swigCPtr, this), false);
  }

  public void set_ignore_tendon_compliance(boolean value) {
    opensimSimulationJNI.Muscle_set_ignore_tendon_compliance__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_ignore_activation_dynamics(Muscle source) {
    opensimSimulationJNI.Muscle_copyProperty_ignore_activation_dynamics(swigCPtr, this, Muscle.getCPtr(source), source);
  }

  public boolean get_ignore_activation_dynamics(int i) {
    return opensimSimulationJNI.Muscle_get_ignore_activation_dynamics__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_ignore_activation_dynamics(int i) {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Muscle_upd_ignore_activation_dynamics__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_ignore_activation_dynamics(int i, boolean value) {
    opensimSimulationJNI.Muscle_set_ignore_activation_dynamics__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_ignore_activation_dynamics(boolean value) {
    return opensimSimulationJNI.Muscle_append_ignore_activation_dynamics(swigCPtr, this, value);
  }

  public void constructProperty_ignore_activation_dynamics(boolean initValue) {
    opensimSimulationJNI.Muscle_constructProperty_ignore_activation_dynamics(swigCPtr, this, initValue);
  }

  public boolean get_ignore_activation_dynamics() {
    return opensimSimulationJNI.Muscle_get_ignore_activation_dynamics__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_ignore_activation_dynamics() {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Muscle_upd_ignore_activation_dynamics__SWIG_1(swigCPtr, this), false);
  }

  public void set_ignore_activation_dynamics(boolean value) {
    opensimSimulationJNI.Muscle_set_ignore_activation_dynamics__SWIG_1(swigCPtr, this, value);
  }

  public void set_has_output_excitation(boolean value) {
    opensimSimulationJNI.Muscle__has_output_excitation_set(swigCPtr, this, value);
  }

  public boolean get_has_output_excitation() {
    return opensimSimulationJNI.Muscle__has_output_excitation_get(swigCPtr, this);
  }

  public void set_has_output_activation(boolean value) {
    opensimSimulationJNI.Muscle__has_output_activation_set(swigCPtr, this, value);
  }

  public boolean get_has_output_activation() {
    return opensimSimulationJNI.Muscle__has_output_activation_get(swigCPtr, this);
  }

  public void set_has_output_fiber_length(boolean value) {
    opensimSimulationJNI.Muscle__has_output_fiber_length_set(swigCPtr, this, value);
  }

  public boolean get_has_output_fiber_length() {
    return opensimSimulationJNI.Muscle__has_output_fiber_length_get(swigCPtr, this);
  }

  public void set_has_output_pennation_angle(boolean value) {
    opensimSimulationJNI.Muscle__has_output_pennation_angle_set(swigCPtr, this, value);
  }

  public boolean get_has_output_pennation_angle() {
    return opensimSimulationJNI.Muscle__has_output_pennation_angle_get(swigCPtr, this);
  }

  public void set_has_output_cos_pennation_angle(boolean value) {
    opensimSimulationJNI.Muscle__has_output_cos_pennation_angle_set(swigCPtr, this, value);
  }

  public boolean get_has_output_cos_pennation_angle() {
    return opensimSimulationJNI.Muscle__has_output_cos_pennation_angle_get(swigCPtr, this);
  }

  public void set_has_output_tendon_length(boolean value) {
    opensimSimulationJNI.Muscle__has_output_tendon_length_set(swigCPtr, this, value);
  }

  public boolean get_has_output_tendon_length() {
    return opensimSimulationJNI.Muscle__has_output_tendon_length_get(swigCPtr, this);
  }

  public void set_has_output_normalized_fiber_length(boolean value) {
    opensimSimulationJNI.Muscle__has_output_normalized_fiber_length_set(swigCPtr, this, value);
  }

  public boolean get_has_output_normalized_fiber_length() {
    return opensimSimulationJNI.Muscle__has_output_normalized_fiber_length_get(swigCPtr, this);
  }

  public void set_has_output_fiber_length_along_tendon(boolean value) {
    opensimSimulationJNI.Muscle__has_output_fiber_length_along_tendon_set(swigCPtr, this, value);
  }

  public boolean get_has_output_fiber_length_along_tendon() {
    return opensimSimulationJNI.Muscle__has_output_fiber_length_along_tendon_get(swigCPtr, this);
  }

  public void set_has_output_tendon_strain(boolean value) {
    opensimSimulationJNI.Muscle__has_output_tendon_strain_set(swigCPtr, this, value);
  }

  public boolean get_has_output_tendon_strain() {
    return opensimSimulationJNI.Muscle__has_output_tendon_strain_get(swigCPtr, this);
  }

  public void set_has_output_passive_force_multiplier(boolean value) {
    opensimSimulationJNI.Muscle__has_output_passive_force_multiplier_set(swigCPtr, this, value);
  }

  public boolean get_has_output_passive_force_multiplier() {
    return opensimSimulationJNI.Muscle__has_output_passive_force_multiplier_get(swigCPtr, this);
  }

  public void set_has_output_active_force_length_multiplier(boolean value) {
    opensimSimulationJNI.Muscle__has_output_active_force_length_multiplier_set(swigCPtr, this, value);
  }

  public boolean get_has_output_active_force_length_multiplier() {
    return opensimSimulationJNI.Muscle__has_output_active_force_length_multiplier_get(swigCPtr, this);
  }

  public void set_has_output_fiber_velocity(boolean value) {
    opensimSimulationJNI.Muscle__has_output_fiber_velocity_set(swigCPtr, this, value);
  }

  public boolean get_has_output_fiber_velocity() {
    return opensimSimulationJNI.Muscle__has_output_fiber_velocity_get(swigCPtr, this);
  }

  public void set_has_output_normalized_fiber_velocity(boolean value) {
    opensimSimulationJNI.Muscle__has_output_normalized_fiber_velocity_set(swigCPtr, this, value);
  }

  public boolean get_has_output_normalized_fiber_velocity() {
    return opensimSimulationJNI.Muscle__has_output_normalized_fiber_velocity_get(swigCPtr, this);
  }

  public void set_has_output_fiber_velocity_along_tendon(boolean value) {
    opensimSimulationJNI.Muscle__has_output_fiber_velocity_along_tendon_set(swigCPtr, this, value);
  }

  public boolean get_has_output_fiber_velocity_along_tendon() {
    return opensimSimulationJNI.Muscle__has_output_fiber_velocity_along_tendon_get(swigCPtr, this);
  }

  public void set_has_output_tendon_velocity(boolean value) {
    opensimSimulationJNI.Muscle__has_output_tendon_velocity_set(swigCPtr, this, value);
  }

  public boolean get_has_output_tendon_velocity() {
    return opensimSimulationJNI.Muscle__has_output_tendon_velocity_get(swigCPtr, this);
  }

  public void set_has_output_force_velocity_multiplier(boolean value) {
    opensimSimulationJNI.Muscle__has_output_force_velocity_multiplier_set(swigCPtr, this, value);
  }

  public boolean get_has_output_force_velocity_multiplier() {
    return opensimSimulationJNI.Muscle__has_output_force_velocity_multiplier_get(swigCPtr, this);
  }

  public void set_has_output_pennation_angular_velocity(boolean value) {
    opensimSimulationJNI.Muscle__has_output_pennation_angular_velocity_set(swigCPtr, this, value);
  }

  public boolean get_has_output_pennation_angular_velocity() {
    return opensimSimulationJNI.Muscle__has_output_pennation_angular_velocity_get(swigCPtr, this);
  }

  public void set_has_output_fiber_force(boolean value) {
    opensimSimulationJNI.Muscle__has_output_fiber_force_set(swigCPtr, this, value);
  }

  public boolean get_has_output_fiber_force() {
    return opensimSimulationJNI.Muscle__has_output_fiber_force_get(swigCPtr, this);
  }

  public void set_has_output_fiber_force_along_tendon(boolean value) {
    opensimSimulationJNI.Muscle__has_output_fiber_force_along_tendon_set(swigCPtr, this, value);
  }

  public boolean get_has_output_fiber_force_along_tendon() {
    return opensimSimulationJNI.Muscle__has_output_fiber_force_along_tendon_get(swigCPtr, this);
  }

  public void set_has_output_active_fiber_force(boolean value) {
    opensimSimulationJNI.Muscle__has_output_active_fiber_force_set(swigCPtr, this, value);
  }

  public boolean get_has_output_active_fiber_force() {
    return opensimSimulationJNI.Muscle__has_output_active_fiber_force_get(swigCPtr, this);
  }

  public void set_has_output_passive_fiber_force(boolean value) {
    opensimSimulationJNI.Muscle__has_output_passive_fiber_force_set(swigCPtr, this, value);
  }

  public boolean get_has_output_passive_fiber_force() {
    return opensimSimulationJNI.Muscle__has_output_passive_fiber_force_get(swigCPtr, this);
  }

  public void set_has_output_active_fiber_force_along_tendon(boolean value) {
    opensimSimulationJNI.Muscle__has_output_active_fiber_force_along_tendon_set(swigCPtr, this, value);
  }

  public boolean get_has_output_active_fiber_force_along_tendon() {
    return opensimSimulationJNI.Muscle__has_output_active_fiber_force_along_tendon_get(swigCPtr, this);
  }

  public void set_has_output_passive_fiber_force_along_tendon(boolean value) {
    opensimSimulationJNI.Muscle__has_output_passive_fiber_force_along_tendon_set(swigCPtr, this, value);
  }

  public boolean get_has_output_passive_fiber_force_along_tendon() {
    return opensimSimulationJNI.Muscle__has_output_passive_fiber_force_along_tendon_get(swigCPtr, this);
  }

  public void set_has_output_tendon_force(boolean value) {
    opensimSimulationJNI.Muscle__has_output_tendon_force_set(swigCPtr, this, value);
  }

  public boolean get_has_output_tendon_force() {
    return opensimSimulationJNI.Muscle__has_output_tendon_force_get(swigCPtr, this);
  }

  public void set_has_output_fiber_stiffness(boolean value) {
    opensimSimulationJNI.Muscle__has_output_fiber_stiffness_set(swigCPtr, this, value);
  }

  public boolean get_has_output_fiber_stiffness() {
    return opensimSimulationJNI.Muscle__has_output_fiber_stiffness_get(swigCPtr, this);
  }

  public void set_has_output_fiber_stiffness_along_tendon(boolean value) {
    opensimSimulationJNI.Muscle__has_output_fiber_stiffness_along_tendon_set(swigCPtr, this, value);
  }

  public boolean get_has_output_fiber_stiffness_along_tendon() {
    return opensimSimulationJNI.Muscle__has_output_fiber_stiffness_along_tendon_get(swigCPtr, this);
  }

  public void set_has_output_tendon_stiffness(boolean value) {
    opensimSimulationJNI.Muscle__has_output_tendon_stiffness_set(swigCPtr, this, value);
  }

  public boolean get_has_output_tendon_stiffness() {
    return opensimSimulationJNI.Muscle__has_output_tendon_stiffness_get(swigCPtr, this);
  }

  public void set_has_output_muscle_stiffness(boolean value) {
    opensimSimulationJNI.Muscle__has_output_muscle_stiffness_set(swigCPtr, this, value);
  }

  public boolean get_has_output_muscle_stiffness() {
    return opensimSimulationJNI.Muscle__has_output_muscle_stiffness_get(swigCPtr, this);
  }

  public void set_has_output_fiber_active_power(boolean value) {
    opensimSimulationJNI.Muscle__has_output_fiber_active_power_set(swigCPtr, this, value);
  }

  public boolean get_has_output_fiber_active_power() {
    return opensimSimulationJNI.Muscle__has_output_fiber_active_power_get(swigCPtr, this);
  }

  public void set_has_output_fiber_passive_power(boolean value) {
    opensimSimulationJNI.Muscle__has_output_fiber_passive_power_set(swigCPtr, this, value);
  }

  public boolean get_has_output_fiber_passive_power() {
    return opensimSimulationJNI.Muscle__has_output_fiber_passive_power_get(swigCPtr, this);
  }

  public void set_has_output_tendon_power(boolean value) {
    opensimSimulationJNI.Muscle__has_output_tendon_power_set(swigCPtr, this, value);
  }

  public boolean get_has_output_tendon_power() {
    return opensimSimulationJNI.Muscle__has_output_tendon_power_get(swigCPtr, this);
  }

  public void set_has_output_muscle_power(boolean value) {
    opensimSimulationJNI.Muscle__has_output_muscle_power_set(swigCPtr, this, value);
  }

  public boolean get_has_output_muscle_power() {
    return opensimSimulationJNI.Muscle__has_output_muscle_power_get(swigCPtr, this);
  }

  /**
   *  get/set the maximum isometric force (in N) that the fibers can generate 
   */
  public double getMaxIsometricForce() {
    return opensimSimulationJNI.Muscle_getMaxIsometricForce(swigCPtr, this);
  }

  public void setMaxIsometricForce(double maxIsometricForce) {
    opensimSimulationJNI.Muscle_setMaxIsometricForce(swigCPtr, this, maxIsometricForce);
  }

  /**
   *  get/set the optimal length (in m) of the muscle fibers (lumped as a single fiber) 
   */
  public double getOptimalFiberLength() {
    return opensimSimulationJNI.Muscle_getOptimalFiberLength(swigCPtr, this);
  }

  public void setOptimalFiberLength(double optimalFiberLength) {
    opensimSimulationJNI.Muscle_setOptimalFiberLength(swigCPtr, this, optimalFiberLength);
  }

  /**
   *  get/set the resting (slack) length (in m) of the tendon that is in series with the muscle fiber 
   */
  public double getTendonSlackLength() {
    return opensimSimulationJNI.Muscle_getTendonSlackLength(swigCPtr, this);
  }

  public void setTendonSlackLength(double tendonSlackLength) {
    opensimSimulationJNI.Muscle_setTendonSlackLength(swigCPtr, this, tendonSlackLength);
  }

  /**
   *  get/set the angle (in radians) between fibers at their optimal fiber length and the tendon 
   */
  public double getPennationAngleAtOptimalFiberLength() {
    return opensimSimulationJNI.Muscle_getPennationAngleAtOptimalFiberLength(swigCPtr, this);
  }

  public void setPennationAngleAtOptimalFiberLength(double pennationAngle) {
    opensimSimulationJNI.Muscle_setPennationAngleAtOptimalFiberLength(swigCPtr, this, pennationAngle);
  }

  /**
   *  get/set the maximum contraction velocity of the fibers, in optimal fiber-lengths per second 
   */
  public double getMaxContractionVelocity() {
    return opensimSimulationJNI.Muscle_getMaxContractionVelocity(swigCPtr, this);
  }

  public void setMaxContractionVelocity(double maxContractionVelocity) {
    opensimSimulationJNI.Muscle_setMaxContractionVelocity(swigCPtr, this, maxContractionVelocity);
  }

  /**
   *  Get/set Modeling (runtime) option to ignore tendon compliance when <br>
   *     computing muscle dynamics. This does not directly modify the persistent<br>
   *     property value. *
   */
  public boolean getIgnoreTendonCompliance(State s) {
    return opensimSimulationJNI.Muscle_getIgnoreTendonCompliance(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setIgnoreTendonCompliance(State s, boolean ignore) {
    opensimSimulationJNI.Muscle_setIgnoreTendonCompliance(swigCPtr, this, State.getCPtr(s), s, ignore);
  }

  /**
   *  Get/set Modeling (runtime) option to ignore activation dynamics when <br>
   *     computing muscle dynamics. This does not directly modify the persistent<br>
   *     property value. *
   */
  public boolean getIgnoreActivationDynamics(State s) {
    return opensimSimulationJNI.Muscle_getIgnoreActivationDynamics(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setIgnoreActivationDynamics(State s, boolean ignore) {
    opensimSimulationJNI.Muscle_setIgnoreActivationDynamics(swigCPtr, this, State.getCPtr(s), s, ignore);
  }

  /**
   *  get the activation level of the muscle, which modulates the active force<br>
   *         of the muscle and has a normalized (0 to 1) value <br>
   *         Note: method remains virtual to permit override by deprecated muscles. 
   */
  public double getActivation(State s) {
    return opensimSimulationJNI.Muscle_getActivation(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current working fiber length (m) for the muscle 
   */
  public double getFiberLength(State s) {
    return opensimSimulationJNI.Muscle_getFiberLength(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current pennation angle (radians) between the fiber and tendon at the current fiber length  
   */
  public double getPennationAngle(State s) {
    return opensimSimulationJNI.Muscle_getPennationAngle(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the cosine of the current pennation angle (radians) between the fiber and tendon at the current fiber length  
   */
  public double getCosPennationAngle(State s) {
    return opensimSimulationJNI.Muscle_getCosPennationAngle(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current tendon length (m)  given the current joint angles and fiber length 
   */
  public double getTendonLength(State s) {
    return opensimSimulationJNI.Muscle_getTendonLength(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current normalized fiber length (fiber_length/optimal_fiber_length) 
   */
  public double getNormalizedFiberLength(State s) {
    return opensimSimulationJNI.Muscle_getNormalizedFiberLength(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current fiber length (m) projected (*cos(pennationAngle)) onto the tendon direction 
   */
  public double getFiberLengthAlongTendon(State s) {
    return opensimSimulationJNI.Muscle_getFiberLengthAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current tendon strain (delta_l/tendon_slack_length is dimensionless)  
   */
  public double getTendonStrain(State s) {
    return opensimSimulationJNI.Muscle_getTendonStrain(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  the potential energy (J) stored in the fiber due to its parallel elastic element 
   */
  public double getFiberPotentialEnergy(State s) {
    return opensimSimulationJNI.Muscle_getFiberPotentialEnergy(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  the potential energy (J) stored in the tendon 
   */
  public double getTendonPotentialEnergy(State s) {
    return opensimSimulationJNI.Muscle_getTendonPotentialEnergy(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  the total potential energy (J) stored in the muscle 
   */
  public double getMusclePotentialEnergy(State s) {
    return opensimSimulationJNI.Muscle_getMusclePotentialEnergy(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the passive fiber (parallel elastic element) force multiplier 
   */
  public double getPassiveForceMultiplier(State s) {
    return opensimSimulationJNI.Muscle_getPassiveForceMultiplier(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the active fiber (contractile element) force multiplier due to current fiber length 
   */
  public double getActiveForceLengthMultiplier(State s) {
    return opensimSimulationJNI.Muscle_getActiveForceLengthMultiplier(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get current fiber velocity (m/s) positive is lengthening 
   */
  public double getFiberVelocity(State s) {
    return opensimSimulationJNI.Muscle_getFiberVelocity(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get normalized fiber velocity. This is the fiber velocity in m/s divided by<br>
   *     the maximum contraction velocity expressed in m/s; therefore, this quantity is<br>
   *     dimensionless and generally lies in the range [-1, 1]. 
   */
  public double getNormalizedFiberVelocity(State s) {
    return opensimSimulationJNI.Muscle_getNormalizedFiberVelocity(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current fiber velocity (m/s) projected onto the tendon direction 
   */
  public double getFiberVelocityAlongTendon(State s) {
    return opensimSimulationJNI.Muscle_getFiberVelocityAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get pennation angular velocity (radians/s) 
   */
  public double getPennationAngularVelocity(State s) {
    return opensimSimulationJNI.Muscle_getPennationAngularVelocity(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the tendon velocity (m/s) positive is lengthening 
   */
  public double getTendonVelocity(State s) {
    return opensimSimulationJNI.Muscle_getTendonVelocity(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the dimensionless multiplier resulting from the fiber's force-velocity curve 
   */
  public double getForceVelocityMultiplier(State s) {
    return opensimSimulationJNI.Muscle_getForceVelocityMultiplier(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current fiber force (N) applied to the tendon 
   */
  public double getFiberForce(State s) {
    return opensimSimulationJNI.Muscle_getFiberForce(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   * get the force of the fiber (N/m) along the direction of the tendon
   */
  public double getFiberForceAlongTendon(State s) {
    return opensimSimulationJNI.Muscle_getFiberForceAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current active fiber force (N) due to activation*force_length*force_velocity relationships 
   */
  public double getActiveFiberForce(State s) {
    return opensimSimulationJNI.Muscle_getActiveFiberForce(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the total force applied by all passive elements in the fiber (N) 
   */
  public double getPassiveFiberForce(State s) {
    return opensimSimulationJNI.Muscle_getPassiveFiberForce(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current active fiber force (N) projected onto the tendon direction 
   */
  public double getActiveFiberForceAlongTendon(State s) {
    return opensimSimulationJNI.Muscle_getActiveFiberForceAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the total force applied by all passive elements in the fiber (N)<br>
   *         projected onto the tendon direction 
   */
  public double getPassiveFiberForceAlongTendon(State s) {
    return opensimSimulationJNI.Muscle_getPassiveFiberForceAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current tendon force (N) applied to bones 
   */
  public double getTendonForce(State s) {
    return opensimSimulationJNI.Muscle_getTendonForce(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current fiber stiffness (N/m) defined as the partial derivative<br>
   *         of fiber force with respect to fiber length 
   */
  public double getFiberStiffness(State s) {
    return opensimSimulationJNI.Muscle_getFiberStiffness(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   * get the stiffness of the fiber (N/m) along the direction of the tendon,<br>
   *     that is the partial derivative of the fiber force along the tendon with<br>
   *     respect to small changes in fiber length along the tendon
   */
  public double getFiberStiffnessAlongTendon(State s) {
    return opensimSimulationJNI.Muscle_getFiberStiffnessAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current tendon stiffness (N/m) defined as the partial derivative<br>
   *         of tendon force with respect to tendon length 
   */
  public double getTendonStiffness(State s) {
    return opensimSimulationJNI.Muscle_getTendonStiffness(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current muscle stiffness (N/m) defined as the partial derivative<br>
   *         of muscle force with respect to muscle length 
   */
  public double getMuscleStiffness(State s) {
    return opensimSimulationJNI.Muscle_getMuscleStiffness(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current active fiber power (W) 
   */
  public double getFiberActivePower(State s) {
    return opensimSimulationJNI.Muscle_getFiberActivePower(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current passive fiber power (W) 
   */
  public double getFiberPassivePower(State s) {
    return opensimSimulationJNI.Muscle_getFiberPassivePower(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current tendon power (W) 
   */
  public double getTendonPower(State s) {
    return opensimSimulationJNI.Muscle_getTendonPower(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the current muscle power (W) 
   */
  public double getMusclePower(State s) {
    return opensimSimulationJNI.Muscle_getMusclePower(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  get the stress in the muscle (part of the Actuator interface as well) 
   */
  public double getStress(State s) {
    return opensimSimulationJNI.Muscle_getStress(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  set the excitation (control) for this muscle. NOTE if controllers are connected to the<br>
   *         muscle and are adding in their controls, and setExcitation is called after the model's<br>
   *         computeControls(), then setExcitation will override the controller values. If called <br>
   *         before computeControls, then controller value(s) are added to the excitation set here. 
   */
  public void setExcitation(State s, double excitation) {
    opensimSimulationJNI.Muscle_setExcitation(swigCPtr, this, State.getCPtr(s), s, excitation);
  }

  public double getExcitation(State s) {
    return opensimSimulationJNI.Muscle_getExcitation(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  DEPRECATED: only for backward compatibility 
   */
  public void setActivation(State s, double activation) {
    opensimSimulationJNI.Muscle_setActivation(swigCPtr, this, State.getCPtr(s), s, activation);
  }

  /**
   *  Actuator interface for a muscle computes the tension in the muscle<br>
   *         and applied by the tendon to bones (i.e. not the fiber force) 
   */
  public double computeActuation(State s) {
    return opensimSimulationJNI.Muscle_computeActuation(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  Find and set the equilibrium state of the muscle (if any) 
   */
  public void computeEquilibrium(State s) {
    opensimSimulationJNI.Muscle_computeEquilibrium(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   * Conditional comment: 
   */
  public double calcInextensibleTendonActiveFiberForce(State s, double aActivation) {
    return opensimSimulationJNI.Muscle_calcInextensibleTendonActiveFiberForce(swigCPtr, this, State.getCPtr(s), s, aActivation);
  }

}
