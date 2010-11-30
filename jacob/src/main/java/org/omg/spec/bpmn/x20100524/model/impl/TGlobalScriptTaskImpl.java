/*
 * XML Type:  tGlobalScriptTask
 * Namespace: http://www.omg.org/spec/BPMN/20100524/MODEL
 * Java type: org.omg.spec.bpmn.x20100524.model.TGlobalScriptTask
 *
 * Automatically generated - do not modify.
 */
package org.omg.spec.bpmn.x20100524.model.impl;
/**
 * An XML tGlobalScriptTask(@http://www.omg.org/spec/BPMN/20100524/MODEL).
 *
 * This is a complex type.
 */
public class TGlobalScriptTaskImpl extends org.omg.spec.bpmn.x20100524.model.impl.TGlobalTaskImpl implements org.omg.spec.bpmn.x20100524.model.TGlobalScriptTask
{
    private static final long serialVersionUID = 1L;
    
    public TGlobalScriptTaskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCRIPT$0 = 
        new javax.xml.namespace.QName("http://www.omg.org/spec/BPMN/20100524/MODEL", "script");
    private static final javax.xml.namespace.QName SCRIPTLANGUAGE$2 = 
        new javax.xml.namespace.QName("", "scriptLanguage");
    
    
    /**
     * Gets the "script" element
     */
    public org.omg.spec.bpmn.x20100524.model.TScript getScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TScript target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TScript)get_store().find_element_user(SCRIPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "script" element
     */
    public boolean isSetScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCRIPT$0) != 0;
        }
    }
    
    /**
     * Sets the "script" element
     */
    public void setScript(org.omg.spec.bpmn.x20100524.model.TScript script)
    {
        generatedSetterHelperImpl(script, SCRIPT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "script" element
     */
    public org.omg.spec.bpmn.x20100524.model.TScript addNewScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.spec.bpmn.x20100524.model.TScript target = null;
            target = (org.omg.spec.bpmn.x20100524.model.TScript)get_store().add_element_user(SCRIPT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "script" element
     */
    public void unsetScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCRIPT$0, 0);
        }
    }
    
    /**
     * Gets the "scriptLanguage" attribute
     */
    public java.lang.String getScriptLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCRIPTLANGUAGE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scriptLanguage" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetScriptLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SCRIPTLANGUAGE$2);
            return target;
        }
    }
    
    /**
     * True if has "scriptLanguage" attribute
     */
    public boolean isSetScriptLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCRIPTLANGUAGE$2) != null;
        }
    }
    
    /**
     * Sets the "scriptLanguage" attribute
     */
    public void setScriptLanguage(java.lang.String scriptLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCRIPTLANGUAGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCRIPTLANGUAGE$2);
            }
            target.setStringValue(scriptLanguage);
        }
    }
    
    /**
     * Sets (as xml) the "scriptLanguage" attribute
     */
    public void xsetScriptLanguage(org.apache.xmlbeans.XmlAnyURI scriptLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SCRIPTLANGUAGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SCRIPTLANGUAGE$2);
            }
            target.set(scriptLanguage);
        }
    }
    
    /**
     * Unsets the "scriptLanguage" attribute
     */
    public void unsetScriptLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCRIPTLANGUAGE$2);
        }
    }
}
