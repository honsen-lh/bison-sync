package com.leaderment.mysql_pojo;

import java.util.Date;

public class VenInvPrice {
    private Integer autoid;

    private String cvencode;

    private String cinvcode;

    private Date denabledate;

    private Date ddisabledate;

    private String cexchName;

    private Integer bpromotion;

    private String cmemo;

    private Integer isupplytype;

    private Byte btaxcost;

    private String ctermcode;

    private Double ilowerlimit;

    private Double iupperlimit;

    private Double iunitprice;

    private Double itaxrate;

    private Double itaxunitprice;

    private Integer ipriceautoid;

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

    public Date getDenabledate() {
        return denabledate;
    }

    public void setDenabledate(Date denabledate) {
        this.denabledate = denabledate;
    }

    public Date getDdisabledate() {
        return ddisabledate;
    }

    public void setDdisabledate(Date ddisabledate) {
        this.ddisabledate = ddisabledate;
    }

    public String getCexchName() {
        return cexchName;
    }

    public void setCexchName(String cexchName) {
        this.cexchName = cexchName == null ? null : cexchName.trim();
    }

    public Integer getBpromotion() {
        return bpromotion;
    }

    public void setBpromotion(Integer bpromotion) {
        this.bpromotion = bpromotion;
    }

    public String getCmemo() {
        return cmemo;
    }

    public void setCmemo(String cmemo) {
        this.cmemo = cmemo == null ? null : cmemo.trim();
    }

    public Integer getIsupplytype() {
        return isupplytype;
    }

    public void setIsupplytype(Integer isupplytype) {
        this.isupplytype = isupplytype;
    }

    public Byte getBtaxcost() {
        return btaxcost;
    }

    public void setBtaxcost(Byte btaxcost) {
        this.btaxcost = btaxcost;
    }

    public String getCtermcode() {
        return ctermcode;
    }

    public void setCtermcode(String ctermcode) {
        this.ctermcode = ctermcode == null ? null : ctermcode.trim();
    }

    public Double getIlowerlimit() {
        return ilowerlimit;
    }

    public void setIlowerlimit(Double ilowerlimit) {
        this.ilowerlimit = ilowerlimit;
    }

    public Double getIupperlimit() {
        return iupperlimit;
    }

    public void setIupperlimit(Double iupperlimit) {
        this.iupperlimit = iupperlimit;
    }

    public Double getIunitprice() {
        return iunitprice;
    }

    public void setIunitprice(Double iunitprice) {
        this.iunitprice = iunitprice;
    }

    public Double getItaxrate() {
        return itaxrate;
    }

    public void setItaxrate(Double itaxrate) {
        this.itaxrate = itaxrate;
    }

    public Double getItaxunitprice() {
        return itaxunitprice;
    }

    public void setItaxunitprice(Double itaxunitprice) {
        this.itaxunitprice = itaxunitprice;
    }

    public Integer getIpriceautoid() {
        return ipriceautoid;
    }

    public void setIpriceautoid(Integer ipriceautoid) {
        this.ipriceautoid = ipriceautoid;
    }
}