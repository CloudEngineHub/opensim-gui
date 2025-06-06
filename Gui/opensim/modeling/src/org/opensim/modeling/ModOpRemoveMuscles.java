/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Remove all muscles contained in the model's ForceSet. 
 */
public class ModOpRemoveMuscles extends ModelOperator {
  private transient long swigCPtr;

  public ModOpRemoveMuscles(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.ModOpRemoveMuscles_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModOpRemoveMuscles obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ModOpRemoveMuscles obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_ModOpRemoveMuscles(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModOpRemoveMuscles safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ModOpRemoveMuscles_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModOpRemoveMuscles(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.ModOpRemoveMuscles_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.ModOpRemoveMuscles_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ModOpRemoveMuscles_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModOpRemoveMuscles(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.ModOpRemoveMuscles_getConcreteClassName(swigCPtr, this);
  }

  public void operate(Model model, String arg1) {
    opensimActuatorsAnalysesToolsJNI.ModOpRemoveMuscles_operate(swigCPtr, this, Model.getCPtr(model), model, arg1);
  }

  public ModOpRemoveMuscles() {
    this(opensimActuatorsAnalysesToolsJNI.new_ModOpRemoveMuscles(), true);
  }

}
