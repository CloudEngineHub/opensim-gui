/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  Struct representing an event extracted from a C3D file.                   
 */
public class Event {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Event(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Event obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public static long swigRelease(Event obj) {
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
        opensimCommonJNI.delete_Event(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLabel(String value) {
    opensimCommonJNI.Event_label_set(swigCPtr, this, value);
  }

  public String getLabel() {
    return opensimCommonJNI.Event_label_get(swigCPtr, this);
  }

  public void setTime(double value) {
    opensimCommonJNI.Event_time_set(swigCPtr, this, value);
  }

  public double getTime() {
    return opensimCommonJNI.Event_time_get(swigCPtr, this);
  }

  public void setFrame(int value) {
    opensimCommonJNI.Event_frame_set(swigCPtr, this, value);
  }

  public int getFrame() {
    return opensimCommonJNI.Event_frame_get(swigCPtr, this);
  }

  public void setDescription(String value) {
    opensimCommonJNI.Event_description_set(swigCPtr, this, value);
  }

  public String getDescription() {
    return opensimCommonJNI.Event_description_get(swigCPtr, this);
  }

  public Event() {
    this(opensimCommonJNI.new_Event(), true);
  }

}
