package com.myspace.folt;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class LocationInformation implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String latitude;
	private java.lang.String longitude;
	private java.lang.String city;

	private java.lang.String ip;

	public LocationInformation() {
	}

	public java.lang.String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(java.lang.String latitude) {
		this.latitude = latitude;
	}

	public java.lang.String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(java.lang.String longitude) {
		this.longitude = longitude;
	}

	public java.lang.String getCity() {
		return this.city;
	}

	public void setCity(java.lang.String city) {
		this.city = city;
	}

	public java.lang.String getIp() {
		return this.ip;
	}

	public void setIp(java.lang.String ip) {
		this.ip = ip;
	}

	public LocationInformation(java.lang.String latitude,
			java.lang.String longitude, java.lang.String city,
			java.lang.String ip) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.city = city;
		this.ip = ip;
	}

}