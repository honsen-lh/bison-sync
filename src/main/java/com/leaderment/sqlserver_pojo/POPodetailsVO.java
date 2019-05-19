package com.leaderment.sqlserver_pojo;


import java.math.BigDecimal;
import java.util.Date;

public class POPodetailsVO {
    private Integer id;

    private String cpoid;
    
    private Integer poid;

    private String cinvcode;

    private BigDecimal iquantity;

    private BigDecimal iunitprice;

    private BigDecimal imoney;

    private BigDecimal itax;

    private BigDecimal isum;

    private BigDecimal inatunitprice;

    private BigDecimal inatmoney;

    private BigDecimal inattax;

    private BigDecimal inatsum;

    private Date darrivedate;

    private BigDecimal iinvqty;

    private BigDecimal iinvmoney;

    private BigDecimal inatinvmoney;

    private BigDecimal ipertaxrate;

    private String cdefine24;

    private BigDecimal itaxprice;

    private BigDecimal iarrmoney;

    private BigDecimal inatarrmoney;

    private BigDecimal fpovalidquantity;

    private BigDecimal fpovalidnum;

    private BigDecimal fpoarrquantity;

    private Integer ivouchrowno;

    private BigDecimal freceivedqty;

    private String cbsysbarcode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpoid() {
		return cpoid;
	}

	public void setCpoid(String cpoid) {
		this.cpoid = cpoid;
	}

	public Integer getPoid() {
		return poid;
	}

	public void setPoid(Integer poid) {
		this.poid = poid;
	}

	public String getCinvcode() {
		return cinvcode;
	}

	public void setCinvcode(String cinvcode) {
		this.cinvcode = cinvcode;
	}

	public BigDecimal getIquantity() {
		return iquantity;
	}

	public void setIquantity(BigDecimal iquantity) {
		this.iquantity = iquantity;
	}

	public BigDecimal getIunitprice() {
		return iunitprice;
	}

	public void setIunitprice(BigDecimal iunitprice) {
		this.iunitprice = iunitprice;
	}

	public BigDecimal getImoney() {
		return imoney;
	}

	public void setImoney(BigDecimal imoney) {
		this.imoney = imoney;
	}

	public BigDecimal getItax() {
		return itax;
	}

	public void setItax(BigDecimal itax) {
		this.itax = itax;
	}

	public BigDecimal getIsum() {
		return isum;
	}

	public void setIsum(BigDecimal isum) {
		this.isum = isum;
	}

	public BigDecimal getInatunitprice() {
		return inatunitprice;
	}

	public void setInatunitprice(BigDecimal inatunitprice) {
		this.inatunitprice = inatunitprice;
	}

	public BigDecimal getInatmoney() {
		return inatmoney;
	}

	public void setInatmoney(BigDecimal inatmoney) {
		this.inatmoney = inatmoney;
	}

	public BigDecimal getInattax() {
		return inattax;
	}

	public void setInattax(BigDecimal inattax) {
		this.inattax = inattax;
	}

	public BigDecimal getInatsum() {
		return inatsum;
	}

	public void setInatsum(BigDecimal inatsum) {
		this.inatsum = inatsum;
	}

	public Date getDarrivedate() {
		return darrivedate;
	}

	public void setDarrivedate(Date darrivedate) {
		this.darrivedate = darrivedate;
	}

	public BigDecimal getIinvqty() {
		return iinvqty;
	}

	public void setIinvqty(BigDecimal iinvqty) {
		this.iinvqty = iinvqty;
	}

	public BigDecimal getIinvmoney() {
		return iinvmoney;
	}

	public void setIinvmoney(BigDecimal iinvmoney) {
		this.iinvmoney = iinvmoney;
	}

	public BigDecimal getInatinvmoney() {
		return inatinvmoney;
	}

	public void setInatinvmoney(BigDecimal inatinvmoney) {
		this.inatinvmoney = inatinvmoney;
	}

	public BigDecimal getIpertaxrate() {
		return ipertaxrate;
	}

	public void setIpertaxrate(BigDecimal ipertaxrate) {
		this.ipertaxrate = ipertaxrate;
	}

	public String getCdefine24() {
		return cdefine24;
	}

	public void setCdefine24(String cdefine24) {
		this.cdefine24 = cdefine24;
	}

	public BigDecimal getItaxprice() {
		return itaxprice;
	}

	public void setItaxprice(BigDecimal itaxprice) {
		this.itaxprice = itaxprice;
	}

	public BigDecimal getIarrmoney() {
		return iarrmoney;
	}

	public void setIarrmoney(BigDecimal iarrmoney) {
		this.iarrmoney = iarrmoney;
	}

	public BigDecimal getInatarrmoney() {
		return inatarrmoney;
	}

	public void setInatarrmoney(BigDecimal inatarrmoney) {
		this.inatarrmoney = inatarrmoney;
	}

	public BigDecimal getFpovalidquantity() {
		return fpovalidquantity;
	}

	public void setFpovalidquantity(BigDecimal fpovalidquantity) {
		this.fpovalidquantity = fpovalidquantity;
	}

	public BigDecimal getFpovalidnum() {
		return fpovalidnum;
	}

	public void setFpovalidnum(BigDecimal fpovalidnum) {
		this.fpovalidnum = fpovalidnum;
	}

	public BigDecimal getFpoarrquantity() {
		return fpoarrquantity;
	}

	public void setFpoarrquantity(BigDecimal fpoarrquantity) {
		this.fpoarrquantity = fpoarrquantity;
	}

	public Integer getIvouchrowno() {
		return ivouchrowno;
	}

	public void setIvouchrowno(Integer ivouchrowno) {
		this.ivouchrowno = ivouchrowno;
	}

	public BigDecimal getFreceivedqty() {
		return freceivedqty;
	}

	public void setFreceivedqty(BigDecimal freceivedqty) {
		this.freceivedqty = freceivedqty;
	}

	public String getCbsysbarcode() {
		return cbsysbarcode;
	}

	public void setCbsysbarcode(String cbsysbarcode) {
		this.cbsysbarcode = cbsysbarcode;
	}

	@Override
	public String toString() {
		return "POPodetailsVO [id=" + id + ", cpoid=" + cpoid + ", poid=" + poid + ", cinvcode=" + cinvcode
				+ ", iquantity=" + iquantity + ", iunitprice=" + iunitprice + ", imoney=" + imoney + ", itax=" + itax
				+ ", isum=" + isum + ", inatunitprice=" + inatunitprice + ", inatmoney=" + inatmoney + ", inattax="
				+ inattax + ", inatsum=" + inatsum + ", darrivedate=" + darrivedate + ", iinvqty=" + iinvqty
				+ ", iinvmoney=" + iinvmoney + ", inatinvmoney=" + inatinvmoney + ", ipertaxrate=" + ipertaxrate
				+ ", cdefine24=" + cdefine24 + ", itaxprice=" + itaxprice + ", iarrmoney=" + iarrmoney
				+ ", inatarrmoney=" + inatarrmoney + ", fpovalidquantity=" + fpovalidquantity + ", fpovalidnum="
				+ fpovalidnum + ", fpoarrquantity=" + fpoarrquantity + ", ivouchrowno=" + ivouchrowno
				+ ", freceivedqty=" + freceivedqty + ", cbsysbarcode=" + cbsysbarcode + "]";
	}
    
    
   
}