package com.leaderment.sqlserver_pojo;

public class VenAndInvVO {
    private Integer autoid;

    private String cvencode;

    private String cinvcode;
   
    private Short isuppproperty;

    private Double ftotalquota;

    private Double ffinishrateup;

    public Integer getAutoid() {
        return autoid;
    }

    public void setAutoid(Integer autoid) {
        this.autoid = autoid;
    }

    public String getCvencode() {
        return cvencode;
    }

    public void setCvencode(String cvencode) {
        this.cvencode = cvencode == null ? null : cvencode.trim();
    }

    public String getCinvcode() {
        return cinvcode;
    }

    public void setCinvcode(String cinvcode) {
        this.cinvcode = cinvcode == null ? null : cinvcode.trim();
    }
    
    public Short getIsuppproperty() {
		return isuppproperty;
	}

	public void setIsuppproperty(Short isuppproperty) {
		this.isuppproperty = isuppproperty;
	}

	public Double getFtotalquota() {
        return ftotalquota;
    }

    public void setFtotalquota(Double ftotalquota) {
        this.ftotalquota = ftotalquota;
    }

    public Double getFfinishrateup() {
        return ffinishrateup;
    }

    public void setFfinishrateup(Double ffinishrateup) {
        this.ffinishrateup = ffinishrateup;
    }

    
}