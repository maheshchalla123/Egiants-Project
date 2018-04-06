package com.SpringBootEx1.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class Employee {
	
	@Id
	@XmlElement
	private String eid;
	private String ename;
	private String deptname;
	
	public Employee()
	{
		
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", deptname=" + deptname + "]";
	}

@XmlAttribute
	public String getEid() {
		return eid;
	}
@XmlAttribute
	public void setEid(String eid) {
		this.eid = eid;
	}
@XmlAttribute
	public String getEname() {
		return ename;
	}
@XmlAttribute
	public void setEname(String ename) {
		this.ename = ename;
	}
@XmlAttribute
	public String getDeptname() {
		return deptname;
	}
@XmlAttribute
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public Employee(String eid, String ename, String deptname) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.deptname = deptname;
	}
}
