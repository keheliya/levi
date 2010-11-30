/*
 * XML Type:  tSignalEventDefinition
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TSignalEventDefinition
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tSignalEventDefinition(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TSignalEventDefinitionImpl extends org.omg.spec.bpmn.x20100524.model.impl.TEventDefinitionImpl implements org.omg.spec.bpmn.x20100524.model.TSignalEventDefinition
{
    private static final long serialVersionUID = 1L;
    
    public TSignalEventDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNALREF$0 = 
        new javax.xml.namespace.QName("", "signalRef");
    
    
    /**
     * Gets the "signalRef" attribute
     */
    public javax.xml.namespace.QName getSignalRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGNALREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "signalRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetSignalRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(SIGNALREF$0);
            return target;
        }
    }
    
    /**
     * True if has "signalRef" attribute
     */
    public boolean isSetSignalRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SIGNALREF$0) != null;
        }
    }
    
    /**
     * Sets the "signalRef" attribute
     */
    public void setSignalRef(javax.xml.namespace.QName signalRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGNALREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIGNALREF$0);
            }
            target.setQNameValue(signalRef);
        }
    }
    
    /**
     * Sets (as xml) the "signalRef" attribute
     */
    public void xsetSignalRef(org.apache.xmlbeans.XmlQName signalRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(SIGNALREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(SIGNALREF$0);
            }
            target.set(signalRef);
        }
    }
    
    /**
     * Unsets the "signalRef" attribute
     */
    public void unsetSignalRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SIGNALREF$0);
        }
    }
}