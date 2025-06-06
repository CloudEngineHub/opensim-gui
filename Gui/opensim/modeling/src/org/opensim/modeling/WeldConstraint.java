/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class implementing a Weld Constraint. A WeldConstraint eliminates up to<br>
 * 6 dofs of a model by fixing two PhysicalFrames together at their origins<br>
 * aligning their axes.  PhysicalFrames are generally Ground, Body, or<br>
 * PhysicalOffsetFrame attached to a PhysicalFrame.<br>
 * The underlying Constraint in Simbody is a SimTK::Constraint::Weld.<br>
 * <br>
 * @author Ajay Seth
 */
public class WeldConstraint extends TwoFrameLinkerConstraint {
  private transient long swigCPtr;

  public WeldConstraint(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.WeldConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WeldConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(WeldConstraint obj) {
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
        opensimSimulationJNI.delete_WeldConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WeldConstraint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.WeldConstraint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WeldConstraint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.WeldConstraint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.WeldConstraint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.WeldConstraint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WeldConstraint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.WeldConstraint_getConcreteClassName(swigCPtr, this);
  }

  /**
   *  Default Constructor. Create an unnamed WeldConstraint with frame<br>
   *         sockets that are unsatisfied. 
   */
  public WeldConstraint() {
    this(opensimSimulationJNI.new_WeldConstraint__SWIG_0(), true);
  }

  /**
   *  Convenience Constructor.<br>
   *     Create a WeldConstraint between two PhysicalFrames, frame1 and frame2.<br>
   *     @param name         the name of this WeldConstraint <br>
   *     @param frame1Name   the name of the first PhysicalFrame being constrained<br>
   *     @param frame2Name   the name of the second PhysicalFrame being constrained
   */
  public WeldConstraint(String name, String frame1Name, String frame2Name) {
    this(opensimSimulationJNI.new_WeldConstraint__SWIG_1(name, frame1Name, frame2Name), true);
  }

  /**
   *  Backwards compatible Convenience Constructor <br>
   *     Construct a WeldConstraint where the weld frames are specified in terms of their<br>
   *     location and orientation in their respective PhysicalFrames. <br>
   * <br>
   *     @param name             the name of this WeldConstraint<br>
   *     @param frame1           the first PhysicalFrame that the weld constrains<br>
   *     @param locationInFrame1    Vec3 of the location of the weld in the first frame<br>
   *     @param orientationInFrame1 Vec3 of the XYZ body-fixed Euler angles of the<br>
   *                                    weld frame orientation in frame 1.<br>
   *     @param frame2               the second PhysicalFrame that the weld constrains<br>
   *     @param locationInFrame2    Vec3 of the location of the weld in the second frame<br>
   *     @param orientationInFrame2 Vec3 of the XYZ body-fixed Euler angles<br>
   *                                    of the weld frame orientation in frame2.
   */
  public WeldConstraint(String name, PhysicalFrame frame1, Vec3 locationInFrame1, Vec3 orientationInFrame1, PhysicalFrame frame2, Vec3 locationInFrame2, Vec3 orientationInFrame2) {
    this(opensimSimulationJNI.new_WeldConstraint__SWIG_2(name, PhysicalFrame.getCPtr(frame1), frame1, Vec3.getCPtr(locationInFrame1), locationInFrame1, Vec3.getCPtr(orientationInFrame1), orientationInFrame1, PhysicalFrame.getCPtr(frame2), frame2, Vec3.getCPtr(locationInFrame2), locationInFrame2, Vec3.getCPtr(orientationInFrame2), orientationInFrame2), true);
  }

  /**
   *  Convenience Constructor<br>
   *     Construct a WeldConstraint where the weld frames are specified in terms of their<br>
   *     transforms in their respective PhysicalFrames.<br>
   * <br>
   *     @param name         the name of this WeldConstraint<br>
   *     @param frame1       the first PhysicalFrame that the weld constrains<br>
   *     @param transformInFrame1    Transform of the weld in the first frame<br>
   *     @param frame2       the second PhysicalFrame that the weld constrains<br>
   *     @param transformInFrame2    Transform of the weld in the second frame
   */
  public WeldConstraint(String name, PhysicalFrame frame1, Transform transformInFrame1, PhysicalFrame frame2, Transform transformInFrame2) {
    this(opensimSimulationJNI.new_WeldConstraint__SWIG_3(name, PhysicalFrame.getCPtr(frame1), frame1, Transform.getCPtr(transformInFrame1), transformInFrame1, PhysicalFrame.getCPtr(frame2), frame2, Transform.getCPtr(transformInFrame2), transformInFrame2), true);
  }

  /**
   *  Advanced Method for computing induced accelerations given the constraint<br>
   *         applied at the point of contact specified. 
   */
  public void setContactPointForInducedAccelerations(State s, Vec3 point) {
    opensimSimulationJNI.WeldConstraint_setContactPointForInducedAccelerations(swigCPtr, this, State.getCPtr(s), s, Vec3.getCPtr(point), point);
  }

}
