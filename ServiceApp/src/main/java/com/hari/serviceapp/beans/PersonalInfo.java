package com.hari.serviceapp.beans;

public class PersonalInfo {
	
	private String firstName;
	private String lastName;
	private String[] emails;
	private String[] contactNumber;
	private String aadharNumber;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String[] getEmails() {
		return emails;
	}
	public void setEmails(String[] emails) {
		this.emails = emails;
	}
	public String[] getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String[] contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

}
