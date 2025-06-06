/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class OpenSenseUtilities {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public OpenSenseUtilities(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(OpenSenseUtilities obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(OpenSenseUtilities obj) {
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
        opensimSimulationJNI.delete_OpenSenseUtilities(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Apply the passed in Rotation matrix to a TimeSeriesTable of Quaternions.<br>
   *         The rotation is done in place so the table passed in is modified
   */
  public static void rotateOrientationTable(TimeSeriesTableQuaternion quaternionsTable, Rotation rotationMatrix) {
    opensimSimulationJNI.OpenSenseUtilities_rotateOrientationTable(TimeSeriesTableQuaternion.getCPtr(quaternionsTable), quaternionsTable, Rotation.getCPtr(rotationMatrix), rotationMatrix);
  }

  /**
   *  Convert a TimeSeriesTable with quaternions as data elements into a TimeSeriesTable<br>
   *         of Rotation matrices.
   */
  public static TimeSeriesTableRotation convertQuaternionsToRotations(TimeSeriesTableQuaternion qauternionsTable) {
    return new TimeSeriesTableRotation(opensimSimulationJNI.OpenSenseUtilities_convertQuaternionsToRotations(TimeSeriesTableQuaternion.getCPtr(qauternionsTable), qauternionsTable), true);
  }

  /**
   *  Compute a SimTK::Vec3 of Space-fixed XYZ Euler angles that aligns the<br>
   *        specified baseIMU and CoordinateDirection combination with the positive<br>
   *        X-axis (= typically forward) direction of the base segment in OpenSim<br>
   *        model. Base segment is typically the segment attached directly to Ground.<br>
   *        baseIMU is assumed to be placed on Base segment. Passed in state places<br>
   *        the model in the same configuration as the first frame of the<br>
   *        passed in table of quaternions quatTimeSeries.
   */
  public static Vec3 computeHeadingCorrection(Model model, State state, TimeSeriesTableQuaternion quatTimeSeries, String baseIMU, CoordinateDirection arg4) {
    return new Vec3(opensimSimulationJNI.OpenSenseUtilities_computeHeadingCorrection(Model.getCPtr(model), model, State.getCPtr(state), state, TimeSeriesTableQuaternion.getCPtr(quatTimeSeries), quatTimeSeries, baseIMU, CoordinateDirection.getCPtr(arg4), arg4), true);
  }

  /**
   *  <br>
   * Create Orientations as a TimeSeriesTable based on passed in markerFile
   */
  public static TimeSeriesTableQuaternion createOrientationsFileFromMarkers(String markersFile) {
    return new TimeSeriesTableQuaternion(opensimSimulationJNI.OpenSenseUtilities_createOrientationsFileFromMarkers(markersFile), true);
  }

  /**
   *  form a Transform from 3 points origin (op), along x (xp - op), along y(yp - op)
   */
  public static Transform formTransformFromPoints(Vec3 op, Vec3 xp, Vec3 yp) {
    return new Transform(opensimSimulationJNI.OpenSenseUtilities_formTransformFromPoints(Vec3.getCPtr(op), op, Vec3.getCPtr(xp), xp, Vec3.getCPtr(yp), yp), true);
  }

  /**
   *  Add IMUs to passed in model and return references to them<br>
   *  based on paths specification. <br>
   *  - If "paths" refer to user specified list of frames, then one new <br>
   *      "{Frame}_imu" is added to the model and returned in result.
   */
  public static StdVectorIMUs addModelIMUs(Model model, StdVectorString paths) {
    return new StdVectorIMUs(opensimSimulationJNI.OpenSenseUtilities_addModelIMUs(Model.getCPtr(model), model, StdVectorString.getCPtr(paths), paths), true);
  }

  public OpenSenseUtilities() {
    this(opensimSimulationJNI.new_OpenSenseUtilities(), true);
  }

}
