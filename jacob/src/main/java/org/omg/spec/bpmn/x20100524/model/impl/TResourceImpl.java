/*
 * XML Type:  tResource
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TResource
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tResource(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TResourceImpl extends org.omg.spec.bpmn.x20100524.model.impl.TRootElementImpl implements org.omg.spec.bpmn.x20100524.model.TResource
{
    private static final long serialVersionUID = 1L;
    
    public TResourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "resourceParameter");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets array of all "resourceParameter" elements
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceParameter[] getResourceParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEPARAMETER$0, targetList);
            org.omg.spec.bpmn.x20100524.model.TResourceParameter[] result = new org.omg.spec.bpmn.x20100524.model.TResourceParameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourceParameter" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceParameter getResourceParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceParameter target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceParameter)get_store().find_element_user(RESOURCEPARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourceParameter" element
     */
    public int sizeOfResourceParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEPARAMETER$0);
        }
    }
    
    /**
     * Sets array of all "resourceParameter" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResourceParameterArray(org.omg.spec.bpmn.x20100524.model.TResourceParameter[] resourceParameterArray)
    {
        check_orphaned();
        arraySetterHelper(resourceParameterArray, RESOURCEPARAMETER$0);
    }
    
    /**
     * Sets ith "resourceParameter" element
     */
    public void setResourceParameterArray(int i, org.omg.spec.bpmn.x20100524.model.TResourceParameter resourceParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceParameter target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceParameter)get_store().find_element_user(RESOURCEPARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceParameter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceParameter" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceParameter insertNewResourceParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceParameter target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceParameter)get_store().insert_element_user(RESOURCEPARAMETER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceParameter" element
     */
    public org.omg.spec.bpmn.x20100524.model.TResourceParameter addNewResourceParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TResourceParameter target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TResourceParameter)get_store().add_element_user(RESOURCEPARAMETER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourceParameter" element
     */
    public void removeResourceParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEPARAMETER$0, i);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
}