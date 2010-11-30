/*
 * XML Type:  tCallActivity
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TCallActivity
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tCallActivity(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TCallActivityImpl extends org.omg.spec.bpmn.x20100524.model.impl.TActivityImpl implements org.omg.spec.bpmn.x20100524.model.TCallActivity
{
    private static final long serialVersionUID = 1L;
    
    public TCallActivityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLEDELEMENT$0 = 
        new javax.xml.namespace.QName("", "calledElement");
    
    
    /**
     * Gets the "calledElement" attribute
     */
    public javax.xml.namespace.QName getCalledElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALLEDELEMENT$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "calledElement" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetCalledElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CALLEDELEMENT$0);
            return target;
        }
    }
    
    /**
     * True if has "calledElement" attribute
     */
    public boolean isSetCalledElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CALLEDELEMENT$0) != null;
        }
    }
    
    /**
     * Sets the "calledElement" attribute
     */
    public void setCalledElement(javax.xml.namespace.QName calledElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALLEDELEMENT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALLEDELEMENT$0);
            }
            target.setQNameValue(calledElement);
        }
    }
    
    /**
     * Sets (as xml) the "calledElement" attribute
     */
    public void xsetCalledElement(org.apache.xmlbeans.XmlQName calledElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CALLEDELEMENT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CALLEDELEMENT$0);
            }
            target.set(calledElement);
        }
    }
    
    /**
     * Unsets the "calledElement" attribute
     */
    public void unsetCalledElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CALLEDELEMENT$0);
        }
    }
}