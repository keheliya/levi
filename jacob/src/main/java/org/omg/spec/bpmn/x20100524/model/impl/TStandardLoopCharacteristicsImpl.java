/*
 * XML Type:  tStandardLoopCharacteristics
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TStandardLoopCharacteristics
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tStandardLoopCharacteristics(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TStandardLoopCharacteristicsImpl extends org.omg.spec.bpmn.x20100524.model.impl.TLoopCharacteristicsImpl implements org.omg.spec.bpmn.x20100524.model.TStandardLoopCharacteristics
{
    private static final long serialVersionUID = 1L;
    
    public TStandardLoopCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOOPCONDITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "loopCondition");
    private static final javax.xml.namespace.QName TESTBEFORE$2 = 
        new javax.xml.namespace.QName("", "testBefore");
    private static final javax.xml.namespace.QName LOOPMAXIMUM$4 = 
        new javax.xml.namespace.QName("", "loopMaximum");
    
    
    /**
     * Gets the "loopCondition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression getLoopCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().find_element_user(LOOPCONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "loopCondition" element
     */
    public boolean isSetLoopCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOOPCONDITION$0) != 0;
        }
    }
    
    /**
     * Sets the "loopCondition" element
     */
    public void setLoopCondition(org.omg.spec.bpmn.x20100524.model.TExpression loopCondition)
    {
        generatedSetterHelperImpl(loopCondition, LOOPCONDITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "loopCondition" element
     */
    public org.omg.spec.bpmn.x20100524.model.TExpression addNewLoopCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TExpression target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TExpression)get_store().add_element_user(LOOPCONDITION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "loopCondition" element
     */
    public void unsetLoopCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOOPCONDITION$0, 0);
        }
    }
    
    /**
     * Gets the "testBefore" attribute
     */
    public boolean getTestBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TESTBEFORE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TESTBEFORE$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "testBefore" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTestBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TESTBEFORE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TESTBEFORE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "testBefore" attribute
     */
    public boolean isSetTestBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TESTBEFORE$2) != null;
        }
    }
    
    /**
     * Sets the "testBefore" attribute
     */
    public void setTestBefore(boolean testBefore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TESTBEFORE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TESTBEFORE$2);
            }
            target.setBooleanValue(testBefore);
        }
    }
    
    /**
     * Sets (as xml) the "testBefore" attribute
     */
    public void xsetTestBefore(org.apache.xmlbeans.XmlBoolean testBefore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TESTBEFORE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TESTBEFORE$2);
            }
            target.set(testBefore);
        }
    }
    
    /**
     * Unsets the "testBefore" attribute
     */
    public void unsetTestBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TESTBEFORE$2);
        }
    }
    
    /**
     * Gets the "loopMaximum" attribute
     */
    public java.math.BigInteger getLoopMaximum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOOPMAXIMUM$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "loopMaximum" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetLoopMaximum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LOOPMAXIMUM$4);
            return target;
        }
    }
    
    /**
     * True if has "loopMaximum" attribute
     */
    public boolean isSetLoopMaximum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOOPMAXIMUM$4) != null;
        }
    }
    
    /**
     * Sets the "loopMaximum" attribute
     */
    public void setLoopMaximum(java.math.BigInteger loopMaximum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOOPMAXIMUM$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOOPMAXIMUM$4);
            }
            target.setBigIntegerValue(loopMaximum);
        }
    }
    
    /**
     * Sets (as xml) the "loopMaximum" attribute
     */
    public void xsetLoopMaximum(org.apache.xmlbeans.XmlInteger loopMaximum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LOOPMAXIMUM$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(LOOPMAXIMUM$4);
            }
            target.set(loopMaximum);
        }
    }
    
    /**
     * Unsets the "loopMaximum" attribute
     */
    public void unsetLoopMaximum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOOPMAXIMUM$4);
        }
    }
}
