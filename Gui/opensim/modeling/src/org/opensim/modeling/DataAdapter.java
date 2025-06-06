/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  DataAdapter is an abstract class defining an interface for reading/writing<br>
 * in/out the contents of a DataTable. It enables access to/from various data<br>
 * sources/sinks such as: streams, files, databases and devices. The DataTable<br>
 * is independent of the form and format of the data in/out of the source/sink.<br>
 * Concrete classes handle the details (e.g. format, sequential access, etc...) <br>
 * associated with a particular data source/sink.<br>
 * The base DataAdapter contains a static registry to serve as a factory for <br>
 * concrete DataAdpaters, given a string identifier of the type of adapter.<br>
 * The adapter knows the source format and data flow (read, write, both).<br>
 * String identifiers can be associated with file formats according to known<br>
 * file extensions.                                                              
 */
public class DataAdapter {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected DataAdapter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DataAdapter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_DataAdapter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DataAdapter clone() {
    long cPtr = opensimCommonJNI.DataAdapter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new DataAdapter(cPtr, true);
  }

  /**
   *  Register a concrete DataAdapter by its unique string identifier.<br>
   *     Registration permits access to the required concrete adapter by<br>
   *     identifier lookup. As such, identifiers must be unique, but adapters may<br>
   *     be registered with multiple identifiers. For example, a data file may <br>
   *     have multiple valid extensions (e.g. ".jpg: and ".jpeg") in which case<br>
   *     both extensions would be valid identifiers for the same adapter. If an<br>
   *     identifier is already in use an Exception is thrown.<br>
   *     All OpenSim data adapters are automatically registered at start of the <br>
   *     program.                                                                  
   */
  public static boolean registerDataAdapter(String identifier, DataAdapter adapter) {
    return opensimCommonJNI.DataAdapter_registerDataAdapter(identifier, DataAdapter.getCPtr(adapter), adapter);
  }

  /**
   *  Public interface to read data from a dataSourceSpecification, typically a file or folder 
   */
  public StdMapStringAbstractDataTable read(String dataSourceSpecification) {
    return new StdMapStringAbstractDataTable(opensimCommonJNI.DataAdapter_read(swigCPtr, this, dataSourceSpecification), true);
  }

  /**
   *  Generic interface to retrieve a specific table by name from read result 
   */
  public AbstractDataTable getDataTable(StdMapStringAbstractDataTable tables, String tableName) {
    long cPtr = opensimCommonJNI.DataAdapter_getDataTable(swigCPtr, this, StdMapStringAbstractDataTable.getCPtr(tables), tables, tableName);
    return (cPtr == 0) ? null : new AbstractDataTable(cPtr, true);
  }

}
