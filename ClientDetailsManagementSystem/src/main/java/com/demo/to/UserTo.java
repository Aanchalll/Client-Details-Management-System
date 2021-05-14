package com.demo.to;

public class UserTo {
private int userid;
private String name;
private String email;
private String password;

private int clientid;
private String orgname;
private String contactname;
private Long phone;
private String address;
private String buisnesstype;
private String reqdservice;


/*
 * public UserTo() {
 * 
 * }
 */
public UserTo(int clientid, String orgname, String contactname, Long phone,String address,String buisnesstype,String reqdservice) {
	
	this.clientid = clientid;
	this.orgname = orgname;
	this.contactname = contactname;
	this.phone = phone;
	this.address = address;
	this.buisnesstype = buisnesstype;
	this.reqdservice = reqdservice;
}
public UserTo(int userid, String name, String email, String password) {
	super();
	this.userid = userid;
	this.name = name;
	this.email = email;
	this.password = password;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getClientid() {
	return clientid;
}
public void setClientid(int clientid) {
	this.clientid = clientid;
}
public String getOrgname() {
	return orgname;
}
public void setOrgname(String orgname) {
	this.orgname = orgname;
}
public String getContactname() {
	return contactname;
}
public void setContactname(String contactname) {
	this.contactname = contactname;
}
public Long getPhone() {
	return phone;
}
public void setPhone(Long phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getBuisnesstype() {
	return buisnesstype;
}
public void setBuisnesstype(String buisnesstype) {
	this.buisnesstype = buisnesstype;
}
public String getReqdservice() {
	return reqdservice;
}
public void setReqdservice(String reqdservice) {
	this.reqdservice = reqdservice;
}
public int getInt(int i) {
	return i; // TODO Auto-generated method stub
	
}


}
