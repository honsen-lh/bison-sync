package com.leaderment.mysql_pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Rdrecords09 {
    private Long autoId;

    private Long id;

    private String cInvCode;

    private BigDecimal iQuantity;

    private BigDecimal iUnitCost;

    private BigDecimal iPrice;

    private String cBatch;

    private Long iTrIds;

    private String cDefine23;

    private String cDefine24;

    private BigDecimal iNquantity;

    private String cBaccounter;

    private Date dbKeepDate;

    private Boolean bCosting;

    private Integer iRowNo;

    private Integer iGroupNo;

    private String cBsysbarCode;

    public Long getAutoId() {
        return autoId;
    }

    public void setAutoId(Long autoId) {
        this.autoId = autoId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getcInvCode() {
        return cInvCode;
    }

    public void setcInvCode(String cInvCode) {
        this.cInvCode = cInvCode == null ? null : cInvCode.trim();
    }

    public BigDecimal getiQuantity() {
        return iQuantity;
    }

    public void setiQuantity(BigDecimal iQuantity) {
        this.iQuantity = iQuantity;
    }

    public BigDecimal getiUnitCost() {
        return iUnitCost;
    }

    public void setiUnitCost(BigDecimal iUnitCost) {
        this.iUnitCost = iUnitCost;
    }

    public BigDecimal getiPrice() {
        return iPrice;
    }

    public void setiPrice(BigDecimal iPrice) {
        this.iPrice = iPrice;
    }

    public String getcBatch() {
        return cBatch;
    }

    public void setcBatch(String cBatch) {
        this.cBatch = cBatch == null ? null : cBatch.trim();
    }

    public Long getiTrIds() {
        return iTrIds;
    }

    public void setiTrIds(Long iTrIds) {
        this.iTrIds = iTrIds;
    }

    public String getcDefine23() {
        return cDefine23;
    }

    public void setcDefine23(String cDefine23) {
        this.cDefine23 = cDefine23 == null ? null : cDefine23.trim();
    }

    public String getcDefine24() {
        return cDefine24;
    }

    public void setcDefine24(String cDefine24) {
        this.cDefine24 = cDefine24 == null ? null : cDefine24.trim();
    }

    public BigDecimal getiNquantity() {
        return iNquantity;
    }

    public void setiNquantity(BigDecimal iNquantity) {
        this.iNquantity = iNquantity;
    }

    public String getcBaccounter() {
        return cBaccounter;
    }

    public void setcBaccounter(String cBaccounter) {
        this.cBaccounter = cBaccounter == null ? null : cBaccounter.trim();
    }

    public Date getDbKeepDate() {
        return dbKeepDate;
    }

    public void setDbKeepDate(Date dbKeepDate) {
        this.dbKeepDate = dbKeepDate;
    }

    public Boolean getbCosting() {
        return bCosting;
    }

    public void setbCosting(Boolean bCosting) {
        this.bCosting = bCosting;
    }

    public Integer getiRowNo() {
        return iRowNo;
    }

    public void setiRowNo(Integer iRowNo) {
        this.iRowNo = iRowNo;
    }

    public Integer getiGroupNo() {
        return iGroupNo;
    }

    public void setiGroupNo(Integer iGroupNo) {
        this.iGroupNo = iGroupNo;
    }

    public String getcBsysbarCode() {
        return cBsysbarCode;
    }

    public void setcBsysbarCode(String cBsysbarCode) {
        this.cBsysbarCode = cBsysbarCode == null ? null : cBsysbarCode.trim();
    }
}