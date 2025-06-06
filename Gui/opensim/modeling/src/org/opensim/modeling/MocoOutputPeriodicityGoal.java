/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This goal allows you to minimize or constrain the difference of values from<br>
 * a Model Output from the beginning and end of a trajectory. Outputs of type<br>
 * double, SimTK::Vec3, and SimTK::SpatialVec are supported. By default, when using<br>
 * vector type Outputs, the norm of the vector is minimized, but you can also<br>
 * minimize a specific element of a vector Output via `setOutputIndex()`. You can<br>
 * also specify the exponent of the value in the integrand via `setExponent()`.<br>
 * <br>
 * This goal supports both "Cost" (default) and "EndpointConstraint" modes. In<br>
 * "EndpointConstraint" mode, the difference in Output values is constrained between<br>
 * user-specified bounds. By default, these bounds constrain the final value to<br>
 * zero; use 'updConstraintInfo()' to set custom bounds.<br>
 * <br>
 * Note: The exponent provided via 'setExponent()' is applied to the difference<br>
 *       between final and initial Output values.<br>
 * 
 */
public class MocoOutputPeriodicityGoal extends MocoOutputBase {
  private transient long swigCPtr;

  public MocoOutputPeriodicityGoal(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoOutputPeriodicityGoal_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoOutputPeriodicityGoal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MocoOutputPeriodicityGoal obj) {
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
        opensimMocoJNI.delete_MocoOutputPeriodicityGoal(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoOutputPeriodicityGoal safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoOutputPeriodicityGoal_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoOutputPeriodicityGoal(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoOutputPeriodicityGoal_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoOutputPeriodicityGoal_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoOutputPeriodicityGoal_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoOutputPeriodicityGoal(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoOutputPeriodicityGoal_getConcreteClassName(swigCPtr, this);
  }

  public MocoOutputPeriodicityGoal() {
    this(opensimMocoJNI.new_MocoOutputPeriodicityGoal__SWIG_0(), true);
  }

  public MocoOutputPeriodicityGoal(String name) {
    this(opensimMocoJNI.new_MocoOutputPeriodicityGoal__SWIG_1(name), true);
  }

  public MocoOutputPeriodicityGoal(String name, double weight) {
    this(opensimMocoJNI.new_MocoOutputPeriodicityGoal__SWIG_2(name, weight), true);
  }

}
