/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A Quaternion is a Vec4 with the following behavior:<br>
 *   - its length is always 1 (or else it is all NaN)<br>
 *   - it is equivalent to an angle/axis rotation for<br>
 *     angle a, axis unit vector v, as:  q = [ cos(a/2) sin(a/2)*v ]<br>
 * A quaternion is in "canonical form" when its first element is nonnegative. <br>
 * This corresponds to rotation angles in the range -180 &lt; a &lt;= 180 degrees. <br>
 * Quaternions are not required to be in canonical form (e.g., during numerical<br>
 * integration). When appropriate, they are put in canonical form.<br>
 * <br>
 * Conversion from quaternion to (angle,axis) form is handled here also. <br>
 * (angle,axis) is in canonical form when -180 &lt; angle &lt;= 180 and |axis|=1.<br>
 * However, (angle,axis) is meaningful for any angle and for any axis where <br>
 * |axis| &gt; 0.
 */
public class Quaternion extends Vec4 {
  private transient long swigCPtr;

  public Quaternion(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.Quaternion_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Quaternion obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(Quaternion obj) {
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
        opensimSimbodyJNI.delete_Quaternion(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Default constructor produces the ZeroRotation quaternion [1 0 0 0] <br>
   *  (not NaN - even in debug mode).
   */
  public Quaternion() {
    this(opensimSimbodyJNI.new_Quaternion__SWIG_0(), true);
  }

  /**
   *  Zero-cost copy constructor just copies the source without conversion to <br>
   *  canonical form or normalization.
   */
  public Quaternion(Quaternion q) {
    this(opensimSimbodyJNI.new_Quaternion__SWIG_1(Quaternion.getCPtr(q), q), true);
  }

  /**
   *  Construct a quaternion from four scalars and normalize the result,<br>
   *  which costs about 40 flops.
   */
  public Quaternion(double e0, double e1, double e2, double e3) {
    this(opensimSimbodyJNI.new_Quaternion__SWIG_2(e0, e1, e2, e3), true);
  }

  /**
   *  Construct a quaternion from a 4-vector and normalize the result,<br>
   *  which costs about 40 flops.
   */
  public Quaternion(Vec4 q) {
    this(opensimSimbodyJNI.new_Quaternion__SWIG_3(Vec4.getCPtr(q), q), true);
  }

  /**
   *  The ZeroRotation quaternion is [1 0 0 0]. Note: Default constructor <br>
   *  is ZeroRotation (unlike Vec&lt;4,P&gt; which start as NaN in Debug mode).
   */
  public void setQuaternionToZeroRotation() {
    opensimSimbodyJNI.Quaternion_setQuaternionToZeroRotation(swigCPtr, this);
  }

  /**
   *  Set quaternion to all-NaN. Note that this is not the same as produced<br>
   *  by default construction, even in Debug mode -- default construction<br>
   *  always produces an identity rotation of [1 0 0 0].
   */
  public void setQuaternionToNaN() {
    opensimSimbodyJNI.Quaternion_setQuaternionToNaN(swigCPtr, this);
  }

  /**
   *  Normalize an already constructed quaternion in place; but do you really<br>
   *  need to do this? Quaternions should be kept normalized at all times. <br>
   *  One of the advantages of using them is that you don't have to check if <br>
   *  they are normalized or renormalize them. However, under some situations<br>
   *  they do need renormalization, but it is costly if you don't actually <br>
   *  need it. If the quaternion is <i>exactly</i> zero, set it to [1 0 0 0]. If <br>
   *  its magnitude is 0 &lt; magnitude &lt; epsilon  (epsilon is machine <br>
   *  tolerance), set it to NaN (treated as an error). Otherwise, normalize <br>
   *  the quaternion which costs about 40 flops. The quaternion is NOT put <br>
   *  in canonical form.
   */
  public Quaternion normalizeThis() {
    return new Quaternion(opensimSimbodyJNI.Quaternion_normalizeThis(swigCPtr, this), false);
  }

  /**
   *  Return a normalized copy of this quaternion; but do you really need to<br>
   *  do this? Quaternions should be kept normalized at all times. One of<br>
   *  the advantages of using them is that you don't have to check if they<br>
   *  are normalized or renormalize them. However, under some situations they<br>
   *  do need renormalization, but it is costly if you don't actually need it.<br>
   *  @see normalizeThis() for details.
   */
  public Quaternion normalize() {
    return new Quaternion(opensimSimbodyJNI.Quaternion_normalize(swigCPtr, this), true);
  }

  /**
   *  Use this constructor only if you are *sure* v is normalized to 1.0.<br>
   *  This zero cost method is faster than the Quaternion(Vec4) constructor <br>
   *  which normalizes the Vec4. The second argument forces the compiler to <br>
   *  call the fast constructor; it is otherwise ignored. By convention, set <br>
   *  the second argument to "true". 
   */
  public Quaternion(Vec4 v, boolean arg1) {
    this(opensimSimbodyJNI.new_Quaternion__SWIG_4(Vec4.getCPtr(v), v, arg1), true);
  }

}
