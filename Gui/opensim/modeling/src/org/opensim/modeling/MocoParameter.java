/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  A MocoParameter allows you to optimize property values in an OpenSim Model.<br>
 * To describe this parameter, you must provide the name of the property you<br>
 * want to optimize and the path to the component in the model where the<br>
 * property exists. If the property is not a scalar, then you must also provide<br>
 * the element index of the property you want to optimize. To optimize multiple<br>
 * elements of a non-scalar property, use multiple MocoParameters.<br>
 * By specifying multiple component paths, you can optimize the same property<br>
 * in multiple components (each property will have the same value, as<br>
 * determined by this parameter).<br>
 * The following property types are currently supported:<br>
 *  - double<br>
 *  - Vec3<br>
 *  - Vec6<br>
 * <br>
 * List properties are not currently supported.<br>
 * <br>
 * The name you give to a MocoParameter does not need to match the<br>
 * name of its model property.<br>
 * <br>
 * The default initial guess for a parameter depends on the solver you use. Most<br>
 * likely, the default initial guess is the midpoint of the bounds on the<br>
 * parameter (NOT the value of the property in the model).<br>
 * <br>
 * Create a MocoParameter from a property in the model:<br>
 * {@code 
MocoParameter p0;
p0.setName("torso_mass");
p0.appendComponentPath("torso");
p0.setPropertyName("mass");
MocoBounds massBounds(60, 80);
p0.setBounds(massBounds);
}<br>
 * <br>
 * Using the convenience constructor:<br>
 * {@code 
MocoParameter p0("torso_mass", "torso", "mass", MocoBounds(60, 80));
}<br>
 * <br>
 * Here is a Matlab example of optimizing the optimal fiber length of a muscle:<br>
 * {@code 
study = MocoStudy();
problem = study.updProblem();
param = MocoParameter('my_param_name', '/forceset/soleus_r', ...
        'optimal_fiber_length', MocoBounds(0.04, 0.06));
problem.addParameter(param);
}<br>
 * <br>
 * The generic constructor can be used for more complex MocoParameter<br>
 * assignments. Here, we create a MocoParameter for the y-position of the mass<br>
 * center of three different rigid bodies in the model:<br>
 * {@code 
int propertyElt = 1; // y-position is the second element of the mass_center
std::vector<std::string> componentPaths = {
    "/bodyset/pelvis",
    "/bodyset/thigh",
    "/bodyset/shank"
};
MocoParameter y_com("y_com", componentPaths, "mass_center",
        MocoBounds(-0.05, 0.05), propertyElt);
}<br>
 * <p alt="For developers"><br>
 * Every time the problem is solved, a copy of this parameter is used.<br>
 * An individual instance of a parameter is only ever used in a single problem.<br>
 * Therefore, there is no need to clear cache variables that you create in<br>
 * initializeImpl(). Also, information stored in this parameter does not<br>
 * persist across multiple solves. Lastly, a MocoParameter may be applied to<br>
 * multiple models at once, as long as the value described in the MocoParameter<br>
 * exists and initializeOnModel() is called on all models of interest. </p>
 */
public class MocoParameter extends OpenSimObject {
  private transient long swigCPtr;

  public MocoParameter(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoParameter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoParameter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MocoParameter obj) {
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
        opensimMocoJNI.delete_MocoParameter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoParameter safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoParameter_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoParameter(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoParameter_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoParameter_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoParameter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoParameter(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoParameter_getConcreteClassName(swigCPtr, this);
  }

  public MocoParameter() {
    this(opensimMocoJNI.new_MocoParameter__SWIG_0(), true);
  }

  /**
   *  This is a generic constructor that supports applying this parameter<br>
   *  to multiple components and to non-scalar properties.<br>
   *  Specifying propertyElt as -1 is treated as not specifying a property<br>
   *  element.
   */
  public MocoParameter(String name, StdVectorString componentPaths, String propertyName, MocoBounds arg3, int propertyElt) {
    this(opensimMocoJNI.new_MocoParameter__SWIG_1(name, StdVectorString.getCPtr(componentPaths), componentPaths, propertyName, MocoBounds.getCPtr(arg3), arg3, propertyElt), true);
  }

  public MocoParameter(String name, String componentPath, String propertyName, MocoBounds arg3) {
    this(opensimMocoJNI.new_MocoParameter__SWIG_2(name, componentPath, propertyName, MocoBounds.getCPtr(arg3), arg3), true);
  }

  public MocoParameter(String name, String componentPath, String propertyName, MocoBounds arg3, int propertyElt) {
    this(opensimMocoJNI.new_MocoParameter__SWIG_3(name, componentPath, propertyName, MocoBounds.getCPtr(arg3), arg3, propertyElt), true);
  }

  public MocoParameter(String name, StdVectorString componentPaths, String propertyName, MocoBounds arg3) {
    this(opensimMocoJNI.new_MocoParameter__SWIG_4(name, StdVectorString.getCPtr(componentPaths), componentPaths, propertyName, MocoBounds.getCPtr(arg3), arg3), true);
  }

  public MocoBounds getBounds() {
    return new MocoBounds(opensimMocoJNI.MocoParameter_getBounds(swigCPtr, this), true);
  }

  public String getPropertyName() {
    return opensimMocoJNI.MocoParameter_getPropertyName(swigCPtr, this);
  }

  public StdVectorString getComponentPaths() {
    return new StdVectorString(opensimMocoJNI.MocoParameter_getComponentPaths(swigCPtr, this), true);
  }

  public void setBounds(MocoBounds bounds) {
    opensimMocoJNI.MocoParameter_setBounds(swigCPtr, this, MocoBounds.getCPtr(bounds), bounds);
  }

  public void setPropertyName(String propertyName) {
    opensimMocoJNI.MocoParameter_setPropertyName(swigCPtr, this, propertyName);
  }

  public void appendComponentPath(String componentPath) {
    opensimMocoJNI.MocoParameter_appendComponentPath(swigCPtr, this, componentPath);
  }

  public int getPropertyElement() {
    return opensimMocoJNI.MocoParameter_getPropertyElement(swigCPtr, this);
  }

  /**
   *  For use by solvers. This performs error checks and caches information<br>
   *     about the model that is useful during the optimization.<br>
   *     This method takes a non-const reference to the model because parameters<br>
   *     need to be able to alter the model.<br>
   *     If it is desired to apply this MocoParameter to multiple models, this<br>
   *     should be called on all models of interest. The property references from<br>
   *     each model will be appended to this MocoParameter's internal property<br>
   *     reference list. 
   */
  public void initializeOnModel(Model model) {
    opensimMocoJNI.MocoParameter_initializeOnModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  /**
   *  Set the value of the stored model properties, which may include<br>
   *     properties from multiple models. 
   */
  public void applyParameterToModelProperties(double value) {
    opensimMocoJNI.MocoParameter_applyParameterToModelProperties(swigCPtr, this, value);
  }

  /**
   *  Print the name, property name, component paths, property element (if it<br>
   *     exists), and bounds for this parameter. 
   */
  public void printDescription() {
    opensimMocoJNI.MocoParameter_printDescription(swigCPtr, this);
  }

}
