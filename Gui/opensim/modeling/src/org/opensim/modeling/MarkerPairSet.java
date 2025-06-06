/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for holding a set of SimmMarkerPairs.<br>
 * <br>
 * @author Peter Loan<br>
 * @version 1.0
 */
public class MarkerPairSet extends SetMarkerPairs {
  private transient long swigCPtr;

  public MarkerPairSet(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.MarkerPairSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MarkerPairSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MarkerPairSet obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_MarkerPairSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MarkerPairSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MarkerPairSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MarkerPairSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.MarkerPairSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.MarkerPairSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.MarkerPairSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MarkerPairSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.MarkerPairSet_getConcreteClassName(swigCPtr, this);
  }

  public MarkerPairSet() {
    this(opensimActuatorsAnalysesToolsJNI.new_MarkerPairSet__SWIG_0(), true);
  }

  public MarkerPairSet(MarkerPairSet aSimmMarkerPairSet) {
    this(opensimActuatorsAnalysesToolsJNI.new_MarkerPairSet__SWIG_1(MarkerPairSet.getCPtr(aSimmMarkerPairSet), aSimmMarkerPairSet), true);
  }

}
