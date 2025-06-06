/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  The top-level class for solving a custom optimal control problem.<br>
 * <br>
 * This class consists of a MocoProblem, which describes the optimal control<br>
 * problem, and a MocoSolver, which describes the numerical method for<br>
 * solving the problem.<br>
 * <br>
 * Workflow<br>
 * ========<br>
 * When building a MocoStudy programmatically (e.g., in C++), the workflow is<br>
 * as follows:<br>
 * <br>
 * 1. Build the MocoProblem (set the model, constraints, etc.).<br>
 * 2. Call MocoStudy::initSolver(), which returns a reference to the<br>
 * MocoSolver.<br>
 *    After this, you cannot edit the MocoProblem.<br>
 * 3. Edit the settings of the MocoSolver (returned by initSolver()).<br>
 * 4. Call MocoStudy::solve(). This returns the MocoSolution.<br>
 * 5. (Optional) Postprocess the solution, perhaps using<br>
 * MocoStudy::visualize().<br>
 * <br>
 * After calling solve(), you can edit the MocoProblem and/or the MocoSolver.<br>
 * You can then call solve() again, if you wish.<br>
 * <br>
 * Obtaining the solution<br>
 * ----------------------<br>
 * The most common way to obtain the MocoStudy is in code, using the MocoSolution<br>
 * object returned by solve(). This norm differs from the behavior of OpenSim's<br>
 * other tools, which do not make their results available in code and instead write<br>
 * their results to file. If you want MocoStudy to write the solution to file at<br>
 * the end of solve(), use set_write_solution() and set_results_directory(). The<br>
 * name of the solution file is "<study-name>_solution.sto" or<br>
 * "MocoStudy_solution.sto" if the MocoStudy object has no name. Alternatively, you<br>
 * can write the solution to file yourself:<br>
 * <br>
 * {@code 
MocoSolution solution = study.solve();
solution.write("solution.sto");
}<br>
 * <br>
 * Saving the study setup to a file<br>
 * --------------------------------<br>
 * You can save the MocoStudy to a file by calling MocoStudy::print(), and you<br>
 * can load the setup using MocoStudy(const std::string&amp; omocoFile).<br>
 * MocoStudy setup files have a `.omoco` extension.<br>
 * <br>
 * Solver<br>
 * ------<br>
 * The default solver, MocoCasADiSolver, uses the **CasADi** automatic<br>
 * differentiation and optimization library. We would like to<br>
 * support users plugging in their own solvers, but there is no timeline for this.
 */
public class MocoStudy extends OpenSimObject {
  private transient long swigCPtr;

  public MocoStudy(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoStudy_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoStudy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(MocoStudy obj) {
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
        opensimMocoJNI.delete_MocoStudy(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoStudy safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoStudy_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoStudy(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoStudy_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoStudy_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoStudy_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoStudy(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoStudy_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_write_solution(MocoStudy source) {
    opensimMocoJNI.MocoStudy_copyProperty_write_solution(swigCPtr, this, MocoStudy.getCPtr(source), source);
  }

  public boolean get_write_solution(int i) {
    return opensimMocoJNI.MocoStudy_get_write_solution__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_write_solution(int i) {
    return new SWIGTYPE_p_bool(opensimMocoJNI.MocoStudy_upd_write_solution__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_write_solution(int i, boolean value) {
    opensimMocoJNI.MocoStudy_set_write_solution__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_write_solution(boolean value) {
    return opensimMocoJNI.MocoStudy_append_write_solution(swigCPtr, this, value);
  }

  public void constructProperty_write_solution(boolean initValue) {
    opensimMocoJNI.MocoStudy_constructProperty_write_solution(swigCPtr, this, initValue);
  }

  public boolean get_write_solution() {
    return opensimMocoJNI.MocoStudy_get_write_solution__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_write_solution() {
    return new SWIGTYPE_p_bool(opensimMocoJNI.MocoStudy_upd_write_solution__SWIG_1(swigCPtr, this), false);
  }

  public void set_write_solution(boolean value) {
    opensimMocoJNI.MocoStudy_set_write_solution__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_results_directory(MocoStudy source) {
    opensimMocoJNI.MocoStudy_copyProperty_results_directory(swigCPtr, this, MocoStudy.getCPtr(source), source);
  }

  public String get_results_directory(int i) {
    return opensimMocoJNI.MocoStudy_get_results_directory__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_results_directory(int i) {
    return new SWIGTYPE_p_std__string(opensimMocoJNI.MocoStudy_upd_results_directory__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_results_directory(int i, String value) {
    opensimMocoJNI.MocoStudy_set_results_directory__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_results_directory(String value) {
    return opensimMocoJNI.MocoStudy_append_results_directory(swigCPtr, this, value);
  }

  public void constructProperty_results_directory(String initValue) {
    opensimMocoJNI.MocoStudy_constructProperty_results_directory(swigCPtr, this, initValue);
  }

  public String get_results_directory() {
    return opensimMocoJNI.MocoStudy_get_results_directory__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_results_directory() {
    return new SWIGTYPE_p_std__string(opensimMocoJNI.MocoStudy_upd_results_directory__SWIG_1(swigCPtr, this), false);
  }

  public void set_results_directory(String value) {
    opensimMocoJNI.MocoStudy_set_results_directory__SWIG_1(swigCPtr, this, value);
  }

  public MocoStudy() {
    this(opensimMocoJNI.new_MocoStudy__SWIG_0(), true);
  }

  /**
   *  Load a MocoStudy setup file.
   */
  public MocoStudy(String omocoFile) {
    this(opensimMocoJNI.new_MocoStudy__SWIG_1(omocoFile), true);
  }

  /**
   *  Access the MocoProblem within this study.
   */
  public MocoProblem getProblem() {
    return new MocoProblem(opensimMocoJNI.MocoStudy_getProblem(swigCPtr, this), false);
  }

  /**
   *  Access the MocoProblem within this study. This function allows you to<br>
   *  modify the MocoProblem.<br>
   *  If using this method in C++, make sure to include the "&" in the<br>
   *  return type; otherwise, you'll make a copy of the problem, and the copy<br>
   *  will have no effect on this MocoStudy. See this example:<br>
   *  {@code 
   MocoProblem& problem = study.updProblem();
   }
   */
  public MocoProblem updProblem() {
    return new MocoProblem(opensimMocoJNI.MocoStudy_updProblem(swigCPtr, this), false);
  }

  /**
   *  Call this method once you have finished setting up your MocoProblem.<br>
   *  This returns a reference to the MocoSolver, which you can then edit.<br>
   *  If using this method in C++, make sure to include the "&" in the<br>
   *  return type; otherwise, you'll make a copy of the solver, and the copy<br>
   *  will have no effect on this MocoStudy.<br>
   *  This deletes the previous solver if one exists.
   */
  public MocoCasADiSolver initCasADiSolver() {
    return new MocoCasADiSolver(opensimMocoJNI.MocoStudy_initCasADiSolver(swigCPtr, this), false);
  }

  /**
   *  Access the solver. Make sure to call `initSolver()` beforehand.<br>
   *  If using this method in C++, make sure to include the "&" in the<br>
   *  return type; otherwise, you'll make a copy of the solver, and the copy<br>
   *  will have no effect on this MocoStudy.
   */
  public MocoSolver updSolver() {
    return new MocoSolver(opensimMocoJNI.MocoStudy_updSolver(swigCPtr, this), false);
  }

  /**
   *  Solve the provided MocoProblem using the provided MocoSolver, and obtain<br>
   *  the solution to the problem. If the write_solution property is true,<br>
   *  then the solution is also written to disk in the directory specified in<br>
   *  the results_directory property.<br>
   *  <br>
   *      You must have finished setting up both the problem and solver.<br>
   *  This reinitializes the solver so that any changes you have made will<br>
   *  hold.<br>
   * <br>
   *  Use MocoSolution::success() on the returned solution to detect if the<br>
   *  solver succeeded. If the solver did not succeed the solution will be<br>
   *  sealed: you will not be able to use the failed solution<br>
   *  until you acknowledge the failure by invoking MocoSolution::unseal().
   */
  public MocoSolution solve() {
    return new MocoSolution(opensimMocoJNI.MocoStudy_solve(swigCPtr, this), true);
  }

  /**
   *  Interactively visualize a trajectory using the simbody-visualizer. The<br>
   *  trajectory could be an initial guess, a solution, etc.<br>
   *  <br>
   *      The MocoProblem must contain the model corresponding to<br>
   *      the provided trajectory.
   */
  public void visualize(MocoTrajectory traj) {
    opensimMocoJNI.MocoStudy_visualize(swigCPtr, this, MocoTrajectory.getCPtr(traj), traj);
  }

  public TimeSeriesTable analyze(MocoTrajectory traj, StdVectorString outputPaths) {
    return new TimeSeriesTable(opensimMocoJNI.MocoStudy_analyze(swigCPtr, this, MocoTrajectory.getCPtr(traj), traj, StdVectorString.getCPtr(outputPaths), outputPaths), true);
  }

  /**
   *  Compute the generalized coordinate forces for the provided trajectory <br>
   *  based on a set of applied model Force%s. This can be used to compute <br>
   *  an inverse dynamics solution from a MocoTrajectory, where the applied <br>
   *  model Force%s are typically external forces in the system (e.g., <br>
   *  ExternalForce or SmoothSphereHalfSpaceForce). However, the `forcePaths`<br>
   *  argument can contain paths to any Force%s in the model.<br>
   * <br>
   *  @param traj       The MocoTrajectory for which to compute the <br>
   *                    generalized forces.<br>
   *  @param forcePaths The model paths to the Force%s which will be applied<br>
   *                    to the model to compute the generalized forces.<br>
   * <br>
   *  Note: Force's `appliesForce` property is obeyed when calculating the<br>
   *        generalized forces.<br>
   * <br>
   *  
   */
  public TimeSeriesTable calcGeneralizedForces(MocoTrajectory traj, StdVectorString forcePaths) {
    return new TimeSeriesTable(opensimMocoJNI.MocoStudy_calcGeneralizedForces(swigCPtr, this, MocoTrajectory.getCPtr(traj), traj, StdVectorString.getCPtr(forcePaths), forcePaths), true);
  }

  /**
   *  Calculate the requested outputs using the model in the problem and the<br>
   *  states and controls in the MocoTrajectory.<br>
   *  The output paths can be regular expressions. For example,<br>
   *  ".*activation" gives the activation of all muscles.<br>
   *  Constraints are not enforced but prescribed motion (e.g.,<br>
   *  PositionMotion) is.<br>
   *  @see OpenSim#analyze<T>() OpenSim::analyzeMocoTrajectory<T>() Note: Parameters in the MocoTrajectory are **not** applied to the model.<br>
   *  Note: If the MocoTrajectory was generated from a MocoStudy with <br>
   *        Controller%s in the model, first call <br>
   *        MocoTrajectory::generateControlsFromModelControllers() to populate <br>
   *        the trajectory with the correct model controls.
   */
  public TimeSeriesTableVec3 analyzeVec3(MocoTrajectory traj, StdVectorString outputPaths) {
    return new TimeSeriesTableVec3(opensimMocoJNI.MocoStudy_analyzeVec3(swigCPtr, this, MocoTrajectory.getCPtr(traj), traj, StdVectorString.getCPtr(outputPaths), outputPaths), true);
  }

  /**
   *  Calculate the requested outputs using the model in the problem and the<br>
   *  states and controls in the MocoTrajectory.<br>
   *  The output paths can be regular expressions. For example,<br>
   *  ".*activation" gives the activation of all muscles.<br>
   *  Constraints are not enforced but prescribed motion (e.g.,<br>
   *  PositionMotion) is.<br>
   *  @see OpenSim#analyze<T>() OpenSim::analyzeMocoTrajectory<T>() Note: Parameters in the MocoTrajectory are **not** applied to the model.<br>
   *  Note: If the MocoTrajectory was generated from a MocoStudy with <br>
   *        Controller%s in the model, first call <br>
   *        MocoTrajectory::generateControlsFromModelControllers() to populate <br>
   *        the trajectory with the correct model controls.
   */
  public TimeSeriesTableSpatialVec analyzeSpatialVec(MocoTrajectory traj, StdVectorString outputPaths) {
    return new TimeSeriesTableSpatialVec(opensimMocoJNI.MocoStudy_analyzeSpatialVec(swigCPtr, this, MocoTrajectory.getCPtr(traj), traj, StdVectorString.getCPtr(outputPaths), outputPaths), true);
  }

  /**
   *  Calculate the requested outputs using the model in the problem and the<br>
   *  states and controls in the MocoTrajectory.<br>
   *  The output paths can be regular expressions. For example,<br>
   *  ".*activation" gives the activation of all muscles.<br>
   *  Constraints are not enforced but prescribed motion (e.g.,<br>
   *  PositionMotion) is.<br>
   *  @see OpenSim#analyze<T>() OpenSim::analyzeMocoTrajectory<T>() Note: Parameters in the MocoTrajectory are **not** applied to the model.<br>
   *  Note: If the MocoTrajectory was generated from a MocoStudy with <br>
   *        Controller%s in the model, first call <br>
   *        MocoTrajectory::generateControlsFromModelControllers() to populate <br>
   *        the trajectory with the correct model controls.
   */
  public TimeSeriesTableRotation analyzeRotation(MocoTrajectory traj, StdVectorString outputPaths) {
    return new TimeSeriesTableRotation(opensimMocoJNI.MocoStudy_analyzeRotation(swigCPtr, this, MocoTrajectory.getCPtr(traj), traj, StdVectorString.getCPtr(outputPaths), outputPaths), true);
  }

}
