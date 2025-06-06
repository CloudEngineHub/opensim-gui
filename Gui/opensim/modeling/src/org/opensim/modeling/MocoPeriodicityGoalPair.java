/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Create pair of variables for use with a MocoPeriodicityGoal. 
 */
public class MocoPeriodicityGoalPair extends OpenSimObject {
  private transient long swigCPtr;

  public MocoPeriodicityGoalPair(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoPeriodicityGoalPair_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoPeriodicityGoalPair obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MocoPeriodicityGoalPair obj) {
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
        opensimMocoJNI.delete_MocoPeriodicityGoalPair(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoPeriodicityGoalPair safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoPeriodicityGoalPair_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoPeriodicityGoalPair(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoPeriodicityGoalPair_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoPeriodicityGoalPair_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoPeriodicityGoalPair_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoPeriodicityGoalPair(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoPeriodicityGoalPair_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_initial_variable(MocoPeriodicityGoalPair source) {
    opensimMocoJNI.MocoPeriodicityGoalPair_copyProperty_initial_variable(swigCPtr, this, MocoPeriodicityGoalPair.getCPtr(source), source);
  }

  public String get_initial_variable(int i) {
    return opensimMocoJNI.MocoPeriodicityGoalPair_get_initial_variable__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_initial_variable(int i) {
    return new SWIGTYPE_p_std__string(opensimMocoJNI.MocoPeriodicityGoalPair_upd_initial_variable__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_initial_variable(int i, String value) {
    opensimMocoJNI.MocoPeriodicityGoalPair_set_initial_variable__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_initial_variable(String value) {
    return opensimMocoJNI.MocoPeriodicityGoalPair_append_initial_variable(swigCPtr, this, value);
  }

  public void constructProperty_initial_variable(String initValue) {
    opensimMocoJNI.MocoPeriodicityGoalPair_constructProperty_initial_variable(swigCPtr, this, initValue);
  }

  public String get_initial_variable() {
    return opensimMocoJNI.MocoPeriodicityGoalPair_get_initial_variable__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_initial_variable() {
    return new SWIGTYPE_p_std__string(opensimMocoJNI.MocoPeriodicityGoalPair_upd_initial_variable__SWIG_1(swigCPtr, this), false);
  }

  public void set_initial_variable(String value) {
    opensimMocoJNI.MocoPeriodicityGoalPair_set_initial_variable__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_final_variable(MocoPeriodicityGoalPair source) {
    opensimMocoJNI.MocoPeriodicityGoalPair_copyProperty_final_variable(swigCPtr, this, MocoPeriodicityGoalPair.getCPtr(source), source);
  }

  public String get_final_variable(int i) {
    return opensimMocoJNI.MocoPeriodicityGoalPair_get_final_variable__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_final_variable(int i) {
    return new SWIGTYPE_p_std__string(opensimMocoJNI.MocoPeriodicityGoalPair_upd_final_variable__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_final_variable(int i, String value) {
    opensimMocoJNI.MocoPeriodicityGoalPair_set_final_variable__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_final_variable(String value) {
    return opensimMocoJNI.MocoPeriodicityGoalPair_append_final_variable(swigCPtr, this, value);
  }

  public void constructProperty_final_variable(String initValue) {
    opensimMocoJNI.MocoPeriodicityGoalPair_constructProperty_final_variable(swigCPtr, this, initValue);
  }

  public String get_final_variable() {
    return opensimMocoJNI.MocoPeriodicityGoalPair_get_final_variable__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_final_variable() {
    return new SWIGTYPE_p_std__string(opensimMocoJNI.MocoPeriodicityGoalPair_upd_final_variable__SWIG_1(swigCPtr, this), false);
  }

  public void set_final_variable(String value) {
    opensimMocoJNI.MocoPeriodicityGoalPair_set_final_variable__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_negate(MocoPeriodicityGoalPair source) {
    opensimMocoJNI.MocoPeriodicityGoalPair_copyProperty_negate(swigCPtr, this, MocoPeriodicityGoalPair.getCPtr(source), source);
  }

  public boolean get_negate(int i) {
    return opensimMocoJNI.MocoPeriodicityGoalPair_get_negate__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_negate(int i) {
    return new SWIGTYPE_p_bool(opensimMocoJNI.MocoPeriodicityGoalPair_upd_negate__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_negate(int i, boolean value) {
    opensimMocoJNI.MocoPeriodicityGoalPair_set_negate__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_negate(boolean value) {
    return opensimMocoJNI.MocoPeriodicityGoalPair_append_negate(swigCPtr, this, value);
  }

  public void constructProperty_negate(boolean initValue) {
    opensimMocoJNI.MocoPeriodicityGoalPair_constructProperty_negate(swigCPtr, this, initValue);
  }

  public boolean get_negate() {
    return opensimMocoJNI.MocoPeriodicityGoalPair_get_negate__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_negate() {
    return new SWIGTYPE_p_bool(opensimMocoJNI.MocoPeriodicityGoalPair_upd_negate__SWIG_1(swigCPtr, this), false);
  }

  public void set_negate(boolean value) {
    opensimMocoJNI.MocoPeriodicityGoalPair_set_negate__SWIG_1(swigCPtr, this, value);
  }

  public MocoPeriodicityGoalPair() {
    this(opensimMocoJNI.new_MocoPeriodicityGoalPair__SWIG_0(), true);
  }

  public MocoPeriodicityGoalPair(String initialVariable, String finalVariable) {
    this(opensimMocoJNI.new_MocoPeriodicityGoalPair__SWIG_1(initialVariable, finalVariable), true);
  }

  public MocoPeriodicityGoalPair(String initialVariableIsFinalVariable) {
    this(opensimMocoJNI.new_MocoPeriodicityGoalPair__SWIG_2(initialVariableIsFinalVariable), true);
  }

}
