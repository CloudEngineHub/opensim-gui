/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TimeSeriesTable extends DataTable {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected TimeSeriesTable(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.TimeSeriesTable_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TimeSeriesTable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimCommonJNI.delete_TimeSeriesTable(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TimeSeriesTable() {
    this(opensimCommonJNI.new_TimeSeriesTable__SWIG_0(), true);
  }

  public TimeSeriesTable(TimeSeriesTable arg0) {
    this(opensimCommonJNI.new_TimeSeriesTable__SWIG_1(TimeSeriesTable.getCPtr(arg0), arg0), true);
  }

  public TimeSeriesTable(StdVectorDouble indVec, Matrix depData, StdVectorString labels) {
    this(opensimCommonJNI.new_TimeSeriesTable__SWIG_2(StdVectorDouble.getCPtr(indVec), indVec, Matrix.getCPtr(depData), depData, StdVectorString.getCPtr(labels), labels), true);
  }

  public TimeSeriesTable(DataTable datatable) {
    this(opensimCommonJNI.new_TimeSeriesTable__SWIG_3(DataTable.getCPtr(datatable), datatable), true);
  }

  public TimeSeriesTable(String filename) {
    this(opensimCommonJNI.new_TimeSeriesTable__SWIG_4(filename), true);
  }

  public TimeSeriesTable(String filename, String tablename) {
    this(opensimCommonJNI.new_TimeSeriesTable__SWIG_5(filename, tablename), true);
  }

  public RowVectorView getNearestRow(double time, boolean restrictToTimeRange) {
    return new RowVectorView(opensimCommonJNI.TimeSeriesTable_getNearestRow__SWIG_0(swigCPtr, this, time, restrictToTimeRange), true);
  }

  public RowVectorView getNearestRow(double time) {
    return new RowVectorView(opensimCommonJNI.TimeSeriesTable_getNearestRow__SWIG_1(swigCPtr, this, time), true);
  }

  public RowVectorView updNearestRow(double time, boolean restrictToTimeRange) {
    return new RowVectorView(opensimCommonJNI.TimeSeriesTable_updNearestRow__SWIG_0(swigCPtr, this, time, restrictToTimeRange), true);
  }

  public RowVectorView updNearestRow(double time) {
    return new RowVectorView(opensimCommonJNI.TimeSeriesTable_updNearestRow__SWIG_1(swigCPtr, this, time), true);
  }

  public RowVector averageRow(double beginTime, double endTime) {
    return new RowVector(opensimCommonJNI.TimeSeriesTable_averageRow(swigCPtr, this, beginTime, endTime), true);
  }

  public TimeSeriesTable clone() {
    long cPtr = opensimCommonJNI.TimeSeriesTable_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TimeSeriesTable(cPtr, true);
  }

  public TimeSeriesTableVec3 packVec3() {
    return new TimeSeriesTableVec3(opensimCommonJNI.TimeSeriesTable_packVec3__SWIG_0(swigCPtr, this), true);
  }

  public TimeSeriesTableVec3 packVec3(StdVectorString suffixes) {
    return new TimeSeriesTableVec3(opensimCommonJNI.TimeSeriesTable_packVec3__SWIG_1(swigCPtr, this, StdVectorString.getCPtr(suffixes), suffixes), true);
  }

  public TimeSeriesTableUnitVec3 packUnitVec3() {
    return new TimeSeriesTableUnitVec3(opensimCommonJNI.TimeSeriesTable_packUnitVec3__SWIG_0(swigCPtr, this), true);
  }

  public TimeSeriesTableUnitVec3 packUnitVec3(StdVectorString suffixes) {
    return new TimeSeriesTableUnitVec3(opensimCommonJNI.TimeSeriesTable_packUnitVec3__SWIG_1(swigCPtr, this, StdVectorString.getCPtr(suffixes), suffixes), true);
  }

  public TimeSeriesTableQuaternion packQuaternion() {
    return new TimeSeriesTableQuaternion(opensimCommonJNI.TimeSeriesTable_packQuaternion__SWIG_0(swigCPtr, this), true);
  }

  public TimeSeriesTableQuaternion packQuaternion(StdVectorString suffixes) {
    return new TimeSeriesTableQuaternion(opensimCommonJNI.TimeSeriesTable_packQuaternion__SWIG_1(swigCPtr, this, StdVectorString.getCPtr(suffixes), suffixes), true);
  }

  public TimeSeriesTableSpatialVec packSpatialVec() {
    return new TimeSeriesTableSpatialVec(opensimCommonJNI.TimeSeriesTable_packSpatialVec__SWIG_0(swigCPtr, this), true);
  }

  public TimeSeriesTableSpatialVec packSpatialVec(StdVectorString suffixes) {
    return new TimeSeriesTableSpatialVec(opensimCommonJNI.TimeSeriesTable_packSpatialVec__SWIG_1(swigCPtr, this, StdVectorString.getCPtr(suffixes), suffixes), true);
  }

}