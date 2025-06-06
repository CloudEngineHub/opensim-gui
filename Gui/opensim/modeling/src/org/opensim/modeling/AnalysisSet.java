/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for holding and managing a set of integration callbacks for<br>
 * a model.<br>
 * <br>
 * @author Frank C. Anderson<br>
 * @version 1.0
 */
public class AnalysisSet extends SetAnalysis {
  private transient long swigCPtr;

  public AnalysisSet(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.AnalysisSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(AnalysisSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(AnalysisSet obj) {
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
        opensimSimulationJNI.delete_AnalysisSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static AnalysisSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.AnalysisSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new AnalysisSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.AnalysisSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.AnalysisSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.AnalysisSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new AnalysisSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.AnalysisSet_getConcreteClassName(swigCPtr, this);
  }

  public AnalysisSet() {
    this(opensimSimulationJNI.new_AnalysisSet__SWIG_0(), true);
  }

  public AnalysisSet(Model aModel) {
    this(opensimSimulationJNI.new_AnalysisSet__SWIG_1(Model.getCPtr(aModel), aModel), true);
  }

  public AnalysisSet(String aFileName) {
    this(opensimSimulationJNI.new_AnalysisSet__SWIG_2(aFileName), true);
  }

  public AnalysisSet(AnalysisSet aSet) {
    this(opensimSimulationJNI.new_AnalysisSet__SWIG_3(AnalysisSet.getCPtr(aSet), aSet), true);
  }

  public void setModel(Model aModel) {
    opensimSimulationJNI.AnalysisSet_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public Model getModel() {
    return new Model(opensimSimulationJNI.AnalysisSet_getModel(swigCPtr, this), false);
  }

  public void setOn(boolean aTrueFalse) {
    opensimSimulationJNI.AnalysisSet_setOn__SWIG_0(swigCPtr, this, aTrueFalse);
  }

  public void setOn(ArrayBool aOn) {
    opensimSimulationJNI.AnalysisSet_setOn__SWIG_1(swigCPtr, this, ArrayBool.getCPtr(aOn), aOn);
  }

  public ArrayBool getOn() {
    return new ArrayBool(opensimSimulationJNI.AnalysisSet_getOn(swigCPtr, this), true);
  }

  public void begin(State s) {
    opensimSimulationJNI.AnalysisSet_begin(swigCPtr, this, State.getCPtr(s), s);
  }

  public void step(State s, int stepNumber) {
    opensimSimulationJNI.AnalysisSet_step(swigCPtr, this, State.getCPtr(s), s, stepNumber);
  }

  public void end(State s) {
    opensimSimulationJNI.AnalysisSet_end(swigCPtr, this, State.getCPtr(s), s);
  }

  public void printResults(String aBaseName, String aPath, double aDT, String aExtension) {
    opensimSimulationJNI.AnalysisSet_printResults__SWIG_0(swigCPtr, this, aBaseName, aPath, aDT, aExtension);
  }

  public void printResults(String aBaseName, String aPath, double aDT) {
    opensimSimulationJNI.AnalysisSet_printResults__SWIG_1(swigCPtr, this, aBaseName, aPath, aDT);
  }

  public void printResults(String aBaseName, String aPath) {
    opensimSimulationJNI.AnalysisSet_printResults__SWIG_2(swigCPtr, this, aBaseName, aPath);
  }

  public void printResults(String aBaseName) {
    opensimSimulationJNI.AnalysisSet_printResults__SWIG_3(swigCPtr, this, aBaseName);
  }

  public static void getAvailableAnalyses(AnalysisSet analysisset) {
    opensimSimulationJNI.AnalysisSet_getAvailableAnalyses(AnalysisSet.getCPtr(analysisset), analysisset);
  }

}
