/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * Arrow is a Geometry subclass used to represent an arrow. The arrow goes from<br>
 * start_point (Property) and has direction (Property) and length (Property)
 */
public class Arrow extends Geometry {
  private transient long swigCPtr;

  public Arrow(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Arrow_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Arrow obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(Arrow obj) {
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
        opensimSimulationJNI.delete_Arrow(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Arrow safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Arrow_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Arrow(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Arrow_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Arrow_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Arrow_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Arrow(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Arrow_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_start_point(Arrow source) {
    opensimSimulationJNI.Arrow_copyProperty_start_point(swigCPtr, this, Arrow.getCPtr(source), source);
  }

  public Vec3 get_start_point(int i) {
    return new Vec3(opensimSimulationJNI.Arrow_get_start_point__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_start_point(int i) {
    return new Vec3(opensimSimulationJNI.Arrow_upd_start_point__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_start_point(int i, Vec3 value) {
    opensimSimulationJNI.Arrow_set_start_point__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_start_point(Vec3 value) {
    return opensimSimulationJNI.Arrow_append_start_point(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_start_point(Vec3 initValue) {
    opensimSimulationJNI.Arrow_constructProperty_start_point(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_start_point() {
    return new Vec3(opensimSimulationJNI.Arrow_get_start_point__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_start_point() {
    return new Vec3(opensimSimulationJNI.Arrow_upd_start_point__SWIG_1(swigCPtr, this), false);
  }

  public void set_start_point(Vec3 value) {
    opensimSimulationJNI.Arrow_set_start_point__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_direction(Arrow source) {
    opensimSimulationJNI.Arrow_copyProperty_direction(swigCPtr, this, Arrow.getCPtr(source), source);
  }

  public Vec3 get_direction(int i) {
    return new Vec3(opensimSimulationJNI.Arrow_get_direction__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_direction(int i) {
    return new Vec3(opensimSimulationJNI.Arrow_upd_direction__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_direction(int i, Vec3 value) {
    opensimSimulationJNI.Arrow_set_direction__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_direction(Vec3 value) {
    return opensimSimulationJNI.Arrow_append_direction(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_direction(Vec3 initValue) {
    opensimSimulationJNI.Arrow_constructProperty_direction(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_direction() {
    return new Vec3(opensimSimulationJNI.Arrow_get_direction__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_direction() {
    return new Vec3(opensimSimulationJNI.Arrow_upd_direction__SWIG_1(swigCPtr, this), false);
  }

  public void set_direction(Vec3 value) {
    opensimSimulationJNI.Arrow_set_direction__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_length(Arrow source) {
    opensimSimulationJNI.Arrow_copyProperty_length(swigCPtr, this, Arrow.getCPtr(source), source);
  }

  public double get_length(int i) {
    return opensimSimulationJNI.Arrow_get_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_length(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Arrow_upd_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_length(int i, double value) {
    opensimSimulationJNI.Arrow_set_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_length(double value) {
    return opensimSimulationJNI.Arrow_append_length(swigCPtr, this, value);
  }

  public void constructProperty_length(double initValue) {
    opensimSimulationJNI.Arrow_constructProperty_length(swigCPtr, this, initValue);
  }

  public double get_length() {
    return opensimSimulationJNI.Arrow_get_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_length() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Arrow_upd_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_length(double value) {
    opensimSimulationJNI.Arrow_set_length__SWIG_1(swigCPtr, this, value);
  }

  /**
   *  constructor that takes startPoint, direction vector and length
   */
  public Arrow(Vec3 aPoint1, UnitVec3 aUnitDir, double aLength) {
    this(opensimSimulationJNI.new_Arrow__SWIG_0(Vec3.getCPtr(aPoint1), aPoint1, UnitVec3.getCPtr(aUnitDir), aUnitDir, aLength), true);
  }

  /**
   *  Default constructor that creates Arrow of length 1 starting at origin <br>
   *  in the direction (1,1,1)
   */
  public Arrow() {
    this(opensimSimulationJNI.new_Arrow__SWIG_1(), true);
  }

}
