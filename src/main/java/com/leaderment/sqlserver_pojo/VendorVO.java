package com.leaderment.sqlserver_pojo;

import java.util.Date;

public class VendorVO {
	private String cvencode;
	
	private String cvenname;

    private String cvenabbname;
    
    private String cvccode;
    
    private String cvenaddress;
    
    private Date dvendevdate;
	
    private String cvenemail;
    
    private String cvenperson;
    
    private String cvenhand;
    
    private String cvenheadcode;
    
    private Boolean bventax;
    
    private String ccreateperson;
    
    private String cmodifyperson;
    
    private Date dmodifydate;
    
    private String cvenexchName;
    
    private String cvenpuomprotocol;
    
    private Double iventaxrate;
    
    private Date dvencreatedatetime;
    
    private String cvenmnemcode;
    
    private String cvencontactcode;

	public String getCvencode() {
		return cvencode;
	}

	public void setCvencode(String cvencode) {
		this.cvencode = cvencode;
	}

	public String getCvenname() {
		return cvenname;
	}

	public void setCvenname(String cvenname) {
		this.cvenname = cvenname;
	}

	public String getCvenabbname() {
		return cvenabbname;
	}

	public void setCvenabbname(String cvenabbname) {
		this.cvenabbname = cvenabbname;
	}

	public String getCvccode() {
		return cvccode;
	}

	public void setCvccode(String cvccode) {
		this.cvccode = cvccode;
	}

	public String getCvenaddress() {
		return cvenaddress;
	}

	public void setCvenaddress(String cvenaddress) {
		this.cvenaddress = cvenaddress;
	}

	public Date getDvendevdate() {
		return dvendevdate;
	}

	public void setDvendevdate(Date dvendevdate) {
		this.dvendevdate = dvendevdate;
	}

	public String getCvenemail() {
		return cvenemail;
	}

	public void setCvenemail(String cvenemail) {
		this.cvenemail = cvenemail;
	}

	public String getCvenperson() {
		return cvenperson;
	}

	public void setCvenperson(String cvenperson) {
		this.cvenperson = cvenperson;
	}

	public String getCvenhand() {
		return cvenhand;
	}

	public void setCvenhand(String cvenhand) {
		this.cvenhand = cvenhand;
	}

	public String getCvenheadcode() {
		return cvenheadcode;
	}

	public void setCvenheadcode(String cvenheadcode) {
		this.cvenheadcode = cvenheadcode;
	}

	public Boolean getBventax() {
		return bventax;
	}

	public void setBventax(Boolean bventax) {
		this.bventax = bventax;
	}

	public String getCcreateperson() {
		return ccreateperson;
	}

	public void setCcreateperson(String ccreateperson) {
		this.ccreateperson = ccreateperson;
	}

	public String getCmodifyperson() {
		return cmodifyperson;
	}

	public void setCmodifyperson(String cmodifyperson) {
		this.cmodifyperson = cmodifyperson;
	}

	public Date getDmodifydate() {
		return dmodifydate;
	}

	public void setDmodifydate(Date dmodifydate) {
		this.dmodifydate = dmodifydate;
	}

	public String getCvenexchName() {
		return cvenexchName;
	}

	public void setCvenexchName(String cvenexchName) {
		this.cvenexchName = cvenexchName;
	}

	public String getCvenpuomprotocol() {
		return cvenpuomprotocol;
	}

	public void setCvenpuomprotocol(String cvenpuomprotocol) {
		this.cvenpuomprotocol = cvenpuomprotocol;
	}

	public Double getIventaxrate() {
		return iventaxrate;
	}

	public void setIventaxrate(Double iventaxrate) {
		this.iventaxrate = iventaxrate;
	}

	public Date getDvencreatedatetime() {
		return dvencreatedatetime;
	}

	public void setDvencreatedatetime(Date dvencreatedatetime) {
		this.dvencreatedatetime = dvencreatedatetime;
	}

	public String getCvenmnemcode() {
		return cvenmnemcode;
	}

	public void setCvenmnemcode(String cvenmnemcode) {
		this.cvenmnemcode = cvenmnemcode;
	}

	public String getCvencontactcode() {
		return cvencontactcode;
	}

	public void setCvencontactcode(String cvencontactcode) {
		this.cvencontactcode = cvencontactcode;
	}

	@Override
	public String toString() {
		return "VendorVO [cvencode=" + cvencode + ", cvenname=" + cvenname + ", cvenabbname=" + cvenabbname
				+ ", cvccode=" + cvccode + ", cvenaddress=" + cvenaddress + ", dvendevdate=" + dvendevdate
				+ ", cvenemail=" + cvenemail + ", cvenperson=" + cvenperson + ", cvenhand=" + cvenhand
				+ ", cvenheadcode=" + cvenheadcode + ", bventax=" + bventax + ", ccreateperson=" + ccreateperson
				+ ", cmodifyperson=" + cmodifyperson + ", dmodifydate=" + dmodifydate + ", cvenexchName=" + cvenexchName
				+ ", cvenpuomprotocol=" + cvenpuomprotocol + ", iventaxrate=" + iventaxrate + ", dvencreatedatetime="
				+ dvencreatedatetime + ", cvenmnemcode=" + cvenmnemcode + ", cvencontactcode=" + cvencontactcode + "]";
	}
    
}
