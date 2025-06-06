/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Class Geometry is intended to be used as the base class for all<br>
 *  geometry that needs to be represented in the system, including mesh files, <br>
 *  and built in analytic shapes. Any ModelComponent can specify a list of<br>
 *  Geometry items to represent itself in graphics window. The relation between<br>
 *  a ModelComponent and specific Geometry utilizes the Component mechanism, as<br>
 *  the specific pieces of geometry are treated as subcomponents. The placement<br>
 *  of the Geometry in 3D space is computed from the Frame that the Geometry is<br>
 *  "Connected" to.<br>
 * <br>
 *  Geometry (and all its subclasses) serve as the set of higher level primitives<br>
 *  available to OpenSim component writers to express the Geometry of interest.<br>
 *  The Geometry class handles serialization and also the translation to a set of<br>
 *  DecorativeGeometry objects that gets passed to the Visualization system to be<br>
 *  rendered. <br>
 * <br>
 *  @author Ayman Habib
 */
public class Geometry extends Component {
  private transient long swigCPtr;

  public Geometry(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Geometry_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Geometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(Geometry obj) {
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
        opensimSimulationJNI.delete_Geometry(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Geometry safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Geometry_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Geometry(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Geometry_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Geometry_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Geometry_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Geometry_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_scale_factors(Geometry source) {
    opensimSimulationJNI.Geometry_copyProperty_scale_factors(swigCPtr, this, Geometry.getCPtr(source), source);
  }

  public Vec3 get_scale_factors(int i) {
    return new Vec3(opensimSimulationJNI.Geometry_get_scale_factors__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_scale_factors(int i) {
    return new Vec3(opensimSimulationJNI.Geometry_upd_scale_factors__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_scale_factors(int i, Vec3 value) {
    opensimSimulationJNI.Geometry_set_scale_factors__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_scale_factors(Vec3 value) {
    return opensimSimulationJNI.Geometry_append_scale_factors(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_scale_factors(Vec3 initValue) {
    opensimSimulationJNI.Geometry_constructProperty_scale_factors(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_scale_factors() {
    return new Vec3(opensimSimulationJNI.Geometry_get_scale_factors__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_scale_factors() {
    return new Vec3(opensimSimulationJNI.Geometry_upd_scale_factors__SWIG_1(swigCPtr, this), false);
  }

  public void set_scale_factors(Vec3 value) {
    opensimSimulationJNI.Geometry_set_scale_factors__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_Appearance(Geometry source) {
    opensimSimulationJNI.Geometry_copyProperty_Appearance(swigCPtr, this, Geometry.getCPtr(source), source);
  }

  public Appearance get_Appearance(int i) {
    return new Appearance(opensimSimulationJNI.Geometry_get_Appearance__SWIG_0(swigCPtr, this, i), false);
  }

  public Appearance upd_Appearance(int i) {
    return new Appearance(opensimSimulationJNI.Geometry_upd_Appearance__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_Appearance(int i, Appearance value) {
    opensimSimulationJNI.Geometry_set_Appearance__SWIG_0(swigCPtr, this, i, Appearance.getCPtr(value), value);
  }

  public int append_Appearance(Appearance value) {
    return opensimSimulationJNI.Geometry_append_Appearance(swigCPtr, this, Appearance.getCPtr(value), value);
  }

  public void constructProperty_Appearance(Appearance initValue) {
    opensimSimulationJNI.Geometry_constructProperty_Appearance(swigCPtr, this, Appearance.getCPtr(initValue), initValue);
  }

  public Appearance get_Appearance() {
    return new Appearance(opensimSimulationJNI.Geometry_get_Appearance__SWIG_1(swigCPtr, this), false);
  }

  public Appearance upd_Appearance() {
    return new Appearance(opensimSimulationJNI.Geometry_upd_Appearance__SWIG_1(swigCPtr, this), false);
  }

  public void set_Appearance(Appearance value) {
    opensimSimulationJNI.Geometry_set_Appearance__SWIG_1(swigCPtr, this, Appearance.getCPtr(value), value);
  }

  public void setPropertyIndex_socket_frame(SWIGTYPE_p_OpenSim__PropertyIndex value) {
    opensimSimulationJNI.Geometry_PropertyIndex_socket_frame_set(swigCPtr, this, SWIGTYPE_p_OpenSim__PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_OpenSim__PropertyIndex getPropertyIndex_socket_frame() {
    return new SWIGTYPE_p_OpenSim__PropertyIndex(opensimSimulationJNI.Geometry_PropertyIndex_socket_frame_get(swigCPtr, this), true);
  }

  public SWIGTYPE_p_OpenSim__PropertyIndex constructSocket_frame() {
    return new SWIGTYPE_p_OpenSim__PropertyIndex(opensimSimulationJNI.Geometry_constructSocket_frame(swigCPtr, this), true);
  }

  public void connectSocket_frame(OpenSimObject object) {
    opensimSimulationJNI.Geometry_connectSocket_frame(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void setPropertyIndex_input_transform(SWIGTYPE_p_OpenSim__PropertyIndex value) {
    opensimSimulationJNI.Geometry_PropertyIndex_input_transform_set(swigCPtr, this, SWIGTYPE_p_OpenSim__PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_OpenSim__PropertyIndex getPropertyIndex_input_transform() {
    return new SWIGTYPE_p_OpenSim__PropertyIndex(opensimSimulationJNI.Geometry_PropertyIndex_input_transform_get(swigCPtr, this), true);
  }

  public void connectInput_transform(AbstractOutput output, String alias) {
    opensimSimulationJNI.Geometry_connectInput_transform__SWIG_0(swigCPtr, this, AbstractOutput.getCPtr(output), output, alias);
  }

  public void connectInput_transform(AbstractOutput output) {
    opensimSimulationJNI.Geometry_connectInput_transform__SWIG_1(swigCPtr, this, AbstractOutput.getCPtr(output), output);
  }

  public void connectInput_transform(AbstractChannel channel, String alias) {
    opensimSimulationJNI.Geometry_connectInput_transform__SWIG_2(swigCPtr, this, AbstractChannel.getCPtr(channel), channel, alias);
  }

  public void connectInput_transform(AbstractChannel channel) {
    opensimSimulationJNI.Geometry_connectInput_transform__SWIG_3(swigCPtr, this, AbstractChannel.getCPtr(channel), channel);
  }

  /**
   *  Interface methods to handle the Frame which the Geometry is attached to.  %Set the Frame of attachment *
   */
  public void setFrame(Frame frame) {
    opensimSimulationJNI.Geometry_setFrame(swigCPtr, this, Frame.getCPtr(frame), frame);
  }

  /**
   *  Return a reference to the name of the Frame to which<br>
   *     this Geometry is attached (using a Socket). * Return a reference to the actual Frame to which this Geometry<br>
   *     is attached. 
   */
  public Frame getFrame() {
    return new Frame(opensimSimulationJNI.Geometry_getFrame(swigCPtr, this), false);
  }

  /**
   *  Convenient access to set Appearance/Color<br>
   *  color is RGB, each components is in the range [0, 1].
   */
  public void setColor(Vec3 color) {
    opensimSimulationJNI.Geometry_setColor(swigCPtr, this, Vec3.getCPtr(color), color);
  }

  /**
   *  Convenient access to get Appearance/Color<br>
   *  returns RGB , each components is in the range [0, 1].
   */
  public Vec3 getColor() {
    return new Vec3(opensimSimulationJNI.Geometry_getColor(swigCPtr, this), false);
  }

  /**
   *  Convenient access to set Appearance/Opacity
   */
  public void setOpacity(double opacity) {
    opensimSimulationJNI.Geometry_setOpacity(swigCPtr, this, opacity);
  }

  /**
   *  Convenient access to get Appearance/Opacity
   */
  public double getOpacity() {
    return opensimSimulationJNI.Geometry_getOpacity(swigCPtr, this);
  }

  /**
   *  Convenient access to set Appearance/representation
   */
  public void setRepresentation(DecorativeGeometry.Representation rep) {
    opensimSimulationJNI.Geometry_setRepresentation(swigCPtr, this, rep.swigValue());
  }

  /**
   *  Convenient access to get Appearance/representation
   */
  public DecorativeGeometry.Representation getRepresentation() {
    return DecorativeGeometry.Representation.swigToEnum(opensimSimulationJNI.Geometry_getRepresentation(swigCPtr, this));
  }

  /**
   *  Implement method from Component interface. Subclasses only need to <br>
   *  implement implementCreateDecorativeGeometry to generate an Array of <br>
   *  SimTK::DecorativeGeometry. From then on, setting Transforms &amp; Appearance <br>
   *  is handled by the base class Geometry to avoid duplication. 
   */
  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimSimulationJNI.Geometry_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}
