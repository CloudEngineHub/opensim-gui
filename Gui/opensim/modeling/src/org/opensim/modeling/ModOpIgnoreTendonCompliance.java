/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Turn off tendon compliance for all muscles in the model.
 */
public class ModOpIgnoreTendonCompliance extends ModelOperator {
  private transient long swigCPtr;

  public ModOpIgnoreTendonCompliance(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.ModOpIgnoreTendonCompliance_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModOpIgnoreTendonCompliance obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ModOpIgnoreTendonCompliance obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_ModOpIgnoreTendonCompliance(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModOpIgnoreTendonCompliance safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ModOpIgnoreTendonCompliance_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModOpIgnoreTendonCompliance(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.ModOpIgnoreTendonCompliance_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.ModOpIgnoreTendonCompliance_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ModOpIgnoreTendonCompliance_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModOpIgnoreTendonCompliance(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.ModOpIgnoreTendonCompliance_getConcreteClassName(swigCPtr, this);
  }

  public void operate(Model model, String arg1) {
    opensimActuatorsAnalysesToolsJNI.ModOpIgnoreTendonCompliance_operate(swigCPtr, this, Model.getCPtr(model), model, arg1);
  }

  public ModOpIgnoreTendonCompliance() {
    this(opensimActuatorsAnalysesToolsJNI.new_ModOpIgnoreTendonCompliance(), true);
  }

}
