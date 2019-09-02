package com.leaderment.sqlserver_pojo;


import java.math.BigDecimal;
import java.util.Date;

public class Rdrecords32VO {
	private Long AutoID;
    private Long ID;
    private String cInvCode;
    private BigDecimal iQuantity;
    private String cBatch;
    private String cDefine22;
    private String cDefine23;
    private String cDefine24;
	private Long iDLsID;
	private Byte bCosting;
	private String cbdlcode;
    private String corufts;
    private int smallint;
    private int iorderdid;
    private int iorderseq;
    private int  ipesotype;
    private String cpesocode;
    private String csocode;
    private int irowno;
    private String cbsysbarcode;


	public Long getAutoID() {
		return AutoID;
	}

	public void setAutoID(Long autoID) {
		AutoID = autoID;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}

	public String getcInvCode() {
		return cInvCode;
	}

	public void setcInvCode(String cInvCode) {
		this.cInvCode = cInvCode;
	}

	public BigDecimal getiQuantity() {
		return iQuantity;
	}

	public void setiQuantity(BigDecimal iQuantity) {
		this.iQuantity = iQuantity;
	}

	public String getcBatch() {
		return cBatch;
	}

	public void setcBatch(String cBatch) {
		this.cBatch = cBatch;
	}

	public String getcDefine22() {
		return cDefine22;
	}

	public void setcDefine22(String cDefine22) {
		this.cDefine22 = cDefine22;
	}

	public String getcDefine23() {
		return cDefine23;
	}

	public void setcDefine23(String cDefine23) {
		this.cDefine23 = cDefine23;
	}

	public String getcDefine24() {
		return cDefine24;
	}

	public void setcDefine24(String cDefine24) {
		this.cDefine24 = cDefine24;
	}

	public Long getiDLsID() {
		return iDLsID;
	}

	public void setiDLsID(Long iDLsID) {
		this.iDLsID = iDLsID;
	}

	public Byte getbCosting() {
		return bCosting;
	}

	public void setbCosting(Byte bCosting) {
		this.bCosting = bCosting;
	}

	public String getCbdlcode() {
		return cbdlcode;
	}

	public void setCbdlcode(String cbdlcode) {
		this.cbdlcode = cbdlcode;
	}

	public String getCorufts() {
		return corufts;
	}

	public void setCorufts(String corufts) {
		this.corufts = corufts;
	}

	public int getSmallint() {
		return smallint;
	}

	public void setSmallint(int smallint) {
		this.smallint = smallint;
	}

	public int getIorderdid() {
		return iorderdid;
	}

	public void setIorderdid(int iorderdid) {
		this.iorderdid = iorderdid;
	}

	public int getIorderseq() {
		return iorderseq;
	}

	public void setIorderseq(int iorderseq) {
		this.iorderseq = iorderseq;
	}

	public int getIpesotype() {
		return ipesotype;
	}

	public void setIpesotype(int ipesotype) {
		this.ipesotype = ipesotype;
	}

	public String getCpesocode() {
		return cpesocode;
	}

	public void setCpesocode(String cpesocode) {
		this.cpesocode = cpesocode;
	}

	public String getCsocode() {
		return csocode;
	}

	public void setCsocode(String csocode) {
		this.csocode = csocode;
	}

	public int getIrowno() {
		return irowno;
	}

	public void setIrowno(int irowno) {
		this.irowno = irowno;
	}



	public String getCbsysbarcode() {
		return cbsysbarcode;
	}

	public void setCbsysbarcode(String cbsysbarcode) {
		this.cbsysbarcode = cbsysbarcode;
	}


	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("rdrecords32VO{");
		sb.append("AutoID=").append(AutoID);
		sb.append(", ID=").append(ID);
		sb.append(", cInvCode='").append(cInvCode).append('\'');
		sb.append(", iQuantity=").append(iQuantity);
		sb.append(", cBatch='").append(cBatch).append('\'');
		sb.append(", cDefine22='").append(cDefine22).append('\'');
		sb.append(", cDefine23='").append(cDefine23).append('\'');
		sb.append(", cDefine24='").append(cDefine24).append('\'');
		sb.append(", iDLsID=").append(iDLsID);
		sb.append(", bCosting=").append(bCosting);
		sb.append(", cbdlcode='").append(cbdlcode).append('\'');
		sb.append(", corufts='").append(corufts).append('\'');
		sb.append(", smallint=").append(smallint);
		sb.append(", iorderdid=").append(iorderdid);
		sb.append(", iorderseq=").append(iorderseq);
		sb.append(", ipesotype=").append(ipesotype);
		sb.append(", cpesocode='").append(cpesocode).append('\'');
		sb.append(", csocode='").append(csocode).append('\'');
		sb.append(", irowno=").append(irowno);

		sb.append(", cbsysbarcode='").append(cbsysbarcode).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
