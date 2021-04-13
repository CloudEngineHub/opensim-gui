/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  A container for %Moco weights. The meaning of the weights depends upon<br>
 * where they are used. This container can be written to and read from an<br>
 * XML file. 
 */
public class MocoWeightSet extends SetMocoWeight {
  private transient long swigCPtr;

  public MocoWeightSet(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoWeightSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoWeightSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimMocoJNI.delete_MocoWeightSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoWeightSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoWeightSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoWeightSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoWeightSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoWeightSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoWeightSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoWeightSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoWeightSet_getConcreteClassName(swigCPtr, this);
  }

  public MocoWeightSet() {
    this(opensimMocoJNI.new_MocoWeightSet__SWIG_0(), true);
  }

  public MocoWeightSet(String filename) {
    this(opensimMocoJNI.new_MocoWeightSet__SWIG_1(filename), true);
  }

}