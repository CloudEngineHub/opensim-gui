/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class implementing an ellipsoid for muscle wrapping.<br>
 * <br>
 * @author Peter Loan<br>
 * updated for OpenSim 4.0 by Benjamin Michaud, 2019.
 */
public class WrapEllipsoid extends WrapObject {
  private transient long swigCPtr;

  public WrapEllipsoid(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.WrapEllipsoid_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WrapEllipsoid obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(WrapEllipsoid obj) {
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
        opensimSimulationJNI.delete_WrapEllipsoid(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WrapEllipsoid safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.WrapEllipsoid_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WrapEllipsoid(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.WrapEllipsoid_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.WrapEllipsoid_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.WrapEllipsoid_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapEllipsoid(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.WrapEllipsoid_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_dimensions(WrapEllipsoid source) {
    opensimSimulationJNI.WrapEllipsoid_copyProperty_dimensions(swigCPtr, this, WrapEllipsoid.getCPtr(source), source);
  }

  public Vec3 get_dimensions(int i) {
    return new Vec3(opensimSimulationJNI.WrapEllipsoid_get_dimensions__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_dimensions(int i) {
    return new Vec3(opensimSimulationJNI.WrapEllipsoid_upd_dimensions__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_dimensions(int i, Vec3 value) {
    opensimSimulationJNI.WrapEllipsoid_set_dimensions__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_dimensions(Vec3 value) {
    return opensimSimulationJNI.WrapEllipsoid_append_dimensions(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_dimensions(Vec3 initValue) {
    opensimSimulationJNI.WrapEllipsoid_constructProperty_dimensions(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_dimensions() {
    return new Vec3(opensimSimulationJNI.WrapEllipsoid_get_dimensions__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_dimensions() {
    return new Vec3(opensimSimulationJNI.WrapEllipsoid_upd_dimensions__SWIG_1(swigCPtr, this), false);
  }

  public void set_dimensions(Vec3 value) {
    opensimSimulationJNI.WrapEllipsoid_set_dimensions__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public WrapEllipsoid() {
    this(opensimSimulationJNI.new_WrapEllipsoid(), true);
  }

  public String getWrapTypeName() {
    return opensimSimulationJNI.WrapEllipsoid_getWrapTypeName(swigCPtr, this);
  }

  public String getDimensionsString() {
    return opensimSimulationJNI.WrapEllipsoid_getDimensionsString(swigCPtr, this);
  }

  public Vec3 getRadii() {
    return new Vec3(opensimSimulationJNI.WrapEllipsoid_getRadii(swigCPtr, this), true);
  }

  /**
   *  Scale the ellipsoid's dimensions. The base class (WrapObject) scales the<br>
   *         origin of the ellipsoid in the body's reference frame. 
   */
  public void extendScale(State s, ScaleSet scaleSet) {
    opensimSimulationJNI.WrapEllipsoid_extendScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(scaleSet), scaleSet);
  }

}
