package com.myspace.folt;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.xml.bind.annotation.XmlRootElement
public class Couriers implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.util.List<com.myspace.folt.Courier> couriers;

	public Couriers() {
	}

	public java.util.List<com.myspace.folt.Courier> getCouriers() {
		return this.couriers;
	}

	public void setCouriers(java.util.List<com.myspace.folt.Courier> couriers) {
		this.couriers = couriers;
	}

	public Couriers(java.util.List<com.myspace.folt.Courier> couriers) {
		this.couriers = couriers;
	}

}