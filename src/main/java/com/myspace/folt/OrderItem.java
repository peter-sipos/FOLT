package com.myspace.folt;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OrderItem implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private java.lang.Integer quantity;

	public OrderItem() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(java.lang.Integer quantity) {
		this.quantity = quantity;
	}

	public OrderItem(java.lang.String name, java.lang.Integer quantity) {
		this.name = name;
		this.quantity = quantity;
	}

}