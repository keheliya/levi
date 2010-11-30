/*
 * XML Type:  tEventBasedGateway
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TEventBasedGateway
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tEventBasedGateway(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TEventBasedGatewayImpl extends org.omg.spec.bpmn.x20100524.model.impl.TGatewayImpl implements org.omg.spec.bpmn.x20100524.model.TEventBasedGateway
{
    private static final long serialVersionUID = 1L;
    
    public TEventBasedGatewayImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTANTIATE$0 = 
        new javax.xml.namespace.QName("", "instantiate");
    private static final javax.xml.namespace.QName EVENTGATEWAYTYPE$2 = 
        new javax.xml.namespace.QName("", "eventGatewayType");
    
    
    /**
     * Gets the "instantiate" attribute
     */
    public boolean getInstantiate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTANTIATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSTANTIATE$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "instantiate" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetInstantiate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSTANTIATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INSTANTIATE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "instantiate" attribute
     */
    public boolean isSetInstantiate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSTANTIATE$0) != null;
        }
    }
    
    /**
     * Sets the "instantiate" attribute
     */
    public void setInstantiate(boolean instantiate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTANTIATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTANTIATE$0);
            }
            target.setBooleanValue(instantiate);
        }
    }
    
    /**
     * Sets (as xml) the "instantiate" attribute
     */
    public void xsetInstantiate(org.apache.xmlbeans.XmlBoolean instantiate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSTANTIATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INSTANTIATE$0);
            }
            target.set(instantiate);
        }
    }
    
    /**
     * Unsets the "instantiate" attribute
     */
    public void unsetInstantiate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSTANTIATE$0);
        }
    }
    
    /**
     * Gets the "eventGatewayType" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TEventBasedGatewayType.Enum getEventGatewayType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVENTGATEWAYTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EVENTGATEWAYTYPE$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.omg.spec.bpmn.x20100524.model.TEventBasedGatewayType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "eventGatewayType" attribute
     */
    public org.omg.spec.bpmn.x20100524.model.TEventBasedGatewayType xgetEventGatewayType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEventBasedGatewayType target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEventBasedGatewayType)get_store().find_attribute_user(EVENTGATEWAYTYPE$2);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TEventBasedGatewayType)get_default_attribute_value(EVENTGATEWAYTYPE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "eventGatewayType" attribute
     */
    public boolean isSetEventGatewayType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EVENTGATEWAYTYPE$2) != null;
        }
    }
    
    /**
     * Sets the "eventGatewayType" attribute
     */
    public void setEventGatewayType(org.omg.spec.bpmn.x20100524.model.TEventBasedGatewayType.Enum eventGatewayType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVENTGATEWAYTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVENTGATEWAYTYPE$2);
            }
            target.setEnumValue(eventGatewayType);
        }
    }
    
    /**
     * Sets (as xml) the "eventGatewayType" attribute
     */
    public void xsetEventGatewayType(org.omg.spec.bpmn.x20100524.model.TEventBasedGatewayType eventGatewayType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TEventBasedGatewayType target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TEventBasedGatewayType)get_store().find_attribute_user(EVENTGATEWAYTYPE$2);
            if (target == null)
            {
                target = (org.omg.spec.bpmn.x20100524.model.TEventBasedGatewayType)get_store().add_attribute_user(EVENTGATEWAYTYPE$2);
            }
            target.set(eventGatewayType);
        }
    }
    
    /**
     * Unsets the "eventGatewayType" attribute
     */
    public void unsetEventGatewayType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EVENTGATEWAYTYPE$2);
        }
    }
}