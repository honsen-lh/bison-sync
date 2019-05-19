package com.leaderment.mysql_pojo;

public class VenAndInv {
    private Integer autoId;

    private String cVenCode;

    private String cInvCode;

    private Short iSuppProperty;

    private Float fTotalQuota;

    private Float fFinishRateUp;

    public Integer getAutoId() {
        return autoId;
    }

    public void setAutoId(Integer autoId) {
        this.autoId = autoId;
    }

    public String getcVenCode() {
        return cVenCode;
    }

    public void setcVenCode(String cVenCode) {
        this.cVenCode = cVenCode == null ? null : cVenCode.trim();
    }

    public String getcInvCode() {
        return cInvCode;
    }

    public void setcInvCode(String cInvCode) {
        this.cInvCode = cInvCode == null ? null : cInvCode.trim();
    }

    public Short getiSuppProperty() {
        return iSuppProperty;
    }

    public void setiSuppProperty(Short iSuppProperty) {
        this.iSuppProperty = iSuppProperty;
    }

    public Float getfTotalQuota() {
        return fTotalQuota;
    }

    public void setfTotalQuota(Float fTotalQuota) {
        this.fTotalQuota = fTotalQuota;
    }

    public Float getfFinishRateUp() {
        return fFinishRateUp;
    }

    public void setfFinishRateUp(Float fFinishRateUp) {
        this.fFinishRateUp = fFinishRateUp;
    }
}