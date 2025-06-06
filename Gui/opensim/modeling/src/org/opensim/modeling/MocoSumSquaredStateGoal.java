/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Minimize the sum of squared states, integrated over the phase. For example,<br>
 * this can be used to minimize muscle activations, as is done in MocoInverse.<br>
 * <br>
 * This goal is computed as follows:<br>
 * <br>
 *  
\int_{t_i}^{t_f} \sum_{s \in S} w_s y_s(t)^2 ~dt
<br>
 * We use the following notation:<br>
 * -   t_i : the initial time of this phase.<br>
 * -   t_f : the final time of this phase.<br>
 * -   S : the set of state variables selected for this goal.<br>
 * -   w_s : the weight for state variable   s .<br>
 * -   y_s(t) : state variable   s .<br>
 * <br>
 * Select which states to minimize by using<br>
 * a regex pattern with `setPattern()`. Provide weights for each<br>
 * state through `setWeightSet()` or `setWeightForState()`.<br>
 * 
 */
public class MocoSumSquaredStateGoal extends MocoGoal {
  private transient long swigCPtr;

  public MocoSumSquaredStateGoal(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoSumSquaredStateGoal_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoSumSquaredStateGoal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MocoSumSquaredStateGoal obj) {
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
        opensimMocoJNI.delete_MocoSumSquaredStateGoal(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoSumSquaredStateGoal safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoSumSquaredStateGoal_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoSumSquaredStateGoal(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoSumSquaredStateGoal_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoSumSquaredStateGoal_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoSumSquaredStateGoal_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoSumSquaredStateGoal(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoSumSquaredStateGoal_getConcreteClassName(swigCPtr, this);
  }

  public MocoSumSquaredStateGoal() {
    this(opensimMocoJNI.new_MocoSumSquaredStateGoal__SWIG_0(), true);
  }

  public MocoSumSquaredStateGoal(String name) {
    this(opensimMocoJNI.new_MocoSumSquaredStateGoal__SWIG_1(name), true);
  }

  public MocoSumSquaredStateGoal(String name, double weight) {
    this(opensimMocoJNI.new_MocoSumSquaredStateGoal__SWIG_2(name, weight), true);
  }

  /**
   *  Provide a MocoWeightSet to weight the state variables in the cost.<br>
   *     Replaces the weight set if it already exists. 
   */
  public void setWeightSet(MocoWeightSet weightSet) {
    opensimMocoJNI.MocoSumSquaredStateGoal_setWeightSet(swigCPtr, this, MocoWeightSet.getCPtr(weightSet), weightSet);
  }

  /**
   *  Set the weight for an individual state variable. If a weight is<br>
   *     already set for the requested state, then the provided weight<br>
   *     replaces the previous weight. An exception is thrown if a weight<br>
   *     for an unknown state is provided. 
   */
  public void setWeightForState(String stateName, double weight) {
    opensimMocoJNI.MocoSumSquaredStateGoal_setWeightForState(swigCPtr, this, stateName, weight);
  }

  /**
   *  Only state paths matching the regular expression are included. The<br>
   *     regular expression must match the entire state path for a state path to<br>
   *     be included (that is, we use std::regex_match, not std::regex_search).<br>
   *     To include only generalized coordinates, use `.*value$`.<br>
   *     To include generalized coordinates and speeds, use `.*(value|speed)$`.<br>
   *     To include only activations, use `.*activation$`. 
   */
  public void setPattern(String pattern) {
    opensimMocoJNI.MocoSumSquaredStateGoal_setPattern(swigCPtr, this, pattern);
  }

  /**
   *  Unset the pattern, which causes all states to be matched. 
   */
  public void clearPattern() {
    opensimMocoJNI.MocoSumSquaredStateGoal_clearPattern(swigCPtr, this);
  }

  public String getPattern() {
    return opensimMocoJNI.MocoSumSquaredStateGoal_getPattern(swigCPtr, this);
  }

}
