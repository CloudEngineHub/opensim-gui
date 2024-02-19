/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  The squared difference between a model frame's angular velocity and a<br>
 * reference angular velocity value, summed over the frames for which a<br>
 * reference is provided, and integrated over the phase. This can be used to<br>
 * track angular velocity quantities in the model that don't correspond to<br>
 * model degrees of freedom. The reference can be provided as a trajectory of<br>
 * SimTK::Vec3%s representing the angular velocity reference data, or as a<br>
 * states trajectory from which the tracked angular velocity reference is<br>
 * computed. Both angular velocity and states references can be provided as a<br>
 * file name to a STO or CSV file (or other file types for which there is a<br>
 * FileAdapter), or programmatically as a TimeSeriesTableVec3 (for the angular<br>
 * velocity reference) or as a scalar TimeSeriesTable (for the states<br>
 * reference).<br>
 * <br>
 * Errors for this cost are computed assuming that the provided reference<br>
 * angular velocity data is expressed in the ground frame. If you are using<br>
 * this cost to track raw signals from an inertial measurement unit (IMU), make<br>
 * sure that the frame you're tracking produces angular velocity values that<br>
 * correspond to the real-world placement of your IMU.<br>
 * <br>
 * This cost requires realization to SimTK::Stage::Velocity.<br>
 * <br>
 * 
 */
public class MocoAngularVelocityTrackingGoal extends MocoGoal {
  private transient long swigCPtr;

  public MocoAngularVelocityTrackingGoal(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoAngularVelocityTrackingGoal_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoAngularVelocityTrackingGoal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MocoAngularVelocityTrackingGoal obj) {
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

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimMocoJNI.delete_MocoAngularVelocityTrackingGoal(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoAngularVelocityTrackingGoal safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoAngularVelocityTrackingGoal_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoAngularVelocityTrackingGoal(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoAngularVelocityTrackingGoal_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoAngularVelocityTrackingGoal_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoAngularVelocityTrackingGoal_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoAngularVelocityTrackingGoal(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoAngularVelocityTrackingGoal_getConcreteClassName(swigCPtr, this);
  }

  public MocoAngularVelocityTrackingGoal() {
    this(opensimMocoJNI.new_MocoAngularVelocityTrackingGoal__SWIG_0(), true);
  }

  public MocoAngularVelocityTrackingGoal(String name) {
    this(opensimMocoJNI.new_MocoAngularVelocityTrackingGoal__SWIG_1(name), true);
  }

  public MocoAngularVelocityTrackingGoal(String name, double weight) {
    this(opensimMocoJNI.new_MocoAngularVelocityTrackingGoal__SWIG_2(name, weight), true);
  }

  /**
   *  Set directly the angular velocities of individual frames in ground to be<br>
   *     tracked in the cost. The column labels of the provided reference must<br>
   *     be paths to frames in the model, e.g. `/bodyset/torso`. If the<br>
   *     frame_paths property is empty, all frames with data in this reference<br>
   *     will be tracked. Otherwise, only the frames specified via<br>
   *     setFramePaths() will be tracked. Calling this function clears the values<br>
   *     provided via setStatesReference(), setAngularVelocityReference(), or the<br>
   *     `states_reference_file` property, if any. 
   */
  public void setAngularVelocityReferenceFile(String filepath) {
    opensimMocoJNI.MocoAngularVelocityTrackingGoal_setAngularVelocityReferenceFile(swigCPtr, this, filepath);
  }

  /**
   *  Each column label must be the path of a valid frame path (see<br>
   *     setAngularVelocityReferenceFile()). Calling this function clears the<br>
   *     `states_reference_file` and `angular_velocity_reference_file` properties<br>
   *     or the table provided via setStatesReference(), if any. 
   */
  public void setAngularVelocityReference(TimeSeriesTableVec3 ref) {
    opensimMocoJNI.MocoAngularVelocityTrackingGoal_setAngularVelocityReference(swigCPtr, this, TimeSeriesTableVec3.getCPtr(ref), ref);
  }

  /**
   *  Provide a table containing values of model state<br>
   *     variables. These data are used to create a StatesTrajectory internally,<br>
   *     from which the angular velocity data for the frames specified in<br>
   *     setFramePaths() are computed. Each column label in the reference must be<br>
   *     the path of a state variable, e.g., `/jointset/ankle_angle_r/value`.<br>
   *     Calling this function clears the table provided via<br>
   *     setAngularVelocityReference(), or the<br>
   *     `angular_velocity_reference_file` property, if any. The table is not<br>
   *     loaded until the MocoProblem is initialized. 
   */
  public void setStatesReference(TableProcessor ref) {
    opensimMocoJNI.MocoAngularVelocityTrackingGoal_setStatesReference(swigCPtr, this, TableProcessor.getCPtr(ref), ref);
  }

  /**
   *  Set the paths to frames in the model that this cost term will track. The<br>
   *     names set here must correspond to OpenSim::Component%s that derive from<br>
   *     OpenSim::Frame, which includes 'angular_velocity' (SimTK::Vec3) as an<br>
   *     output. Replaces the frame path set if it already exists. 
   */
  public void setFramePaths(StdVectorString paths) {
    opensimMocoJNI.MocoAngularVelocityTrackingGoal_setFramePaths(swigCPtr, this, StdVectorString.getCPtr(paths), paths);
  }

  /**
   *  Set the weight for an individual frame's angular velocity tracking. If a<br>
   *     weight is already set for the requested frame, then the provided weight<br>
   *     replaces the previous weight. An exception is thrown if a weight<br>
   *     for an unknown frame is provided. 
   */
  public void setWeightForFrame(String frameName, double weight) {
    opensimMocoJNI.MocoAngularVelocityTrackingGoal_setWeightForFrame(swigCPtr, this, frameName, weight);
  }

  /**
   *  Provide a MocoWeightSet to weight frame angular velocity tracking in the<br>
   *     cost. Replaces the weight set if it already exists. 
   */
  public void setWeightSet(MocoWeightSet weightSet) {
    opensimMocoJNI.MocoAngularVelocityTrackingGoal_setWeightSet(swigCPtr, this, MocoWeightSet.getCPtr(weightSet), weightSet);
  }

  /**
   *  If no states reference has been provided, this returns an empty<br>
   *     processor. 
   */
  public TableProcessor getStatesReference() {
    return new TableProcessor(opensimMocoJNI.MocoAngularVelocityTrackingGoal_getStatesReference(swigCPtr, this), false);
  }

  /**
   *  If no angular velocity reference file has been provided, this returns an<br>
   *     empty string. 
   */
  public String getAngularVelocityReferenceFile() {
    return opensimMocoJNI.MocoAngularVelocityTrackingGoal_getAngularVelocityReferenceFile(swigCPtr, this);
  }

}