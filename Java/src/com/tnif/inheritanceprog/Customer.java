package com.tnif.inheritanceprog;

public class Customer {
	private String name;
	private int id;
	private long adharno;
	private long phoneno;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, int id, long adharno, long phoneno) {
		super();
		this.name = name;
		this.id = id;
		this.adharno = adharno;
		this.phoneno = phoneno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", adharno=" + adharno + ", phoneno=" + phoneno
				+ ", getName()=" + getName() + ", getId()=" + getId() + ", getAdharno()=" + getAdharno()
				+ ", getPhoneno()=" + getPhoneno() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
