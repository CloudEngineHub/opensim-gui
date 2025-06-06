/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * Controller is an abstract ModelComponent that defines the interface for   <br>
 * an OpenSim Controller. A controller computes and sets the values of the  <br>
 * controls for the actuators under its control.<br>
 * <br>
 * The defining method of a Controller is its computeControls() method. All<br>
 * concrete controllers must implement this method.<br>
 * @see computeControls()<br>
 * <br>
 * Actuators can be connected to a Controller via the list Socket `actuators`.<br>
 * Connection can be made via the `addActuator()` convenience method or through<br>
 * the Socket directly:<br>
 * <br>
 * {@code 
// Add an actuator to the controller.
const auto& actuator = model.getComponent<Actuator>("/path/to/actuator");
controller.addActuator(actuator);

// Connect an actuator to the controller via the actuators Socket.
controller.appendSocketConnectee_actuators(actuator);
}<br>
 * <br>
 * Multiple actuators can be connected to a Controller via the `setActuators()`<br>
 * convenience methods:<br>
 * <br>
 * {@code 
// Add a Model's Set of Actuators to the controller.
controller.setActuators(model.getActuators());

// Add a ComponentList of Actuators to the controller.
controller.setActuators(model.getComponentList<Actuator>());
}<br>
 * <br>
 * Note: Prior to OpenSim 4.6, controlled actuators were managed via the list<br>
 *       Property `actuator_list`. This interface is no longer supported, all<br>
 *       actuators must be connected via the `actuators` list Socket.<br>
 * <br>
 * @author Ajay Seth
 */
public class Controller extends ModelComponent {
  private transient long swigCPtr;

  public Controller(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Controller_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Controller obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(Controller obj) {
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
        opensimSimulationJNI.delete_Controller(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Controller safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Controller_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Controller(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Controller_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Controller_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Controller_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Controller(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Controller_getConcreteClassName(swigCPtr, this);
  }

  /**
   *  Controller is enabled (active) by default.<br>
   *     NOTE: Prior to OpenSim 4.0, this property was named **isDisabled**.<br>
   *           If **isDisabled** is **true**, **enabled** is **false**.<br>
   *           If **isDisabled** is **false**, **enabled** is **true**. 
   */
  public void copyProperty_enabled(Controller source) {
    opensimSimulationJNI.Controller_copyProperty_enabled(swigCPtr, this, Controller.getCPtr(source), source);
  }

  public boolean get_enabled(int i) {
    return opensimSimulationJNI.Controller_get_enabled__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_enabled(int i) {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Controller_upd_enabled__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_enabled(int i, boolean value) {
    opensimSimulationJNI.Controller_set_enabled__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_enabled(boolean value) {
    return opensimSimulationJNI.Controller_append_enabled(swigCPtr, this, value);
  }

  public void constructProperty_enabled(boolean initValue) {
    opensimSimulationJNI.Controller_constructProperty_enabled(swigCPtr, this, initValue);
  }

  public boolean get_enabled() {
    return opensimSimulationJNI.Controller_get_enabled__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_enabled() {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Controller_upd_enabled__SWIG_1(swigCPtr, this), false);
  }

  public void set_enabled(boolean value) {
    opensimSimulationJNI.Controller_set_enabled__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_socket_actuators(SWIGTYPE_p_OpenSim__PropertyIndex value) {
    opensimSimulationJNI.Controller_PropertyIndex_socket_actuators_set(swigCPtr, this, SWIGTYPE_p_OpenSim__PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_OpenSim__PropertyIndex getPropertyIndex_socket_actuators() {
    return new SWIGTYPE_p_OpenSim__PropertyIndex(opensimSimulationJNI.Controller_PropertyIndex_socket_actuators_get(swigCPtr, this), true);
  }

  public void appendSocketConnectee_actuators(OpenSimObject object) {
    opensimSimulationJNI.Controller_appendSocketConnectee_actuators(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  /**
   *  Get whether or not this controller is enabled.<br>
   * @return true when controller is enabled.
   */
  public boolean isEnabled() {
    return opensimSimulationJNI.Controller_isEnabled(swigCPtr, this);
  }

  /**
   *  Enable this controller.<br>
   * @param enableFlag Enable the controller if true.
   */
  public void setEnabled(boolean enableFlag) {
    opensimSimulationJNI.Controller_setEnabled(swigCPtr, this, enableFlag);
  }

  /**
   *  Replace the current set of actuators with the provided set. 
   */
  public void setActuators(SetActuators actuators) {
    opensimSimulationJNI.Controller_setActuators__SWIG_0(swigCPtr, this, SetActuators.getCPtr(actuators), actuators);
  }

  public void setActuators(ActuatorList actuators) {
    opensimSimulationJNI.Controller_setActuators__SWIG_1(swigCPtr, this, ActuatorList.getCPtr(actuators), actuators);
  }

  /**
   *  Add to the current set of actuators. 
   */
  public void addActuator(Actuator actuator) {
    opensimSimulationJNI.Controller_addActuator(swigCPtr, this, Actuator.getCPtr(actuator), actuator);
  }

  /**
   *  Compute the control for actuator<br>
   *  This method defines the behavior for any concrete controller <br>
   *  and therefore must be implemented by concrete subclasses.<br>
   * <br>
   * @param s         system state <br>
   * @param controls  writable model controls (all actuators)
   */
  public void computeControls(State s, Vector controls) {
    opensimSimulationJNI.Controller_computeControls(swigCPtr, this, State.getCPtr(s), s, Vector.getCPtr(controls), controls);
  }

  /**
   *  Get the number of controls this controller computes. 
   */
  public int getNumControls() {
    return opensimSimulationJNI.Controller_getNumControls(swigCPtr, this);
  }

  /**
   *  Get the number of actuators that this controller is connected to. 
   */
  public int getNumActuators() {
    return opensimSimulationJNI.Controller_getNumActuators(swigCPtr, this);
  }

}
