package com.app1.SpringBoot;


public class Country{
 
 String id;
 String fnameName;
 String lastname;
 String email;
 int pincode;
 int DOB;
 
 public Country() {
 super();
 }
 public Country(String id, String fnameName,String lastname,String email,int pincode,int DOB) {
 super();
 this.id = id;
 this.fnameName = fnameName;
 this.lastname=lastname;
 this.email=email;
 this.pincode=pincode;
 this.DOB=DOB;
 }
 public String getFnameName() {
	return fnameName;
}
public void setFnameName(String fnameName) {
	this.fnameName = fnameName;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public int getDOB() {
	return DOB;
}
public void setDOB(int dOB) {
	DOB = dOB;
}
public String getId() {
 return id;
 }
 public void setId(String id) {
 this.id = id;
 }
 public String getfnameName() {
 return fnameName;
 }
 public void setfnameName(String fnameName) {
 this.fnameName = fnameName;
 }

 } 
 

 

 
 