package com.leaderment.sqlserver_pojo;

import java.util.Date;

public class InventoryVO {
    private String cinvcode;

    private String cinvaddcode;

    private String cinvname;

    private String cinvstd;

    private String cinvccode;

    private String cvencode;

    private String creplaceitem;

    private String cposition;

    private Boolean bsale;

    private Boolean bpurchase;

    private Boolean bself;

    private Boolean bcomsume;

    private Boolean bproducing;

    private Boolean bservice;

    private Boolean baccessary;

    private Double itaxrate;

    private Date dsdate;

    private Date dedate;

    private String cinvdefine1;

    private Integer iId;

    private String ccreateperson;

    private String cmodifyperson;

    private Date dmodifydate;

    private String cvaluetype;

    private String cplanmethod;

    private Boolean bmps;

    private Boolean brop;

    private Boolean breplan;

    private String csrpolicy;

    private Boolean bbillunite;

    private String cshopunit;

    private Double fconvertrate;

    private Boolean binvmodel;

    private Boolean bkccutmantissa;

    private Boolean breceiptbydt;

    private Double iimptaxrate;

    private Short iplandefault;

    private Integer iallocateprintdgt;

    private Boolean bcheckbatch;

    private Boolean bmngoldpart;

    public String getCinvcode() {
        return cinvcode;
    }

    public void setCinvcode(String cinvcode) {
        this.cinvcode = cinvcode == null ? null : cinvcode.trim();
    }

    public String getCinvaddcode() {
        return cinvaddcode;
    }

    public void setCinvaddcode(String cinvaddcode) {
        this.cinvaddcode = cinvaddcode == null ? null : cinvaddcode.trim();
    }

    public String getCinvname() {
        return cinvname;
    }

    public void setCinvname(String cinvname) {
        this.cinvname = cinvname == null ? null : cinvname.trim();
    }

    public String getCinvstd() {
        return cinvstd;
    }

    public void setCinvstd(String cinvstd) {
        this.cinvstd = cinvstd == null ? null : cinvstd.trim();
    }

    public String getCinvccode() {
        return cinvccode;
    }

    public void setCinvccode(String cinvccode) {
        this.cinvccode = cinvccode == null ? null : cinvccode.trim();
    }

    public String getCvencode() {
        return cvencode;
    }

    public void setCvencode(String cvencode) {
        this.cvencode = cvencode == null ? null : cvencode.trim();
    }

    public String getCreplaceitem() {
        return creplaceitem;
    }

    public void setCreplaceitem(String creplaceitem) {
        this.creplaceitem = creplaceitem == null ? null : creplaceitem.trim();
    }

    public String getCposition() {
        return cposition;
    }

    public void setCposition(String cposition) {
        this.cposition = cposition == null ? null : cposition.trim();
    }

    public Boolean getBsale() {
        return bsale;
    }

    public void setBsale(Boolean bsale) {
        this.bsale = bsale;
    }

    public Boolean getBpurchase() {
        return bpurchase;
    }

    public void setBpurchase(Boolean bpurchase) {
        this.bpurchase = bpurchase;
    }

    public Boolean getBself() {
        return bself;
    }

    public void setBself(Boolean bself) {
        this.bself = bself;
    }

    public Boolean getBcomsume() {
        return bcomsume;
    }

    public void setBcomsume(Boolean bcomsume) {
        this.bcomsume = bcomsume;
    }

    public Boolean getBproducing() {
        return bproducing;
    }

    public void setBproducing(Boolean bproducing) {
        this.bproducing = bproducing;
    }

    public Boolean getBservice() {
        return bservice;
    }

    public void setBservice(Boolean bservice) {
        this.bservice = bservice;
    }

    public Boolean getBaccessary() {
        return baccessary;
    }

    public void setBaccessary(Boolean baccessary) {
        this.baccessary = baccessary;
    }

    public Double getItaxrate() {
        return itaxrate;
    }

    public void setItaxrate(Double itaxrate) {
        this.itaxrate = itaxrate;
    }

    public Date getDsdate() {
        return dsdate;
    }

    public void setDsdate(Date dsdate) {
        this.dsdate = dsdate;
    }

    public Date getDedate() {
        return dedate;
    }

    public void setDedate(Date dedate) {
        this.dedate = dedate;
    }

    public String getCinvdefine1() {
        return cinvdefine1;
    }

    public void setCinvdefine1(String cinvdefine1) {
        this.cinvdefine1 = cinvdefine1 == null ? null : cinvdefine1.trim();
    }

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public String getCcreateperson() {
        return ccreateperson;
    }

    public void setCcreateperson(String ccreateperson) {
        this.ccreateperson = ccreateperson == null ? null : ccreateperson.trim();
    }

    public String getCmodifyperson() {
        return cmodifyperson;
    }

    public void setCmodifyperson(String cmodifyperson) {
        this.cmodifyperson = cmodifyperson == null ? null : cmodifyperson.trim();
    }

    public Date getDmodifydate() {
        return dmodifydate;
    }

    public void setDmodifydate(Date dmodifydate) {
        this.dmodifydate = dmodifydate;
    }

    public String getCvaluetype() {
        return cvaluetype;
    }

    public void setCvaluetype(String cvaluetype) {
        this.cvaluetype = cvaluetype == null ? null : cvaluetype.trim();
    }

    public String getCplanmethod() {
        return cplanmethod;
    }

    public void setCplanmethod(String cplanmethod) {
        this.cplanmethod = cplanmethod == null ? null : cplanmethod.trim();
    }

    public Boolean getBmps() {
        return bmps;
    }

    public void setBmps(Boolean bmps) {
        this.bmps = bmps;
    }

    public Boolean getBrop() {
        return brop;
    }

    public void setBrop(Boolean brop) {
        this.brop = brop;
    }

    public Boolean getBreplan() {
        return breplan;
    }

    public void setBreplan(Boolean breplan) {
        this.breplan = breplan;
    }

    public String getCsrpolicy() {
        return csrpolicy;
    }

    public void setCsrpolicy(String csrpolicy) {
        this.csrpolicy = csrpolicy == null ? null : csrpolicy.trim();
    }

    public Boolean getBbillunite() {
        return bbillunite;
    }

    public void setBbillunite(Boolean bbillunite) {
        this.bbillunite = bbillunite;
    }

    public String getCshopunit() {
        return cshopunit;
    }

    public void setCshopunit(String cshopunit) {
        this.cshopunit = cshopunit == null ? null : cshopunit.trim();
    }

    public Double getFconvertrate() {
        return fconvertrate;
    }

    public void setFconvertrate(Double fconvertrate) {
        this.fconvertrate = fconvertrate;
    }

    public Boolean getBinvmodel() {
        return binvmodel;
    }

    public void setBinvmodel(Boolean binvmodel) {
        this.binvmodel = binvmodel;
    }

    public Boolean getBkccutmantissa() {
        return bkccutmantissa;
    }

    public void setBkccutmantissa(Boolean bkccutmantissa) {
        this.bkccutmantissa = bkccutmantissa;
    }

    public Boolean getBreceiptbydt() {
        return breceiptbydt;
    }

    public void setBreceiptbydt(Boolean breceiptbydt) {
        this.breceiptbydt = breceiptbydt;
    }

    public Double getIimptaxrate() {
        return iimptaxrate;
    }

    public void setIimptaxrate(Double iimptaxrate) {
        this.iimptaxrate = iimptaxrate;
    }

    public Short getIplandefault() {
        return iplandefault;
    }

    public void setIplandefault(Short iplandefault) {
        this.iplandefault = iplandefault;
    }

    public Integer getIallocateprintdgt() {
        return iallocateprintdgt;
    }

    public void setIallocateprintdgt(Integer iallocateprintdgt) {
        this.iallocateprintdgt = iallocateprintdgt;
    }

    public Boolean getBcheckbatch() {
        return bcheckbatch;
    }

    public void setBcheckbatch(Boolean bcheckbatch) {
        this.bcheckbatch = bcheckbatch;
    }

    public Boolean getBmngoldpart() {
        return bmngoldpart;
    }

    public void setBmngoldpart(Boolean bmngoldpart) {
        this.bmngoldpart = bmngoldpart;
    }

    @Override
    public String toString() {
        return "InventoryVO{" +
                "cinvcode='" + cinvcode + '\'' +
                ", cinvaddcode='" + cinvaddcode + '\'' +
                ", cinvname='" + cinvname + '\'' +
                ", cinvstd='" + cinvstd + '\'' +
                ", cinvccode='" + cinvccode + '\'' +
                ", cvencode='" + cvencode + '\'' +
                ", creplaceitem='" + creplaceitem + '\'' +
                ", cposition='" + cposition + '\'' +
                ", bsale=" + bsale +
                ", bpurchase=" + bpurchase +
                ", bself=" + bself +
                ", bcomsume=" + bcomsume +
                ", bproducing=" + bproducing +
                ", bservice=" + bservice +
                ", baccessary=" + baccessary +
                ", itaxrate=" + itaxrate +
                ", dsdate=" + dsdate +
                ", dedate=" + dedate +
                ", cinvdefine1='" + cinvdefine1 + '\'' +
                ", iId=" + iId +
                ", ccreateperson='" + ccreateperson + '\'' +
                ", cmodifyperson='" + cmodifyperson + '\'' +
                ", dmodifydate=" + dmodifydate +
                ", cvaluetype='" + cvaluetype + '\'' +
                ", cplanmethod='" + cplanmethod + '\'' +
                ", bmps=" + bmps +
                ", brop=" + brop +
                ", breplan=" + breplan +
                ", csrpolicy='" + csrpolicy + '\'' +
                ", bbillunite=" + bbillunite +
                ", cshopunit='" + cshopunit + '\'' +
                ", fconvertrate=" + fconvertrate +
                ", binvmodel=" + binvmodel +
                ", bkccutmantissa=" + bkccutmantissa +
                ", breceiptbydt=" + breceiptbydt +
                ", iimptaxrate=" + iimptaxrate +
                ", iplandefault=" + iplandefault +
                ", iallocateprintdgt=" + iallocateprintdgt +
                ", bcheckbatch=" + bcheckbatch +
                ", bmngoldpart=" + bmngoldpart +
                '}';
    }
}