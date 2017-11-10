/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class StatesTrajectoryReporter extends AbstractReporter {
  private transient long swigCPtr;

  public StatesTrajectoryReporter(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.StatesTrajectoryReporter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(StatesTrajectoryReporter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_StatesTrajectoryReporter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static StatesTrajectoryReporter safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.StatesTrajectoryReporter_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new StatesTrajectoryReporter(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.StatesTrajectoryReporter_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.StatesTrajectoryReporter_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.StatesTrajectoryReporter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new StatesTrajectoryReporter(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.StatesTrajectoryReporter_getConcreteClassName(swigCPtr, this);
  }

  public StatesTrajectory getStates() {
    return new StatesTrajectory(opensimSimulationJNI.StatesTrajectoryReporter_getStates(swigCPtr, this), false);
  }

  public void clear() {
    opensimSimulationJNI.StatesTrajectoryReporter_clear(swigCPtr, this);
  }

  public StatesTrajectoryReporter() {
    this(opensimSimulationJNI.new_StatesTrajectoryReporter(), true);
  }

}