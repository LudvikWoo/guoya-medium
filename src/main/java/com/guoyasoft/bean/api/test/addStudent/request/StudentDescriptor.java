/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.guoyasoft.bean.api.test.addStudent.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.mapping.AccessMode;
import org.exolab.castor.mapping.ClassDescriptor;
import org.exolab.castor.mapping.FieldDescriptor;
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.FieldValidator;
import org.exolab.castor.xml.TypeValidator;
import org.exolab.castor.xml.XMLFieldDescriptor;
import org.exolab.castor.xml.handlers.*;
import org.exolab.castor.xml.util.XMLFieldDescriptorImpl;
import org.exolab.castor.xml.validators.*;

/**
 * 
 * 
 * @version $Revision$ $Date$
**/
public class StudentDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String nsPrefix;

    private java.lang.String nsURI;

    private java.lang.String xmlName;

    private org.exolab.castor.xml.XMLFieldDescriptor identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public StudentDescriptor() {
        super();
        xmlName = "student";
        
        //-- set grouping compositor
        setCompositorAsSequence();
        XMLFieldDescriptorImpl  desc           = null;
        XMLFieldHandler         handler        = null;
        FieldValidator          fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- initialize element descriptors
        
        //-- _tableName
        desc = new XMLFieldDescriptorImpl(java.lang.String.class, "_tableName", "tableName", NodeType.Element);
        desc.setImmutable(true);
        handler = (new XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Student target = (Student) object;
                return target.getTableName();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Student target = (Student) object;
                    target.setTableName( (java.lang.String) value);
                }
                catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        } );
        desc.setHandler(handler);
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _tableName
        fieldValidator = new FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            StringValidator sv = new StringValidator();
            sv.setMaxLength(30);
            sv.setWhiteSpace("preserve");
            fieldValidator.setValidator(sv);
        }
        desc.setValidator(fieldValidator);
        
        //-- _sname
        desc = new XMLFieldDescriptorImpl(java.lang.String.class, "_sname", "sname", NodeType.Element);
        desc.setImmutable(true);
        handler = (new XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Student target = (Student) object;
                return target.getSname();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Student target = (Student) object;
                    target.setSname( (java.lang.String) value);
                }
                catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        } );
        desc.setHandler(handler);
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _sname
        fieldValidator = new FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            StringValidator sv = new StringValidator();
            sv.setMaxLength(10);
            sv.setWhiteSpace("preserve");
            fieldValidator.setValidator(sv);
        }
        desc.setValidator(fieldValidator);
        
        //-- _sno
        desc = new XMLFieldDescriptorImpl(java.lang.String.class, "_sno", "sno", NodeType.Element);
        desc.setImmutable(true);
        handler = (new XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Student target = (Student) object;
                return target.getSno();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Student target = (Student) object;
                    target.setSno( (java.lang.String) value);
                }
                catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        } );
        desc.setHandler(handler);
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _sno
        fieldValidator = new FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            StringValidator sv = new StringValidator();
            sv.setMaxLength(10);
            sv.setWhiteSpace("preserve");
            fieldValidator.setValidator(sv);
        }
        desc.setValidator(fieldValidator);
        
        //-- _age
        desc = new XMLFieldDescriptorImpl(java.lang.String.class, "_age", "age", NodeType.Element);
        desc.setImmutable(true);
        handler = (new XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Student target = (Student) object;
                return target.getAge();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Student target = (Student) object;
                    target.setAge( (java.lang.String) value);
                }
                catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        } );
        desc.setHandler(handler);
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _age
        fieldValidator = new FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            StringValidator sv = new StringValidator();
            sv.setMaxLength(2);
            sv.setWhiteSpace("preserve");
            fieldValidator.setValidator(sv);
        }
        desc.setValidator(fieldValidator);
        
        //-- _phone
        desc = new XMLFieldDescriptorImpl(java.lang.String.class, "_phone", "phone", NodeType.Element);
        desc.setImmutable(true);
        handler = (new XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Student target = (Student) object;
                return target.getPhone();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Student target = (Student) object;
                    target.setPhone( (java.lang.String) value);
                }
                catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        } );
        desc.setHandler(handler);
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _phone
        fieldValidator = new FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            StringValidator sv = new StringValidator();
            sv.setMaxLength(11);
            sv.setWhiteSpace("preserve");
            fieldValidator.setValidator(sv);
        }
        desc.setValidator(fieldValidator);
        
        //-- _tname
        desc = new XMLFieldDescriptorImpl(java.lang.String.class, "_tname", "tname", NodeType.Element);
        desc.setImmutable(true);
        handler = (new XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Student target = (Student) object;
                return target.getTname();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Student target = (Student) object;
                    target.setTname( (java.lang.String) value);
                }
                catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        } );
        desc.setHandler(handler);
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _tname
        fieldValidator = new FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            StringValidator sv = new StringValidator();
            sv.setMaxLength(10);
            sv.setWhiteSpace("preserve");
            fieldValidator.setValidator(sv);
        }
        desc.setValidator(fieldValidator);
        
        //-- _education
        desc = new XMLFieldDescriptorImpl(java.lang.String.class, "_education", "education", NodeType.Element);
        desc.setImmutable(true);
        handler = (new XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Student target = (Student) object;
                return target.getEducation();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Student target = (Student) object;
                    target.setEducation( (java.lang.String) value);
                }
                catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        } );
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _education
        fieldValidator = new FieldValidator();
        { //-- local scope
            StringValidator sv = new StringValidator();
            sv.setMaxLength(10);
            sv.setWhiteSpace("preserve");
            fieldValidator.setValidator(sv);
        }
        desc.setValidator(fieldValidator);
        
        //-- _sex
        desc = new XMLFieldDescriptorImpl(java.lang.String.class, "_sex", "sex", NodeType.Element);
        desc.setImmutable(true);
        handler = (new XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Student target = (Student) object;
                return target.getSex();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Student target = (Student) object;
                    target.setSex( (java.lang.String) value);
                }
                catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return null;
            }
        } );
        desc.setHandler(handler);
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _sex
        fieldValidator = new FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            StringValidator sv = new StringValidator();
            sv.setLength(1);
            sv.setWhiteSpace("preserve");
            fieldValidator.setValidator(sv);
        }
        desc.setValidator(fieldValidator);
        
    } //-- com.guoyasoft.bean.api.test.addStudent.request.StudentDescriptor()


      //-----------/
     //- Methods -/
    //-----------/

    /**
    **/
    public org.exolab.castor.mapping.AccessMode getAccessMode()
    {
        return null;
    } //-- org.exolab.castor.mapping.AccessMode getAccessMode() 

    /**
    **/
    public org.exolab.castor.mapping.ClassDescriptor getExtends()
    {
        return null;
    } //-- org.exolab.castor.mapping.ClassDescriptor getExtends() 

    /**
    **/
    public org.exolab.castor.mapping.FieldDescriptor getIdentity()
    {
        return identity;
    } //-- org.exolab.castor.mapping.FieldDescriptor getIdentity() 

    /**
    **/
    public java.lang.Class getJavaClass()
    {
        return com.guoyasoft.bean.api.test.addStudent.request.Student.class;
    } //-- java.lang.Class getJavaClass() 

    /**
    **/
    public java.lang.String getNameSpacePrefix()
    {
        return nsPrefix;
    } //-- java.lang.String getNameSpacePrefix() 

    /**
    **/
    public java.lang.String getNameSpaceURI()
    {
        return nsURI;
    } //-- java.lang.String getNameSpaceURI() 

    /**
    **/
    public org.exolab.castor.xml.TypeValidator getValidator()
    {
        return this;
    } //-- org.exolab.castor.xml.TypeValidator getValidator() 

    /**
    **/
    public java.lang.String getXMLName()
    {
        return xmlName;
    } //-- java.lang.String getXMLName() 

}
