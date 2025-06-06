/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  A class that holds the Visual Preferences of a full OpenSim Model <br>
 *  displayed in Visualizer. Initially these are serializable ModelDisplayHints <br>
 *  but in the future can be expanded to include search paths for Mesh files, <br>
 *  Texture, Renderer preferences, lights, cameras etc. attached to Model.<br>
 * <br>
 * @author Ayman Habib<br>
 * @version 1.0
 */
public class ModelVisualPreferences extends OpenSimObject {
  private transient long swigCPtr;

  public ModelVisualPreferences(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ModelVisualPreferences_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelVisualPreferences obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ModelVisualPreferences obj) {
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
        opensimSimulationJNI.delete_ModelVisualPreferences(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelVisualPreferences safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ModelVisualPreferences_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelVisualPreferences(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ModelVisualPreferences_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ModelVisualPreferences_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ModelVisualPreferences_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelVisualPreferences(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ModelVisualPreferences_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_ModelDisplayHints(ModelVisualPreferences source) {
    opensimSimulationJNI.ModelVisualPreferences_copyProperty_ModelDisplayHints(swigCPtr, this, ModelVisualPreferences.getCPtr(source), source);
  }

  public ModelDisplayHints get_ModelDisplayHints(int i) {
    return new ModelDisplayHints(opensimSimulationJNI.ModelVisualPreferences_get_ModelDisplayHints__SWIG_0(swigCPtr, this, i), false);
  }

  public ModelDisplayHints upd_ModelDisplayHints(int i) {
    return new ModelDisplayHints(opensimSimulationJNI.ModelVisualPreferences_upd_ModelDisplayHints__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_ModelDisplayHints(int i, ModelDisplayHints value) {
    opensimSimulationJNI.ModelVisualPreferences_set_ModelDisplayHints__SWIG_0(swigCPtr, this, i, ModelDisplayHints.getCPtr(value), value);
  }

  public int append_ModelDisplayHints(ModelDisplayHints value) {
    return opensimSimulationJNI.ModelVisualPreferences_append_ModelDisplayHints(swigCPtr, this, ModelDisplayHints.getCPtr(value), value);
  }

  public void constructProperty_ModelDisplayHints(ModelDisplayHints initValue) {
    opensimSimulationJNI.ModelVisualPreferences_constructProperty_ModelDisplayHints(swigCPtr, this, ModelDisplayHints.getCPtr(initValue), initValue);
  }

  public ModelDisplayHints get_ModelDisplayHints() {
    return new ModelDisplayHints(opensimSimulationJNI.ModelVisualPreferences_get_ModelDisplayHints__SWIG_1(swigCPtr, this), false);
  }

  public ModelDisplayHints upd_ModelDisplayHints() {
    return new ModelDisplayHints(opensimSimulationJNI.ModelVisualPreferences_upd_ModelDisplayHints__SWIG_1(swigCPtr, this), false);
  }

  public void set_ModelDisplayHints(ModelDisplayHints value) {
    opensimSimulationJNI.ModelVisualPreferences_set_ModelDisplayHints__SWIG_1(swigCPtr, this, ModelDisplayHints.getCPtr(value), value);
  }

  public ModelVisualPreferences() {
    this(opensimSimulationJNI.new_ModelVisualPreferences(), true);
  }

}
