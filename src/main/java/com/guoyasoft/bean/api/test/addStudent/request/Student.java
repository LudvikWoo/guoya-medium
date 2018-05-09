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

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * 
 * 
 * @version $Revision$ $Date$
**/
public class Student implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _tableName;

    private java.lang.String _sname;

    private java.lang.String _sno;

    private java.lang.String _age;

    private java.lang.String _phone;

    private java.lang.String _tname;

    private java.lang.String _education;

    private java.lang.String _sex;


      //----------------/
     //- Constructors -/
    //----------------/

    public Student() {
        super();
    } //-- com.guoyasoft.bean.api.test.addStudent.request.Student()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'age'.
     * 
     * @return the value of field 'age'.
    **/
    public java.lang.String getAge()
    {
        return this._age;
    } //-- java.lang.String getAge() 

    /**
     * Returns the value of field 'education'.
     * 
     * @return the value of field 'education'.
    **/
    public java.lang.String getEducation()
    {
        return this._education;
    } //-- java.lang.String getEducation() 

    /**
     * Returns the value of field 'phone'.
     * 
     * @return the value of field 'phone'.
    **/
    public java.lang.String getPhone()
    {
        return this._phone;
    } //-- java.lang.String getPhone() 

    /**
     * Returns the value of field 'sex'.
     * 
     * @return the value of field 'sex'.
    **/
    public java.lang.String getSex()
    {
        return this._sex;
    } //-- java.lang.String getSex() 

    /**
     * Returns the value of field 'sname'.
     * 
     * @return the value of field 'sname'.
    **/
    public java.lang.String getSname()
    {
        return this._sname;
    } //-- java.lang.String getSname() 

    /**
     * Returns the value of field 'sno'.
     * 
     * @return the value of field 'sno'.
    **/
    public java.lang.String getSno()
    {
        return this._sno;
    } //-- java.lang.String getSno() 

    /**
     * Returns the value of field 'tableName'.
     * 
     * @return the value of field 'tableName'.
    **/
    public java.lang.String getTableName()
    {
        return this._tableName;
    } //-- java.lang.String getTableName() 

    /**
     * Returns the value of field 'tname'.
     * 
     * @return the value of field 'tname'.
    **/
    public java.lang.String getTname()
    {
        return this._tname;
    } //-- java.lang.String getTname() 

    /**
    **/
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * 
     * 
     * @param out
    **/
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * 
     * 
     * @param handler
    **/
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'age'.
     * 
     * @param age the value of field 'age'.
    **/
    public void setAge(java.lang.String age)
    {
        this._age = age;
    } //-- void setAge(java.lang.String) 

    /**
     * Sets the value of field 'education'.
     * 
     * @param education the value of field 'education'.
    **/
    public void setEducation(java.lang.String education)
    {
        this._education = education;
    } //-- void setEducation(java.lang.String) 

    /**
     * Sets the value of field 'phone'.
     * 
     * @param phone the value of field 'phone'.
    **/
    public void setPhone(java.lang.String phone)
    {
        this._phone = phone;
    } //-- void setPhone(java.lang.String) 

    /**
     * Sets the value of field 'sex'.
     * 
     * @param sex the value of field 'sex'.
    **/
    public void setSex(java.lang.String sex)
    {
        this._sex = sex;
    } //-- void setSex(java.lang.String) 

    /**
     * Sets the value of field 'sname'.
     * 
     * @param sname the value of field 'sname'.
    **/
    public void setSname(java.lang.String sname)
    {
        this._sname = sname;
    } //-- void setSname(java.lang.String) 

    /**
     * Sets the value of field 'sno'.
     * 
     * @param sno the value of field 'sno'.
    **/
    public void setSno(java.lang.String sno)
    {
        this._sno = sno;
    } //-- void setSno(java.lang.String) 

    /**
     * Sets the value of field 'tableName'.
     * 
     * @param tableName the value of field 'tableName'.
    **/
    public void setTableName(java.lang.String tableName)
    {
        this._tableName = tableName;
    } //-- void setTableName(java.lang.String) 

    /**
     * Sets the value of field 'tname'.
     * 
     * @param tname the value of field 'tname'.
    **/
    public void setTname(java.lang.String tname)
    {
        this._tname = tname;
    } //-- void setTname(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.bean.api.test.addStudent.request.Student unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.bean.api.test.addStudent.request.Student) Unmarshaller.unmarshal(com.guoyasoft.bean.api.test.addStudent.request.Student.class, reader);
    } //-- com.guoyasoft.bean.api.test.addStudent.request.Student unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 


	@Override
	public String toString() {
		return "Student [_tableName=" + _tableName + ", _sname=" + _sname
				+ ", _sno=" + _sno + ", _age=" + _age + ", _phone=" + _phone
				+ ", _tname=" + _tname + ", _education=" + _education
				+ ", _sex=" + _sex + "]";
	}

}
