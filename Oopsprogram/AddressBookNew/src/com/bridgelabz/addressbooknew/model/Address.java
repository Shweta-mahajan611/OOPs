package com.bridgelabz.addressbooknew.model;
/**
 * getter setter for address
 * @author Shweta Mahajan
 *
 */
public class Address
{
	private String address;
	private String city;
	private String state;
	private int zip;
	
	public Address() {};
	public Address(String address, String city, String state, int zip) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
}
