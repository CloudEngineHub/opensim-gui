/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ComponentSet extends ModelComponentSetModelComponent {
  private long swigCPtr;

  public ComponentSet(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ComponentSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ComponentSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ComponentSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ComponentSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ComponentSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ComponentSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ComponentSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ComponentSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ComponentSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ComponentSet(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ComponentSet_getConcreteClassName(swigCPtr, this);
  }

  public ComponentSet() {
    this(opensimModelJNI.new_ComponentSet__SWIG_0(), true);
  }

  public ComponentSet(Model model) {
    this(opensimModelJNI.new_ComponentSet__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ComponentSet(Model model, String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_ComponentSet__SWIG_2(Model.getCPtr(model), model, aFileName, aUpdateFromXMLNode), true);
  }

  public ComponentSet(Model model, String aFileName) {
    this(opensimModelJNI.new_ComponentSet__SWIG_3(Model.getCPtr(model), model, aFileName), true);
  }

}