/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * Abstract class for analytical geometry (e.g. surfaces of revolution) whose<br>
 * rendering is optimized by the graphics library (e.g. threejs). Unlike other<br>
 * geometry, property edits require a recreation of the AnalyticGeometry on<br>
 * the renderer and not simple updates. AnalyticGeometry is the base class for<br>
 * Sphere, Cylinder, Cone, Ellipsoid and Torus geometry.
 */
public class AnalyticGeometry extends Geometry {
  private transient long swigCPtr;

  public AnalyticGeometry(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.AnalyticGeometry_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(AnalyticGeometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(AnalyticGeometry obj) {
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
        opensimSimulationJNI.delete_AnalyticGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static AnalyticGeometry safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.AnalyticGeometry_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new AnalyticGeometry(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.AnalyticGeometry_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.AnalyticGeometry_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.AnalyticGeometry_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new AnalyticGeometry(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.AnalyticGeometry_getConcreteClassName(swigCPtr, this);
  }

}
