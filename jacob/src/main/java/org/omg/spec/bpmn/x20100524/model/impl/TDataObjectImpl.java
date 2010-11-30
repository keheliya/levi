/*
 * XML Type:  tDataObject
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TDataObject
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tDataObject(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TDataObjectImpl extends org.omg.spec.bpmn.x20100524.model.impl.TFlowElementImpl implements org.omg.spec.bpmn.x20100524.model.TDataObject
{
    private static final long serialVersionUID = 1L;
    
    public TDataObjectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASTATE$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "dataState");
    private static final javax.xml.namespace.QName ITEMSUBJECTREF$2 = 
        new javax.xml.namespace.QName("", "itemSubjectRef");
    private static final javax.xml.namespace.QName ISCOLLECTION$4 = 
        new javax.xml.namespace.QName("", "isCollection");
    
    
    /**
     * Gets the "dataState" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataState getDataState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataState target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataState)get_store().find_element_user(DATASTATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataState" element
     */
    public boolean isSetDataState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASTATE$0) != 0;
        }
    }
    
    /**
     * Sets the "dataState" element
     */
    public void setDataState(org.omg.spec.bpmn.x20100524.model.TDataState dataState)
    {
        generatedSetterHelperImpl(dataState, DATASTATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataState" element
     */
    public org.omg.spec.bpmn.x20100524.model.TDataState addNewDataState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TDataState target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TDataState)get_store().add_element_user(DATASTATE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "dataState" element
     */
    public void unsetDataState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASTATE$0, 0);
        }
    }
    
    /**
     * Gets the "itemSubjectRef" attribute
     */
    public javax.xml.namespace.QName getItemSubjectRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMSUBJECTREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "itemSubjectRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetItemSubjectRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ITEMSUBJECTREF$2);
            return target;
        }
    }
    
    /**
     * True if has "itemSubjectRef" attribute
     */
    public boolean isSetItemSubjectRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ITEMSUBJECTREF$2) != null;
        }
    }
    
    /**
     * Sets the "itemSubjectRef" attribute
     */
    public void setItemSubjectRef(javax.xml.namespace.QName itemSubjectRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMSUBJECTREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ITEMSUBJECTREF$2);
            }
            target.setQNameValue(itemSubjectRef);
        }
    }
    
    /**
     * Sets (as xml) the "itemSubjectRef" attribute
     */
    public void xsetItemSubjectRef(org.apache.xmlbeans.XmlQName itemSubjectRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ITEMSUBJECTREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ITEMSUBJECTREF$2);
            }
            target.set(itemSubjectRef);
        }
    }
    
    /**
     * Unsets the "itemSubjectRef" attribute
     */
    public void unsetItemSubjectRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ITEMSUBJECTREF$2);
        }
    }
    
    /**
     * Gets the "isCollection" attribute
     */
    public boolean getIsCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCOLLECTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISCOLLECTION$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isCollection" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCOLLECTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISCOLLECTION$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "isCollection" attribute
     */
    public boolean isSetIsCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISCOLLECTION$4) != null;
        }
    }
    
    /**
     * Sets the "isCollection" attribute
     */
    public void setIsCollection(boolean isCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCOLLECTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISCOLLECTION$4);
            }
            target.setBooleanValue(isCollection);
        }
    }
    
    /**
     * Sets (as xml) the "isCollection" attribute
     */
    public void xsetIsCollection(org.apache.xmlbeans.XmlBoolean isCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCOLLECTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISCOLLECTION$4);
            }
            target.set(isCollection);
        }
    }
    
    /**
     * Unsets the "isCollection" attribute
     */
    public void unsetIsCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISCOLLECTION$4);
        }
    }
}