/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Invoke ModelFactory::replaceMusclesWithPathActuators() on the model.
 */
public class ModOpReplaceMusclesWithPathActuators extends ModelOperator {
  private transient long swigCPtr;

  public ModOpReplaceMusclesWithPathActuators(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.ModOpReplaceMusclesWithPathActuators_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModOpReplaceMusclesWithPathActuators obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ModOpReplaceMusclesWithPathActuators obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_ModOpReplaceMusclesWithPathActuators(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModOpReplaceMusclesWithPathActuators safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ModOpReplaceMusclesWithPathActuators_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModOpReplaceMusclesWithPathActuators(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.ModOpReplaceMusclesWithPathActuators_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.ModOpReplaceMusclesWithPathActuators_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ModOpReplaceMusclesWithPathActuators_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModOpReplaceMusclesWithPathActuators(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.ModOpReplaceMusclesWithPathActuators_getConcreteClassName(swigCPtr, this);
  }

  public void operate(Model model, String arg1) {
    opensimActuatorsAnalysesToolsJNI.ModOpReplaceMusclesWithPathActuators_operate(swigCPtr, this, Model.getCPtr(model), model, arg1);
  }

  public ModOpReplaceMusclesWithPathActuators() {
    this(opensimActuatorsAnalysesToolsJNI.new_ModOpReplaceMusclesWithPathActuators(), true);
  }

}
