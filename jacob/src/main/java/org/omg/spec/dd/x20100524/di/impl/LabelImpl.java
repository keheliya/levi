/*
 * XML Type:  Label
 * Namespace: http://www.omg.org/spec/DD/20100524/DI
 * Java type: org.omg.spec.dd.x20100524.di.Label
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.dd.x20100524.di.impl;
/**
 * An XML Label(@http://www.omg.org/spec/DD/20100524/DI).
 *
 * This is a complex type.
 */
public class LabelImpl extends org.omg.spec.dd.x20100524.di.impl.NodeImpl implements org.omg.spec.dd.x20100524.di.Label
{
    private static final long serialVersionUID = 1L;
    
    public LabelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOUNDS$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/DD/20100524/DC", "Bounds");
    
    
    /**
     * Gets the "Bounds" element
     */
    public org.omg.spec.dd.x20100524.dc.Bounds getBounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.dc.Bounds target = null;
            target = (org.omg.spec.dd.x20100524.dc.Bounds)get_store().find_element_user(BOUNDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Bounds" element
     */
    public boolean isSetBounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOUNDS$0) != 0;
        }
    }
    
    /**
     * Sets the "Bounds" element
     */
    public void setBounds(org.omg.spec.dd.x20100524.dc.Bounds bounds)
    {
        generatedSetterHelperImpl(bounds, BOUNDS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Bounds" element
     */
    public org.omg.spec.dd.x20100524.dc.Bounds addNewBounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.dd.x20100524.dc.Bounds target = null;
            target = (org.omg.spec.dd.x20100524.dc.Bounds)get_store().add_element_user(BOUNDS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Bounds" element
     */
    public void unsetBounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOUNDS$0, 0);
        }
    }
}