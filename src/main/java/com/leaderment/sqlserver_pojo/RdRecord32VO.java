package com.leaderment.sqlserver_pojo;

import java.util.Date;

public class RdRecord32VO {
	private Long ID;
	private Byte bRdFlag;
	private String cVouchType;
	private String cBusType;
	private String cSource;
	private String cBusCode;
	private String cWhCode;
	private Date dDate;
	private String cCode;
	private String cRdCode;
	private String cDepCode;
	private String cCusCode;
	private String cHandler;
	private String cMaker;
	private String cDefine1;
	private Date dVeriDate;
	private Integer VT_ID;
	private String cDefine14;
	private Date dnmaketime;
	private Date dnverifytime;
	private String csysbarcode;
	private String cCheckSignFlag;

	public Long getID() {
		return ID;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}

	public Byte getbRdFlag() {
		return bRdFlag;
	}

	public void setbRdFlag(Byte bRdFlag) {
		this.bRdFlag = bRdFlag;
	}

	public String getcVouchType() {
		return cVouchType;
	}

	public void setcVouchType(String cVouchType) {
		this.cVouchType = cVouchType;
	}

	public String getcBusType() {
		return cBusType;
	}

	public void setcBusType(String cBusType) {
		this.cBusType = cBusType;
	}

	public String getcSource() {
		return cSource;
	}

	public void setcSource(String cSource) {
		this.cSource = cSource;
	}

	public String getcWhCode() {
		return cWhCode;
	}

	public void setcWhCode(String cWhCode) {
		this.cWhCode = cWhCode;
	}

	public String getcBusCode() {
		return cBusCode;
	}

	public void setcBusCode(String cBusCode) {
		this.cBusCode = cBusCode;
	}

	public Date getdDate() {
		return dDate;
	}

	public void setdDate(Date dDate) {
		this.dDate = dDate;
	}

	public String getcCode() {
		return cCode;
	}

	public void setcCode(String cCode) {
		this.cCode = cCode;
	}

	public String getcRdCode() {
		return cRdCode;
	}

	public void setcRdCode(String cRdCode) {
		this.cRdCode = cRdCode;
	}

	public String getcDepCode() {
		return cDepCode;
	}

	public void setcDepCode(String cDepCode) {
		this.cDepCode = cDepCode;
	}

	public String getcCusCode() {
		return cCusCode;
	}

	public void setcCusCode(String cCusCode) {
		this.cCusCode = cCusCode;
	}

	public String getcHandler() {
		return cHandler;
	}

	public void setcHandler(String cHandler) {
		this.cHandler = cHandler;
	}

	public String getcMaker() {
		return cMaker;
	}

	public void setcMaker(String cMaker) {
		this.cMaker = cMaker;
	}

	public String getcDefine1() {
		return cDefine1;
	}

	public void setcDefine1(String cDefine1) {
		this.cDefine1 = cDefine1;
	}

	public Date getdVeriDate() {
		return dVeriDate;
	}

	public void setdVeriDate(Date dVeriDate) {
		this.dVeriDate = dVeriDate;
	}

	public Integer getVT_ID() {
		return VT_ID;
	}

	public void setVT_ID(Integer VT_ID) {
		this.VT_ID = VT_ID;
	}

	public String getcDefine14() {
		return cDefine14;
	}

	public void setcDefine14(String cDefine14) {
		this.cDefine14 = cDefine14;
	}



	public Date getDnmaketime() {
		return dnmaketime;
	}

	public void setDnmaketime(Date dnmaketime) {
		this.dnmaketime = dnmaketime;
	}



	public String getCsysbarcode() {
		return csysbarcode;
	}

	public void setCsysbarcode(String csysbarcode) {
		this.csysbarcode = csysbarcode;
	}

	public String getcCheckSignFlag() {
		return cCheckSignFlag;
	}

	public void setcCheckSignFlag(String cCheckSignFlag) {
		this.cCheckSignFlag = cCheckSignFlag;
	}

	public Date getDnverifytime() {
		return dnverifytime;
	}

	public void setDnverifytime(Date dnverifytime) {
		this.dnverifytime = dnverifytime;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("RdRecord32VO{");
		sb.append("ID=").append(ID);
		sb.append(", bRdFlag=").append(bRdFlag);
		sb.append(", cVouchType='").append(cVouchType).append('\'');
		sb.append(", cBusType='").append(cBusType).append('\'');
		sb.append(", cSource='").append(cSource).append('\'');
		sb.append(", cWhCode='").append(cWhCode).append('\'');
		sb.append(", cBusCode='").append(cBusCode).append('\'');
		sb.append(", dDate=").append(dDate);
		sb.append(", cCode='").append(cCode).append('\'');
		sb.append(", cRdCode='").append(cRdCode).append('\'');
		sb.append(", cDepCode='").append(cDepCode).append('\'');
		sb.append(", cCusCode='").append(cCusCode).append('\'');
		sb.append(", cHandler='").append(cHandler).append('\'');
		sb.append(", cMaker='").append(cMaker).append('\'');
		sb.append(", cDefine1='").append(cDefine1).append('\'');
		sb.append(", dVeriDate=").append(dVeriDate);
		sb.append(", VT_ID=").append(VT_ID);
		sb.append(", cDefine14='").append(cDefine14).append('\'');

		sb.append(", dnmaketime=").append(dnmaketime);

		sb.append(", csysbarcode='").append(csysbarcode).append('\'');
		sb.append(", cCheckSignFlag='").append(cCheckSignFlag).append('\'');
		sb.append('}');
		return sb.toString();
	}


}