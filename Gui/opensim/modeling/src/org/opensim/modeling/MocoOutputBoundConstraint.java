/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This path constraint allows you to constrain a Model Output value to be<br>
 * between two time-based functions throughout the trajectory. It is<br>
 * possible to constrain the Output to match the value from a provided function;<br>
 * see the 'equality_with_lower' property. You can also combine two Outputs<br>
 * in a constraint by supplying a second output path and an operation to combine<br>
 * them. The operations are addition, subtraction, multiplication, and division.<br>
 * The first Output is always on the left hand side of the operation and the second<br>
 * Output on the right hand side. The two Outputs can be different quantities, but<br>
 * they must have the same type.<br>
 * <br>
 * Outputs of type double, SimTK::Vec3, and SimTK::SpatialVec are supported.<br>
 * When using SimTK::Vec3 or SimTK::SpatialVec types, 'setOutputIndex()'<br>
 * may be used to select a specific element of the Output vector. If no index is<br>
 * specified, the norm of the vector will be used when calling 'calcOutputValue()'.<br>
 * <br>
 * If using two Outputs, the Output index will be used to select the same element<br>
 * from both Outputs before the operation. If two Outputs of type SimTK::Vec3 or<br>
 * SimTK::SpatialVec are provided and no index is specified, the operation will be<br>
 * applied elementwise before computing the norm. Elementwise<br>
 * multiplication and division operations are not supported when using two<br>
 * SimTK::SpatialVec Outputs (i.e., an index must be provided).<br>
 * <br>
 * If a bound function is a GCVSpline, we ensure that the spline covers the entire<br>
 * possible time range in the problem (using the problem's time bounds). We do<br>
 * not perform such a check for other types of functions.<br>
 * <br>
 * Note: If you omit the lower and upper bounds, then this class will not<br>
 * constrain any Outputs, even if you have provided output paths.<br>
 * 
 */
public class MocoOutputBoundConstraint extends MocoPathConstraint {
  private transient long swigCPtr;

  public MocoOutputBoundConstraint(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoOutputBoundConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoOutputBoundConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MocoOutputBoundConstraint obj) {
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
        opensimMocoJNI.delete_MocoOutputBoundConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoOutputBoundConstraint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoOutputBoundConstraint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoOutputBoundConstraint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoOutputBoundConstraint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoOutputBoundConstraint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoOutputBoundConstraint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoOutputBoundConstraint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoOutputBoundConstraint_getConcreteClassName(swigCPtr, this);
  }

  public MocoOutputBoundConstraint() {
    this(opensimMocoJNI.new_MocoOutputBoundConstraint(), true);
  }

  /**
   *  Set the absolute path to the Output in the model to be used in this path<br>
   *     constraint. The format is "/path/to/component|output_name". 
   */
  public void setOutputPath(String path) {
    opensimMocoJNI.MocoOutputBoundConstraint_setOutputPath(swigCPtr, this, path);
  }

  public String getOutputPath() {
    return opensimMocoJNI.MocoOutputBoundConstraint_getOutputPath(swigCPtr, this);
  }

  /**
   *  Set the absolute path to the optional second Output in the model to be<br>
   *     used in this path constraint. The format is "/path/to/component|output_name".<br>
   *     This Output should have the same type as the first Output. If providing a<br>
   *     second Output, the user must also provide an operation via `setOperation()`.
   */
  public void setSecondOutputPath(String path) {
    opensimMocoJNI.MocoOutputBoundConstraint_setSecondOutputPath(swigCPtr, this, path);
  }

  public String getSecondOutputPath() {
    return opensimMocoJNI.MocoOutputBoundConstraint_getSecondOutputPath(swigCPtr, this);
  }

  /**
   *  Set the operation that combines Output values where two Outputs are<br>
   *     provided. The supported operations include "addition", "subtraction",<br>
   *     "multiplication", or "division". If providing an operation, the user<br>
   *     must also provide a second Output path. 
   */
  public void setOperation(String operation) {
    opensimMocoJNI.MocoOutputBoundConstraint_setOperation(swigCPtr, this, operation);
  }

  public String getOperation() {
    return opensimMocoJNI.MocoOutputBoundConstraint_getOperation(swigCPtr, this);
  }

  /**
   *  Set the exponent applied to the output value in the constraint. This<br>
   *     exponent is applied when minimizing the norm of a vector type output. 
   */
  public void setExponent(int exponent) {
    opensimMocoJNI.MocoOutputBoundConstraint_setExponent(swigCPtr, this, exponent);
  }

  public int getExponent() {
    return opensimMocoJNI.MocoOutputBoundConstraint_getExponent(swigCPtr, this);
  }

  /**
   *  Set the index to the value to be constrained when a vector type Output<br>
   *     is specified. For SpatialVec Outputs, indices 0, 1, and 2 refer to the<br>
   *     rotational components and indices 3, 4, and 5 refer to the translational<br>
   *     components. A value of -1 indicates to constrain the vector norm (which is<br>
   *     the default setting). If an index for a type double Output is provided, an<br>
   *     exception is thrown. 
   */
  public void setOutputIndex(int index) {
    opensimMocoJNI.MocoOutputBoundConstraint_setOutputIndex(swigCPtr, this, index);
  }

  public int getOutputIndex() {
    return opensimMocoJNI.MocoOutputBoundConstraint_getOutputIndex(swigCPtr, this);
  }

  public void setLowerBound(Function f) {
    opensimMocoJNI.MocoOutputBoundConstraint_setLowerBound(swigCPtr, this, Function.getCPtr(f), f);
  }

  public void clearLowerBound() {
    opensimMocoJNI.MocoOutputBoundConstraint_clearLowerBound(swigCPtr, this);
  }

  public boolean hasLowerBound() {
    return opensimMocoJNI.MocoOutputBoundConstraint_hasLowerBound(swigCPtr, this);
  }

  public Function getLowerBound() {
    return new Function(opensimMocoJNI.MocoOutputBoundConstraint_getLowerBound(swigCPtr, this), false);
  }

  public void setUpperBound(Function f) {
    opensimMocoJNI.MocoOutputBoundConstraint_setUpperBound(swigCPtr, this, Function.getCPtr(f), f);
  }

  public void clearUpperBound() {
    opensimMocoJNI.MocoOutputBoundConstraint_clearUpperBound(swigCPtr, this);
  }

  public boolean hasUpperBound() {
    return opensimMocoJNI.MocoOutputBoundConstraint_hasUpperBound(swigCPtr, this);
  }

  public Function getUpperBound() {
    return new Function(opensimMocoJNI.MocoOutputBoundConstraint_getUpperBound(swigCPtr, this), false);
  }

  /**
   *  Should the Output be constrained to be equal to the lower bound (rather<br>
   *  than an inequality constraint)? In this case, the upper bound must be<br>
   *  unspecified.
   */
  public void setEqualityWithLower(boolean v) {
    opensimMocoJNI.MocoOutputBoundConstraint_setEqualityWithLower(swigCPtr, this, v);
  }

  public boolean getEqualityWithLower() {
    return opensimMocoJNI.MocoOutputBoundConstraint_getEqualityWithLower(swigCPtr, this);
  }

}
