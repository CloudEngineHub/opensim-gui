/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * An OpenSim Joint is an OpenSim::ModelComponent which connects two PhysicalFrames<br>
 * together and specifies their relative permissible motion as described in<br>
 * internal coordinates. The base Joint specifies two frames (e.g. one per body),<br>
 * which the joint spans. The relative motion (including the # of coordinates)<br>
 * are defined by concrete Joints, which specify the permissible kinematics of<br>
 * a child joint frame (on a child body) with respect to a parent joint frame<br>
 * (on a parent body). The designation of parent and child are used only to<br>
 * identify the directionality of the joint and in which frame the joint<br>
 * coordinates are expressed.<br>
 * <br>
 * For example, A PinJoint between a parent frame, P, and a child frame, B,<br>
 * has a coordinate value of zero when the two frames are aligned and<br>
 * positive coordinate values are the angle between the frames' X-axes given<br>
 * a positive Z-rotation of the child frame about the coincident Z-axis in<br>
 * the parent frame.<br>
 * <br>
 * Note: the parent and child frames must be added to the model by the time<br>
 *       you call initSystem() on the model.<br>
 * <br>
 * Concrete Joints can specify relative translations and even coupled<br>
 * rotations and translations (see EllipsoidJoint and CustomJoint). For more<br>
 * details on how the underlying formulation supports coupled curvilinear<br>
 * joints, see "Minimal formulation of joint motion for biomechanisms", 2010<br>
 * A Seth, M Sherman, P Eastman, S Delp; Nonlinear dynamics 62 (1), 291-303<br>
 * <br>
 * <b>C++ example</b><br>
 * {@code 
Define a pin joint that attaches pendulum (an OpenSim::Body) to ground.
PinJoint* myPin = new PinJoint("pendulumToGround", myModel.getGround(),
                               pendulum);
}<br>
 * <br>
 * <b>Python example</b><br>
 * {@code 
    # Define a ball joint between blockA and blockB.
    abJoint = osim.BallJoint('JointName', blockA, blockB)
}<br>
 * <br>
 * If you want to connect to an existing PhysicalFrame (e.g., a Body or Ground)<br>
 * but not to its origin, you can create and connect to a PhysicalOffsetFrame; the<br>
 * following convenience constructor does this for you:<br>
 * <br>
 * <b>C++ example</b><br>
 * {@code 
Define a pin joint that attaches the end of pendulum to the ground origin.
PinJoint* myPin = new PinJoint("pendulumToGround",
                               myModel.getGround(),   //parent PhysicalFrame
                               Vec3(0),               //location in parent
                               Vec3(0),               //orientation in parent
                               pendulum,              //child PhysicalFrame
                               Vec3(0,-length/2.,0),  //location in child
                               Vec3(0));              //orientation in child
}<br>
 * <br>
 * <br>
 * @author Ajay Seth
 */
public class Joint extends ModelComponent {
  private transient long swigCPtr;

  public Joint(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Joint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Joint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(Joint obj) {
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
        opensimSimulationJNI.delete_Joint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Joint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Joint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Joint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Joint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Joint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Joint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Joint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Joint_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_coordinates(Joint source) {
    opensimSimulationJNI.Joint_copyProperty_coordinates(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public Coordinate get_coordinates(int i) {
    return new Coordinate(opensimSimulationJNI.Joint_get_coordinates(swigCPtr, this, i), false);
  }

  public Coordinate upd_coordinates(int i) {
    return new Coordinate(opensimSimulationJNI.Joint_upd_coordinates(swigCPtr, this, i), false);
  }

  public void set_coordinates(int i, Coordinate value) {
    opensimSimulationJNI.Joint_set_coordinates(swigCPtr, this, i, Coordinate.getCPtr(value), value);
  }

  public int append_coordinates(Coordinate value) {
    return opensimSimulationJNI.Joint_append_coordinates(swigCPtr, this, Coordinate.getCPtr(value), value);
  }

  public void constructProperty_coordinates() {
    opensimSimulationJNI.Joint_constructProperty_coordinates(swigCPtr, this);
  }

  public void copyProperty_frames(Joint source) {
    opensimSimulationJNI.Joint_copyProperty_frames(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public PhysicalOffsetFrame get_frames(int i) {
    return new PhysicalOffsetFrame(opensimSimulationJNI.Joint_get_frames(swigCPtr, this, i), false);
  }

  public PhysicalOffsetFrame upd_frames(int i) {
    return new PhysicalOffsetFrame(opensimSimulationJNI.Joint_upd_frames(swigCPtr, this, i), false);
  }

  public void set_frames(int i, PhysicalOffsetFrame value) {
    opensimSimulationJNI.Joint_set_frames(swigCPtr, this, i, PhysicalOffsetFrame.getCPtr(value), value);
  }

  public int append_frames(PhysicalOffsetFrame value) {
    return opensimSimulationJNI.Joint_append_frames(swigCPtr, this, PhysicalOffsetFrame.getCPtr(value), value);
  }

  public void constructProperty_frames() {
    opensimSimulationJNI.Joint_constructProperty_frames(swigCPtr, this);
  }

  public void setPropertyIndex_socket_parent_frame(SWIGTYPE_p_OpenSim__PropertyIndex value) {
    opensimSimulationJNI.Joint_PropertyIndex_socket_parent_frame_set(swigCPtr, this, SWIGTYPE_p_OpenSim__PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_OpenSim__PropertyIndex getPropertyIndex_socket_parent_frame() {
    return new SWIGTYPE_p_OpenSim__PropertyIndex(opensimSimulationJNI.Joint_PropertyIndex_socket_parent_frame_get(swigCPtr, this), true);
  }

  public void connectSocket_parent_frame(OpenSimObject object) {
    opensimSimulationJNI.Joint_connectSocket_parent_frame(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void setPropertyIndex_socket_child_frame(SWIGTYPE_p_OpenSim__PropertyIndex value) {
    opensimSimulationJNI.Joint_PropertyIndex_socket_child_frame_set(swigCPtr, this, SWIGTYPE_p_OpenSim__PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_OpenSim__PropertyIndex getPropertyIndex_socket_child_frame() {
    return new SWIGTYPE_p_OpenSim__PropertyIndex(opensimSimulationJNI.Joint_PropertyIndex_socket_child_frame_get(swigCPtr, this), true);
  }

  public void connectSocket_child_frame(OpenSimObject object) {
    opensimSimulationJNI.Joint_connectSocket_child_frame(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void set_has_output_power(boolean value) {
    opensimSimulationJNI.Joint__has_output_power_set(swigCPtr, this, value);
  }

  public boolean get_has_output_power() {
    return opensimSimulationJNI.Joint__has_output_power_get(swigCPtr, this);
  }

  public void set_has_output_reaction_on_parent(boolean value) {
    opensimSimulationJNI.Joint__has_output_reaction_on_parent_set(swigCPtr, this, value);
  }

  public boolean get_has_output_reaction_on_parent() {
    return opensimSimulationJNI.Joint__has_output_reaction_on_parent_get(swigCPtr, this);
  }

  public void set_has_output_reaction_on_child(boolean value) {
    opensimSimulationJNI.Joint__has_output_reaction_on_child_set(swigCPtr, this, value);
  }

  public boolean get_has_output_reaction_on_child() {
    return opensimSimulationJNI.Joint__has_output_reaction_on_child_get(swigCPtr, this);
  }

  /**
   * Get the child joint frame.<br>
   * <br>
   * @return const PhysicalFrame reference.
   */
  public PhysicalFrame getChildFrame() {
    return new PhysicalFrame(opensimSimulationJNI.Joint_getChildFrame(swigCPtr, this), false);
  }

  /**
   * Get the parent frame to which this joint attaches.<br>
   * <br>
   * @return const ref to parent PhysicalFrame.
   */
  public PhysicalFrame getParentFrame() {
    return new PhysicalFrame(opensimSimulationJNI.Joint_getParentFrame(swigCPtr, this), false);
  }

  /**
   *  Convenience method to get a const reference to the Coordinate associated<br>
   *         with a single-degree-of-freedom Joint. If the Joint has more than one<br>
   *         Coordinate, you must use get_coordinates() or provide the appropriate<br>
   *         argument to the getCoordinate() method defined in the derived class. 
   */
  public Coordinate getCoordinate() {
    return new Coordinate(opensimSimulationJNI.Joint_getCoordinate(swigCPtr, this), false);
  }

  /**
   *  Convenience method to get a writable reference to the Coordinate<br>
   *         associated with a single-degree-of-freedom Joint. If the Joint has more<br>
   *         than one Coordinate, you must use upd_coordinates() or provide the<br>
   *         appropriate argument to the updCoordinate() method defined in the<br>
   *         derived class. 
   */
  public Coordinate updCoordinate() {
    return new Coordinate(opensimSimulationJNI.Joint_updCoordinate(swigCPtr, this), false);
  }

  public int numCoordinates() {
    return opensimSimulationJNI.Joint_numCoordinates(swigCPtr, this);
  }

  public boolean isCoordinateUsed(Coordinate aCoordinate) {
    return opensimSimulationJNI.Joint_isCoordinateUsed(swigCPtr, this, Coordinate.getCPtr(aCoordinate), aCoordinate);
  }

  /**
   *  Add a frame to the *frames* property in this Joint. The frame is<br>
   * adopted, and should have been dynamically allocated.<br>
   * Use this function instead of append_frames(). 
   */
  public void addFrame(PhysicalOffsetFrame frame) {
    opensimSimulationJNI.Joint_addFrame(swigCPtr, this, PhysicalOffsetFrame.getCPtr(frame), frame);
  }

  /**
   *  Given some system mobility (generalized) forces, calculate the <br>
   *     equivalent spatial body force for this Joint. Keep in mind that there are <br>
   *     typically nm &lt; 6 mobilities per joint with an infinite set of solutions that <br>
   *     can map nm gen forces to 6 spatial force components (3 for torque + 3 for <br>
   *     force). The solution returned provides the "most" effective force and torque<br>
   *     in the joint frame. This means the smallest magnitude force and/or torque <br>
   *     that will result in the same generalized force. If a generalized force is <br>
   *     defined along/about a joint axis, then this should be evident in the <br>
   *     reported results as a force or torque on the same axis.  NOTE: Joints <br>
   *     comprised of multiple mobilizers and/or constraints, should override this <br>
   *     method and account for multiple internal components.<br>
   * <br>
   *     @param state containing the generalized coordinate and speed values <br>
   *     @param mobilityForces for the system as computed by inverse dynamics, <br>
   *                           for example <br>
   *     @return spatial force, FB_G, acting on the body connected by this joint at <br>
   *     its location B, expressed in ground.  
   */
  public SpatialVec calcEquivalentSpatialForce(State state, Vector mobilityForces) {
    return new SpatialVec(opensimSimulationJNI.Joint_calcEquivalentSpatialForce(swigCPtr, this, State.getCPtr(state), state, Vector.getCPtr(mobilityForces), mobilityForces), true);
  }

  /**
   *  Joint Reaction forces  Calculate the joint reaction force and moment acting on the parent frame<br>
   *         and expressed in Ground. <br>
   *     @param state containing the generalized coordinate and speed values <br>
   *     @return SpatialVec of reaction force, RP_G, acting on parent frame, P,<br>
   *                 and expressed in ground, G.  
   */
  public SpatialVec calcReactionOnParentExpressedInGround(State state) {
    return new SpatialVec(opensimSimulationJNI.Joint_calcReactionOnParentExpressedInGround(swigCPtr, this, State.getCPtr(state), state), true);
  }

  /**
   *  Calculate the joint reaction force and moment acting on the child frame<br>
   *         and expressed in Ground.<br>
   *     @param state containing the generalized coordinate and speed values <br>
   *     @return SpatialVec of reaction force, RP_G, acting on child frame, C,<br>
   *                 and expressed in ground, G.  
   */
  public SpatialVec calcReactionOnChildExpressedInGround(State state) {
    return new SpatialVec(opensimSimulationJNI.Joint_calcReactionOnChildExpressedInGround(swigCPtr, this, State.getCPtr(state), state), true);
  }

  /**
   *  Joints in general do not contribute power since the reaction space<br>
   *         forces are orthogonal to the mobility space. However, when joint motion <br>
   *         is prescribed, the internal forces that move the joint will do work. In <br>
   *         that case, the power is non-zero and the supplied SimTK::State<br>
   *         must already have been realized to %Acceleration stage so that <br>
   *         constraint forces are available. 
   */
  public double calcPower(State s) {
    return opensimSimulationJNI.Joint_calcPower(swigCPtr, this, State.getCPtr(s), s);
  }

}
