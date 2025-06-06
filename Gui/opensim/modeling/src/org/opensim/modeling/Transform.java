/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * This class represents the rotate-and-shift transform which gives the <br>
 * location and orientation of a new frame F in a base (reference) frame<br>
 * B. A frame is an orthogonal, right-handed set of three axes, and an<br>
 * origin point. A transform X from frame B to F consists of 3 perpendicular<br>
 * unit vectors defining F's axes as viewed from B (that is, as expressed in <br>
 * the basis formed by B's axes), and a vector from B's origin point OB to F's<br>
 * origin point OF. Note that the meaning of "B" comes from the context in<br>
 * which the transform is used. We use the phrase "frame F is in frame B" to<br>
 * describe the above relationship, that is, "in" means both measured from<br>
 * and expressed in. <br>
 * <br>
 * The axis vectors constitute a Rotation. They are ordered 1-2-3 or x-y-z<br>
 * as you prefer, with z = x X y, making a right-handed set. These axes are <br>
 * arranged as columns of a 3x3 rotation matrix R_BF = [ x y z ] which is a <br>
 * direction cosine (rotation) matrix useful for conversions between frame <br>
 * B and F. (The columns of R_BF are F's coordinate axes, expressed in B.) For<br>
 * example, given a vector vF expressed in the F frame, that same vector<br>
 * re-expressed in B is given by vB = R_BF*vF. F's origin point OF is <br>
 * stored as the translation vector p_BF=(OF-OB) and expressed in B.<br>
 * <br>
 * Transform is designed to behave as much as possible like the computer<br>
 * graphics 4x4 transform X which would be arranged like this:<br>
 * <pre><br>
 * <br>
 *         [       |   ]<br>
 *     X = [   R   | p ]    R is a 3x3 orthogonal rotation matrix<br>
 *         [.......|...]    p os a 3x1 translation vector<br>
 *         [ 0 0 0   1 ]<br>
 * </pre><br>
 * <br>
 * These can be composed directly by matrix multiplication, but more <br>
 * importantly they have a particularly simple inverse:<br>
 * <pre><br>
 * <br>
 *    -1   [       |    ]<br>
 *   X   = [  ~R   | p* ]   ~R is R transpose, p* = ~R(-p).<br>
 *         [.......|....]<br>
 *         [ 0 0 0   1  ] <br>
 * </pre><br>
 * <br>
 * This inverse is so simple that we compute it simply by defining another<br>
 * type, InverseTransform, which is identical to Transform in memory but<br>
 * behaves as though it contains the inverse. That way we invert just by<br>
 * changing point of view (recasting) rather than computing.<br>
 * <br>
 * This is a "POD" (plain old data) class with a well-defined memory<br>
 * layout on which a client of this class may depend: There are <br>
 * exactly 4 consecutive, packed 3-vectors in the order x,y,z,p.<br>
 * That is, this class is equivalent to an array of 12 Reals with <br>
 * the order x1,x2,x3,y1,y2,y3,z1,z2,z3,p1,p2,p3. It is expressly allowed<br>
 * to reinterpret Transform objects in any appropriate manner that depends<br>
 * on this memory layout.
 */
public class Transform {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Transform(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Transform obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(Transform obj) {
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
        opensimSimbodyJNI.delete_Transform(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Default constructor gives an identity transform.
   */
  public Transform() {
    this(opensimSimbodyJNI.new_Transform__SWIG_0(), true);
  }

  /**
   *  Combine a rotation and a translation into a transform.
   */
  public Transform(Rotation R, Vec3 p) {
    this(opensimSimbodyJNI.new_Transform__SWIG_1(Rotation.getCPtr(R), R, Vec3.getCPtr(p), p), true);
  }

  /**
   *  Construct or default-convert a rotation into a transform<br>
   *  containing that rotation and zero translation.
   */
  public Transform(Rotation R) {
    this(opensimSimbodyJNI.new_Transform__SWIG_2(Rotation.getCPtr(R), R), true);
  }

  /**
   *  Construct or default-convert a translation (expressed as a Vec3)<br>
   *  into a transform with that translation and a zero rotation.
   */
  public Transform(Vec3 p) {
    this(opensimSimbodyJNI.new_Transform__SWIG_3(Vec3.getCPtr(p), p), true);
  }

  /**
   *  Assign a new value to this transform, explicitly providing<br>
   *  the rotation and translation separately. We return a reference to<br>
   *  the now-modified transform as though this were an assignment operator.
   */
  public Transform set(Rotation R, Vec3 p) {
    return new Transform(opensimSimbodyJNI.Transform_set(swigCPtr, this, Rotation.getCPtr(R), R, Vec3.getCPtr(p), p), false);
  }

  /**
   *  By zero we mean "zero transform", i.e., an identity rotation<br>
   *  and zero translation. We return a reference to the now-modified<br>
   *  transform as though this were an assignment operator. 
   */
  public Transform setToZero() {
    return new Transform(opensimSimbodyJNI.Transform_setToZero(swigCPtr, this), false);
  }

  /**
   *  This fills both the rotation and translation with NaNs. Note: this is<br>
   *  <i>not</i> the same as a default-constructed transform, which is a<br>
   *  legitimate identity transform instead. We return a reference to the now-modified<br>
   *  transform as though this were an assignment operator. 
   */
  public Transform setToNaN() {
    return new Transform(opensimSimbodyJNI.Transform_setToNaN(swigCPtr, this), false);
  }

  /**
   *  Return a read-only inverse of the current Transform_<p>, simply by casting it to<br>
   *  the InverseTransform_<p> type. Zero cost.
   */
  public SWIGTYPE_p_SimTK__InverseTransform_T_double_t invert() {
    return new SWIGTYPE_p_SimTK__InverseTransform_T_double_t(opensimSimbodyJNI.Transform_invert(swigCPtr, this), false);
  }

  /**
   *  Return a writable (lvalue) inverse of the current transform, simply by casting it to<br>
   *  the InverseTransform_<p> type. That is, this is an lvalue. Zero cost.
   */
  public SWIGTYPE_p_SimTK__InverseTransform_T_double_t updInvert() {
    return new SWIGTYPE_p_SimTK__InverseTransform_T_double_t(opensimSimbodyJNI.Transform_updInvert(swigCPtr, this), false);
  }

  /**
   *  Compose the current transform (X_BF) with the given one. That is,<br>
   *  return X_BY=X_BF*X_FY. Cost is 63 flops.
   */
  public Transform compose(Transform X_FY) {
    return new Transform(opensimSimbodyJNI.Transform_compose__SWIG_0(swigCPtr, this, Transform.getCPtr(X_FY), X_FY), true);
  }

  /**
   *  Compose the current transform (X_BF) with one that is supplied<br>
   *  as an InverseTransform_ (typically as a result of applying<br>
   *  the "~" operator to a transform). That is, return <br>
   *  X_BY=X_BF*X_FY, but now X_FY is represented as ~X_YF. Cost<br>
   *  is an extra 18 flops to calculate X_FY.p(), total 81 flops.
   */
  public Transform compose(SWIGTYPE_p_SimTK__InverseTransform_T_double_t X_FY) {
    return new Transform(opensimSimbodyJNI.Transform_compose__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__InverseTransform_T_double_t.getCPtr(X_FY)), true);
  }

  /**
   *  %Transform a vector expressed in our "F" frame to our "B" frame.<br>
   *  Note that this involves rotation only; it is independent of<br>
   *  the translation stored in this transform. Cost is 15 flops.
   */
  public Vec3 xformFrameVecToBase(Vec3 vF) {
    return new Vec3(opensimSimbodyJNI.Transform_xformFrameVecToBase(swigCPtr, this, Vec3.getCPtr(vF), vF), true);
  }

  /**
   *  %Transform a vector expressed in our "B" frame to our "F" frame.<br>
   *  Note that this involves rotation only; it is independent of<br>
   *  the translation stored in this transform. Cost is 15 flops.
   */
  public Vec3 xformBaseVecToFrame(Vec3 vB) {
    return new Vec3(opensimSimbodyJNI.Transform_xformBaseVecToFrame(swigCPtr, this, Vec3.getCPtr(vB), vB), true);
  }

  /**
   *  %Transform a point (station) measured from and expressed in<br>
   *  our "F" frame to that same point but measured from and<br>
   *  expressed in our "B" frame. Cost is 18 flops.
   */
  public Vec3 shiftFrameStationToBase(Vec3 sF) {
    return new Vec3(opensimSimbodyJNI.Transform_shiftFrameStationToBase(swigCPtr, this, Vec3.getCPtr(sF), sF), true);
  }

  /**
   *  %Transform a point (station) measured from and expressed in<br>
   *  our "B" frame to that same point but measured from and<br>
   *  expressed in our "F" frame. Cost is 18 flops.
   */
  public Vec3 shiftBaseStationToFrame(Vec3 sB) {
    return new Vec3(opensimSimbodyJNI.Transform_shiftBaseStationToFrame(swigCPtr, this, Vec3.getCPtr(sB), sB), true);
  }

  /**
   *  Return a read-only reference to the contained rotation R_BF.
   */
  public Rotation R() {
    return new Rotation(opensimSimbodyJNI.Transform_R(swigCPtr, this), false);
  }

  /**
   *  Return a read-only reference to the inverse (transpose) of<br>
   *  our contained rotation, that is R_FB.
   */
  public InverseRotation RInv() {
    return new InverseRotation(opensimSimbodyJNI.Transform_RInv(swigCPtr, this), false);
  }

  /**
   *  Return a read-only reference to our translation vector p_BF.
   */
  public Vec3 p() {
    return new Vec3(opensimSimbodyJNI.Transform_p(swigCPtr, this), false);
  }

  /**
   *  Assign a new value to our translation vector. We expect the<br>
   *  supplied vector <code>p</code> to be expressed in our B frame. A reference<br>
   *  to the now-modified transform is returned as though this were<br>
   *  an assignment operator.
   */
  public Transform setP(Vec3 p) {
    return new Transform(opensimSimbodyJNI.Transform_setP(swigCPtr, this, Vec3.getCPtr(p), p), false);
  }

  /**
   *  Calculate the inverse of the translation vector in this transform.<br>
   *  The returned vector will be the negative of the original and will<br>
   *  be expressed in the F frame rather than our B frame. Cost is 18 flops.
   */
  public Vec3 pInv() {
    return new Vec3(opensimSimbodyJNI.Transform_pInv(swigCPtr, this), true);
  }

  /**
   *  Assign a value to the <i>inverse</i> of our translation vector.<br>
   *  That is, we're given a vector in F which we invert and reexpress<br>
   *  in B to store it in p, so that we get the original argument back if<br>
   *  we ask for the inverse of p. Sorry, can't update pInv as an lvalue, but here we<br>
   *  want -(~R_BF*p_BF)=p_FB =&gt; p_BF=-(R_BF*p_FB) so we can calculate<br>
   *  it in 18 flops. A reference to the now-modified transform is returned<br>
   *  as though this were an assignment operator.
   */
  public Transform setPInv(Vec3 p_FB) {
    return new Transform(opensimSimbodyJNI.Transform_setPInv(swigCPtr, this, Vec3.getCPtr(p_FB), p_FB), false);
  }

  /**
   *  Recast this transform as a read-only 3x4 matrix. This is a zero-cost<br>
   *  reinterpretation of the data; the first three columns are the<br>
   *  columns of the rotation and the last column is the translation.
   */
  public SWIGTYPE_p_SimTK__MatT_3_4_double_3_1_t asMat34() {
    return new SWIGTYPE_p_SimTK__MatT_3_4_double_3_1_t(opensimSimbodyJNI.Transform_asMat34(swigCPtr, this), false);
  }

  /**
   *  Less efficient version of asMat34(); copies into return variable.
   */
  public SWIGTYPE_p_SimTK__MatT_3_4_double_3_1_t toMat34() {
    return new SWIGTYPE_p_SimTK__MatT_3_4_double_3_1_t(opensimSimbodyJNI.Transform_toMat34(swigCPtr, this), true);
  }

  /**
   *  Return the equivalent 4x4 transformation matrix.
   */
  public SWIGTYPE_p_SimTK__MatT_4_4_double_4_1_t toMat44() {
    return new SWIGTYPE_p_SimTK__MatT_4_4_double_4_1_t(opensimSimbodyJNI.Transform_toMat44(swigCPtr, this), true);
  }

  public Vec3 T() {
    return new Vec3(opensimSimbodyJNI.Transform_T(swigCPtr, this), false);
  }

}
