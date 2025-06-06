/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * An actuator that applies a generalized force in the direction of a<br>
 * generalized coordinate. The applied generalized force is proportional to the<br>
 * input control of the CoordinateActuator. Replaces the GeneralizedForce class.<br>
 * <br>
 * @author Ajay Seth<br>
 * @author Frank C. Anderson
 */
public class CoordinateActuator extends ScalarActuator {
  private transient long swigCPtr;

  public CoordinateActuator(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.CoordinateActuator_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(CoordinateActuator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(CoordinateActuator obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_CoordinateActuator(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static CoordinateActuator safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.CoordinateActuator_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new CoordinateActuator(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.CoordinateActuator_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.CoordinateActuator_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.CoordinateActuator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new CoordinateActuator(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.CoordinateActuator_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_coordinate(CoordinateActuator source) {
    opensimActuatorsAnalysesToolsJNI.CoordinateActuator_copyProperty_coordinate(swigCPtr, this, CoordinateActuator.getCPtr(source), source);
  }

  public String get_coordinate(int i) {
    return opensimActuatorsAnalysesToolsJNI.CoordinateActuator_get_coordinate__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_coordinate(int i) {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.CoordinateActuator_upd_coordinate__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_coordinate(int i, String value) {
    opensimActuatorsAnalysesToolsJNI.CoordinateActuator_set_coordinate__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_coordinate(String value) {
    return opensimActuatorsAnalysesToolsJNI.CoordinateActuator_append_coordinate(swigCPtr, this, value);
  }

  public void constructProperty_coordinate() {
    opensimActuatorsAnalysesToolsJNI.CoordinateActuator_constructProperty_coordinate__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_coordinate(String initValue) {
    opensimActuatorsAnalysesToolsJNI.CoordinateActuator_constructProperty_coordinate__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_coordinate() {
    return opensimActuatorsAnalysesToolsJNI.CoordinateActuator_get_coordinate__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_coordinate() {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.CoordinateActuator_upd_coordinate__SWIG_1(swigCPtr, this), false);
  }

  public void set_coordinate(String value) {
    opensimActuatorsAnalysesToolsJNI.CoordinateActuator_set_coordinate__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_optimal_force(CoordinateActuator source) {
    opensimActuatorsAnalysesToolsJNI.CoordinateActuator_copyProperty_optimal_force(swigCPtr, this, CoordinateActuator.getCPtr(source), source);
  }

  public double get_optimal_force(int i) {
    return opensimActuatorsAnalysesToolsJNI.CoordinateActuator_get_optimal_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_optimal_force(int i) {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.CoordinateActuator_upd_optimal_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_optimal_force(int i, double value) {
    opensimActuatorsAnalysesToolsJNI.CoordinateActuator_set_optimal_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_optimal_force(double value) {
    return opensimActuatorsAnalysesToolsJNI.CoordinateActuator_append_optimal_force(swigCPtr, this, value);
  }

  public void constructProperty_optimal_force(double initValue) {
    opensimActuatorsAnalysesToolsJNI.CoordinateActuator_constructProperty_optimal_force(swigCPtr, this, initValue);
  }

  public double get_optimal_force() {
    return opensimActuatorsAnalysesToolsJNI.CoordinateActuator_get_optimal_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_optimal_force() {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.CoordinateActuator_upd_optimal_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_optimal_force(double value) {
    opensimActuatorsAnalysesToolsJNI.CoordinateActuator_set_optimal_force__SWIG_1(swigCPtr, this, value);
  }

  /**
   *  Default constructor leaves coordinate name unspecified, or you can<br>
   *     provide it. *
   */
  public CoordinateActuator(String coordinateName) {
    this(opensimActuatorsAnalysesToolsJNI.new_CoordinateActuator__SWIG_0(coordinateName), true);
  }

  /**
   *  Default constructor leaves coordinate name unspecified, or you can<br>
   *     provide it. *
   */
  public CoordinateActuator() {
    this(opensimActuatorsAnalysesToolsJNI.new_CoordinateActuator__SWIG_1(), true);
  }

  /**
   *  %Set the 'optimal_force' property. *
   */
  public void setOptimalForce(double optimalForce) {
    opensimActuatorsAnalysesToolsJNI.CoordinateActuator_setOptimalForce(swigCPtr, this, optimalForce);
  }

  /**
   *  Get the current setting of the 'optimal_force' property. *
   */
  public double getOptimalForce() {
    return opensimActuatorsAnalysesToolsJNI.CoordinateActuator_getOptimalForce(swigCPtr, this);
  }

  public static ForceSet CreateForceSetOfCoordinateActuatorsForModel(State s, Model aModel, double aOptimalForce, boolean aIncludeLockedAndConstrainedCoordinates) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.CoordinateActuator_CreateForceSetOfCoordinateActuatorsForModel__SWIG_0(State.getCPtr(s), s, Model.getCPtr(aModel), aModel, aOptimalForce, aIncludeLockedAndConstrainedCoordinates);
    return (cPtr == 0) ? null : new ForceSet(cPtr, false);
  }

  public static ForceSet CreateForceSetOfCoordinateActuatorsForModel(State s, Model aModel, double aOptimalForce) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.CoordinateActuator_CreateForceSetOfCoordinateActuatorsForModel__SWIG_1(State.getCPtr(s), s, Model.getCPtr(aModel), aModel, aOptimalForce);
    return (cPtr == 0) ? null : new ForceSet(cPtr, false);
  }

  public static ForceSet CreateForceSetOfCoordinateActuatorsForModel(State s, Model aModel) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.CoordinateActuator_CreateForceSetOfCoordinateActuatorsForModel__SWIG_2(State.getCPtr(s), s, Model.getCPtr(aModel), aModel);
    return (cPtr == 0) ? null : new ForceSet(cPtr, false);
  }

  public boolean isCoordinateValid() {
    return opensimActuatorsAnalysesToolsJNI.CoordinateActuator_isCoordinateValid(swigCPtr, this);
  }

  public double getSpeed(State s) {
    return opensimActuatorsAnalysesToolsJNI.CoordinateActuator_getSpeed(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  %Set the reference pointer to point to the given Coordinate and set<br>
   *     the 'coordinate' name property also. *
   */
  public void setCoordinate(Coordinate aCoordinate) {
    opensimActuatorsAnalysesToolsJNI.CoordinateActuator_setCoordinate(swigCPtr, this, Coordinate.getCPtr(aCoordinate), aCoordinate);
  }

  /**
   *  Get a pointer to the Coordinate to which this actuator refers. *
   */
  public Coordinate getCoordinate() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.CoordinateActuator_getCoordinate(swigCPtr, this);
    return (cPtr == 0) ? null : new Coordinate(cPtr, false);
  }

}
