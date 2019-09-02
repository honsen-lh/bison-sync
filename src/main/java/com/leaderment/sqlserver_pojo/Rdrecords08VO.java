package com.leaderment.sqlserver_pojo;


import java.math.BigDecimal;
import java.util.Date;

public class Rdrecords08VO {
	private Long autoid;

    private Long id;

    private String cinvcode;

    private BigDecimal iquantity;

    private BigDecimal iunitcost;

    private BigDecimal iprice;

    private String cbatch;

    private Long itrids;

    private String cdefine23;

    private String cdefine24;

    private BigDecimal inquantity;

    private String cbaccounter;

    private Date dbkeepdate;

    private Boolean bcosting;

    private Integer irowno;

    private Integer igroupno;

    private String cbsysbarcode;

	public Long getAutoid() {
		return autoid;
	}

	public void setAutoid(Long autoid) {
		this.autoid = autoid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public BigDecimal getIunitcost() {
		return iunitcost;
	}

	public void setIunitcost(BigDecimal iunitcost) {
		this.iunitcost = iunitcost;
	}

	public BigDecimal getIprice() {
		return iprice;
	}

	public void setIprice(BigDecimal iprice) {
		this.iprice = iprice;
	}

	public String getCbatch() {
		return cbatch;
	}

	public void setCbatch(String cbatch) {
		this.cbatch = cbatch;
	}

	public Long getItrids() {
		return itrids;
	}

	public void setItrids(Long itrids) {
		this.itrids = itrids;
	}

	public String getCdefine23() {
		return cdefine23;
	}

	public void setCdefine23(String cdefine23) {
		this.cdefine23 = cdefine23;
	}

	public String getCdefine24() {
		return cdefine24;
	}

	public void setCdefine24(String cdefine24) {
		this.cdefine24 = cdefine24;
	}

	public BigDecimal getInquantity() {
		return inquantity;
	}

	public void setInquantity(BigDecimal inquantity) {
		this.inquantity = inquantity;
	}

	public String getCbaccounter() {
		return cbaccounter;
	}

	public void setCbaccounter(String cbaccounter) {
		this.cbaccounter = cbaccounter;
	}

	public Date getDbkeepdate() {
		return dbkeepdate;
	}

	public void setDbkeepdate(Date dbkeepdate) {
		this.dbkeepdate = dbkeepdate;
	}

	public Boolean getBcosting() {
		return bcosting;
	}

	public void setBcosting(Boolean bcosting) {
		this.bcosting = bcosting;
	}

	public Integer getIrowno() {
		return irowno;
	}

	public void setIrowno(Integer irowno) {
		this.irowno = irowno;
	}

	public Integer getIgroupno() {
		return igroupno;
	}

	public void setIgroupno(Integer igroupno) {
		this.igroupno = igroupno;
	}

	public String getCbsysbarcode() {
		return cbsysbarcode;
	}

	public void setCbsysbarcode(String cbsysbarcode) {
		this.cbsysbarcode = cbsysbarcode;
	}

	@Override
	public String toString() {
		return "Rdrecords08VO [autoid=" + autoid + ", id=" + id + ", cinvcode=" + cinvcode + ", iquantity=" + iquantity
				+ ", iunitcost=" + iunitcost + ", iprice=" + iprice + ", cbatch=" + cbatch + ", itrids=" + itrids
				+ ", cdefine23=" + cdefine23 + ", cdefine24=" + cdefine24 + ", inquantity=" + inquantity
				+ ", cbaccounter=" + cbaccounter + ", dbkeepdate=" + dbkeepdate + ", bcosting=" + bcosting + ", irowno="
				+ irowno + ", igroupno=" + igroupno + ", cbsysbarcode=" + cbsysbarcode + "]";
	}
    
}