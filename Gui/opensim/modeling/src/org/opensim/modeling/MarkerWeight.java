/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MarkerWeight extends OpenSimObject {
  private transient long swigCPtr;

  public MarkerWeight(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.MarkerWeight_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MarkerWeight obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MarkerWeight obj) {
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
        opensimSimulationJNI.delete_MarkerWeight(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MarkerWeight safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.MarkerWeight_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MarkerWeight(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.MarkerWeight_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.MarkerWeight_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.MarkerWeight_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MarkerWeight(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.MarkerWeight_getConcreteClassName(swigCPtr, this);
  }

  public MarkerWeight() {
    this(opensimSimulationJNI.new_MarkerWeight__SWIG_0(), true);
  }

  public MarkerWeight(String name, double weight) {
    this(opensimSimulationJNI.new_MarkerWeight__SWIG_1(name, weight), true);
  }

  public void setWeight(double weight) {
    opensimSimulationJNI.MarkerWeight_setWeight(swigCPtr, this, weight);
  }

  public double getWeight() {
    return opensimSimulationJNI.MarkerWeight_getWeight(swigCPtr, this);
  }

}
