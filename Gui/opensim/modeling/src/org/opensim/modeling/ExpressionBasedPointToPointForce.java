/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A point-to-point Force whose force magnitude is determined by a user-defined<br>
 * expression, with the distance (d) and its time derivative (ddot) as variables. <br>
 * The direction of the force is directed along the line connecting the two <br>
 * points. <br>
 * <br>
 * "d" and "ddot" are the variables names expected by the expression parser.<br>
 * Common C math library functions such as: exp(), pow(), sqrt(), sin(), ...<br>
 * are permitted. See Lepton/Operation.h for a complete list.<br>
 * <br>
 * For example: string expression = "-1.5*exp(10*(d-0.25)^2)*(1 + 2.0*ddot)"<br>
 *              provides a model of a nonlinear point-to point spring, while <br>
 *              expression = "1.25/(rd^2)" is an electric field force between<br>
 *              charged particles at points separated by the distance, d.<br>
 *              i.e. K*q1*q2 = 1.25<br>
 * <br>
 * @author Ajay Seth
 */
public class ExpressionBasedPointToPointForce extends ForceProducer {
  private transient long swigCPtr;

  public ExpressionBasedPointToPointForce(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ExpressionBasedPointToPointForce_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ExpressionBasedPointToPointForce obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ExpressionBasedPointToPointForce obj) {
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
        opensimSimulationJNI.delete_ExpressionBasedPointToPointForce(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ExpressionBasedPointToPointForce safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ExpressionBasedPointToPointForce_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ExpressionBasedPointToPointForce(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ExpressionBasedPointToPointForce_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ExpressionBasedPointToPointForce(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_body1(ExpressionBasedPointToPointForce source) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_copyProperty_body1(swigCPtr, this, ExpressionBasedPointToPointForce.getCPtr(source), source);
  }

  public String get_body1(int i) {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_get_body1__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_body1(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedPointToPointForce_upd_body1__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_body1(int i, String value) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_set_body1__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_body1(String value) {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_append_body1(swigCPtr, this, value);
  }

  public void constructProperty_body1() {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_constructProperty_body1__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_body1(String initValue) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_constructProperty_body1__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_body1() {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_get_body1__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_body1() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedPointToPointForce_upd_body1__SWIG_1(swigCPtr, this), false);
  }

  public void set_body1(String value) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_set_body1__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_body2(ExpressionBasedPointToPointForce source) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_copyProperty_body2(swigCPtr, this, ExpressionBasedPointToPointForce.getCPtr(source), source);
  }

  public String get_body2(int i) {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_get_body2__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_body2(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedPointToPointForce_upd_body2__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_body2(int i, String value) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_set_body2__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_body2(String value) {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_append_body2(swigCPtr, this, value);
  }

  public void constructProperty_body2() {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_constructProperty_body2__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_body2(String initValue) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_constructProperty_body2__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_body2() {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_get_body2__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_body2() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedPointToPointForce_upd_body2__SWIG_1(swigCPtr, this), false);
  }

  public void set_body2(String value) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_set_body2__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_point1(ExpressionBasedPointToPointForce source) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_copyProperty_point1(swigCPtr, this, ExpressionBasedPointToPointForce.getCPtr(source), source);
  }

  public Vec3 get_point1(int i) {
    return new Vec3(opensimSimulationJNI.ExpressionBasedPointToPointForce_get_point1__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_point1(int i) {
    return new Vec3(opensimSimulationJNI.ExpressionBasedPointToPointForce_upd_point1__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_point1(int i, Vec3 value) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_set_point1__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_point1(Vec3 value) {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_append_point1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_point1(Vec3 initValue) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_constructProperty_point1(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_point1() {
    return new Vec3(opensimSimulationJNI.ExpressionBasedPointToPointForce_get_point1__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_point1() {
    return new Vec3(opensimSimulationJNI.ExpressionBasedPointToPointForce_upd_point1__SWIG_1(swigCPtr, this), false);
  }

  public void set_point1(Vec3 value) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_set_point1__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_point2(ExpressionBasedPointToPointForce source) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_copyProperty_point2(swigCPtr, this, ExpressionBasedPointToPointForce.getCPtr(source), source);
  }

  public Vec3 get_point2(int i) {
    return new Vec3(opensimSimulationJNI.ExpressionBasedPointToPointForce_get_point2__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_point2(int i) {
    return new Vec3(opensimSimulationJNI.ExpressionBasedPointToPointForce_upd_point2__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_point2(int i, Vec3 value) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_set_point2__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_point2(Vec3 value) {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_append_point2(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_point2(Vec3 initValue) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_constructProperty_point2(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_point2() {
    return new Vec3(opensimSimulationJNI.ExpressionBasedPointToPointForce_get_point2__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_point2() {
    return new Vec3(opensimSimulationJNI.ExpressionBasedPointToPointForce_upd_point2__SWIG_1(swigCPtr, this), false);
  }

  public void set_point2(Vec3 value) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_set_point2__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_expression(ExpressionBasedPointToPointForce source) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_copyProperty_expression(swigCPtr, this, ExpressionBasedPointToPointForce.getCPtr(source), source);
  }

  public String get_expression(int i) {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_get_expression__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_expression(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedPointToPointForce_upd_expression__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_expression(int i, String value) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_set_expression__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_expression(String value) {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_append_expression(swigCPtr, this, value);
  }

  public void constructProperty_expression(String initValue) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_constructProperty_expression(swigCPtr, this, initValue);
  }

  public String get_expression() {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_get_expression__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_expression() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ExpressionBasedPointToPointForce_upd_expression__SWIG_1(swigCPtr, this), false);
  }

  public void set_expression(String value) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_set_expression__SWIG_1(swigCPtr, this, value);
  }

  public void set_has_output_force_magnitude(boolean value) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce__has_output_force_magnitude_set(swigCPtr, this, value);
  }

  public boolean get_has_output_force_magnitude() {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce__has_output_force_magnitude_get(swigCPtr, this);
  }

  /**
   *  Default constructor. *
   */
  public ExpressionBasedPointToPointForce() {
    this(opensimSimulationJNI.new_ExpressionBasedPointToPointForce__SWIG_0(), true);
  }

  /**
   *  Convenience constructor for API users.<br>
   *     @param body1Name    name of the first body to which the p2p force is attached<br>
   *     @param point1       first point location attached to body1<br>
   *     @param body2Name    name of the second body to which the p2p force is attached<br>
   *     @param point2       second  point location attached to body2<br>
   *     @param expression   the expression used to compute the force action at points
   */
  public ExpressionBasedPointToPointForce(String body1Name, Vec3 point1, String body2Name, Vec3 point2, String expression) {
    this(opensimSimulationJNI.new_ExpressionBasedPointToPointForce__SWIG_1(body1Name, Vec3.getCPtr(point1), point1, body2Name, Vec3.getCPtr(point2), point2, expression), true);
  }

  /**
   * Force end point bodies 
   */
  public void setBody1Name(String body1Name) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_setBody1Name(swigCPtr, this, body1Name);
  }

  public void setBody2Name(String body2Name) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_setBody2Name(swigCPtr, this, body2Name);
  }

  public String getBody1Name() {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_getBody1Name(swigCPtr, this);
  }

  public String getBody2Name() {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_getBody2Name(swigCPtr, this);
  }

  /**
   * Force end points 
   */
  public void setPoint1(Vec3 aPosition) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_setPoint1(swigCPtr, this, Vec3.getCPtr(aPosition), aPosition);
  }

  public Vec3 getPoint1() {
    return new Vec3(opensimSimulationJNI.ExpressionBasedPointToPointForce_getPoint1(swigCPtr, this), false);
  }

  public void setPoint2(Vec3 aPosition) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_setPoint2(swigCPtr, this, Vec3.getCPtr(aPosition), aPosition);
  }

  public Vec3 getPoint2() {
    return new Vec3(opensimSimulationJNI.ExpressionBasedPointToPointForce_getPoint2(swigCPtr, this), false);
  }

  /**
   * %Set the mathematical expression that defines the force magnitude of this<br>
   * point-to-point force in terms of the point-to-point distance (d) and its<br>
   * time derivative (ddot). Expressions with C-mathematical operations<br>
   * such as +,-,*,/ and common functions: exp, pow, sqrt, sin, cos, tan, <br>
   * and so on are acceptable.<br>
   * NOTE: a limitation is that the expression may not contain whitespace<br>
   * @param expression    string containing the mathematical expression that<br>
   *                      defines the point-to-point force 
   */
  public void setExpression(String expression) {
    opensimSimulationJNI.ExpressionBasedPointToPointForce_setExpression(swigCPtr, this, expression);
  }

  /**
   * Get the computed Force magnitude determined by evaluating the <br>
   * expression above. Note, computeForce must be evaluated first,<br>
   * and this is done automatically if the system is realized to Dynamics<br>
   * @param state    const state (reference) for the model<br>
   * @return const double ref to the force magnitude
   */
  public double getForceMagnitude(State state) {
    return opensimSimulationJNI.ExpressionBasedPointToPointForce_getForceMagnitude(swigCPtr, this, State.getCPtr(state), state);
  }

  /**
   * Provide name(s) of the quantities (column labels) of the force value(s) to be reported
   */
  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimSimulationJNI.ExpressionBasedPointToPointForce_getRecordLabels(swigCPtr, this), true);
  }

  /**
   *  Provide the value(s) to be reported that correspond to the labels
   */
  public ArrayDouble getRecordValues(State state) {
    return new ArrayDouble(opensimSimulationJNI.ExpressionBasedPointToPointForce_getRecordValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

}
