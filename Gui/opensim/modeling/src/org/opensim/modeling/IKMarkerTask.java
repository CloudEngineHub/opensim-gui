/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * @author Eran Guendelman, Ayman Habib<br>
 * @version 1.0
 */
public class IKMarkerTask extends IKTask {
  private transient long swigCPtr;

  public IKMarkerTask(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.IKMarkerTask_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(IKMarkerTask obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(IKMarkerTask obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_IKMarkerTask(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static IKMarkerTask safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.IKMarkerTask_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new IKMarkerTask(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.IKMarkerTask_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.IKMarkerTask_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.IKMarkerTask_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new IKMarkerTask(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.IKMarkerTask_getConcreteClassName(swigCPtr, this);
  }

  public IKMarkerTask() {
    this(opensimActuatorsAnalysesToolsJNI.new_IKMarkerTask__SWIG_0(), true);
  }

  public IKMarkerTask(IKMarkerTask arg0) {
    this(opensimActuatorsAnalysesToolsJNI.new_IKMarkerTask__SWIG_1(IKMarkerTask.getCPtr(arg0), arg0), true);
  }

}
