/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for holding a set of miscellaneous model components.<br>
 * <br>
 * @author Michael Sherman
 */
public class ComponentSet extends ModelComponentSetModelComponent {
  private transient long swigCPtr;

  public ComponentSet(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ComponentSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ComponentSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(ComponentSet obj) {
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
        opensimSimulationJNI.delete_ComponentSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ComponentSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ComponentSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ComponentSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ComponentSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ComponentSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ComponentSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ComponentSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ComponentSet_getConcreteClassName(swigCPtr, this);
  }

  public ComponentSet() {
    this(opensimSimulationJNI.new_ComponentSet(), true);
  }

}
