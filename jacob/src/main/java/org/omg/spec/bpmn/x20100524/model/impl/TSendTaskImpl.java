/*
 * XML Type:  tSendTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TSendTask
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tSendTask(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TSendTaskImpl extends org.omg.spec.bpmn.x20100524.model.impl.TTaskImpl implements org.omg.spec.bpmn.x20100524.model.TSendTask
{
    private static final long serialVersionUID = 1L;
    
    public TSendTaskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPLEMENTATION$0 = 
        new javax.xml.namespace.QName("", "implementation");
    private static final javax.xml.namespace.QName MESSAGEREF$2 = 
        new javax.xml.namespace.QName("", "messageRef");
    private static final javax.xml.namespace.QName OPERATIONREF$4 = 
        new javax.xml.namespace.QName("", "operationRef");
    
    
    /**
     * Gets the "implementation" attribute
     */
    public java.lang.Object getImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPLEMENTATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IMPLEMENTATION$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "implementation" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TImplementation xgetImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImplementation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImplementation)get_store().find_attribute_user(IMPLEMENTATION$0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TImplementation)get_default_attribute_value(IMPLEMENTATION$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "implementation" attribute
     */
    public boolean isSetImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IMPLEMENTATION$0) != null;
        }
    }
    
    /**
     * Sets the "implementation" attribute
     */
    public void setImplementation(java.lang.Object implementation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPLEMENTATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMPLEMENTATION$0);
            }
            target.setObjectValue(implementation);
        }
    }
    
    /**
     * Sets (as xml) the "implementation" attribute
     */
    public void xsetImplementation(org.omg.spec.bpmn.x20100524.model.TImplementation implementation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TImplementation target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TImplementation)get_store().find_attribute_user(IMPLEMENTATION$0);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TImplementation)get_store().add_attribute_user(IMPLEMENTATION$0);
            }
            target.set(implementation);
        }
    }
    
    /**
     * Unsets the "implementation" attribute
     */
    public void unsetImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IMPLEMENTATION$0);
        }
    }
    
    /**
     * Gets the "messageRef" attribute
     */
    public javax.xml.namespace.QName getMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(MESSAGEREF$2);
            return target;
        }
    }
    
    /**
     * True if has "messageRef" attribute
     */
    public boolean isSetMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MESSAGEREF$2) != null;
        }
    }
    
    /**
     * Sets the "messageRef" attribute
     */
    public void setMessageRef(javax.xml.namespace.QName messageRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGEREF$2);
            }
            target.setQNameValue(messageRef);
        }
    }
    
    /**
     * Sets (as xml) the "messageRef" attribute
     */
    public void xsetMessageRef(org.apache.xmlbeans.XmlQName messageRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(MESSAGEREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(MESSAGEREF$2);
            }
            target.set(messageRef);
        }
    }
    
    /**
     * Unsets the "messageRef" attribute
     */
    public void unsetMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MESSAGEREF$2);
        }
    }
    
    /**
     * Gets the "operationRef" attribute
     */
    public javax.xml.namespace.QName getOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATIONREF$4);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "operationRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(OPERATIONREF$4);
            return target;
        }
    }
    
    /**
     * True if has "operationRef" attribute
     */
    public boolean isSetOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPERATIONREF$4) != null;
        }
    }
    
    /**
     * Sets the "operationRef" attribute
     */
    public void setOperationRef(javax.xml.namespace.QName operationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATIONREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATIONREF$4);
            }
            target.setQNameValue(operationRef);
        }
    }
    
    /**
     * Sets (as xml) the "operationRef" attribute
     */
    public void xsetOperationRef(org.apache.xmlbeans.XmlQName operationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(OPERATIONREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(OPERATIONREF$4);
            }
            target.set(operationRef);
        }
    }
    
    /**
     * Unsets the "operationRef" attribute
     */
    public void unsetOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPERATIONREF$4);
        }
    }
}