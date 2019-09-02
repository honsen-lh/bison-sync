package com.leaderment.mysql_pojo;

import java.util.Date;

public class Supplier {
    private String cVenCode;

    private String cVenName;

    private String cVenAbbName;

    private String cVcCode;

    private String cVenAddress;

    private Date dVenDevDate;

    private String cVenEmail;

    private String cVenPerson;

    private String cVenHand;

    private String cVenHeadCode;

    private Byte bVenTax;

    private String cCreatePerson;

    private String cModifyPerson;

    private Date dModifyDate;

    private String cVenExchName;

    private String cVenPuomProtocol;

    private Float iVenTaxRate;

    private Date dVenCreateDatetime;

    private String cVenMnemCode;

    private String cVenContactCode;

    public String getcVenCode() {
        return cVenCode;
    }

    public void setcVenCode(String cVenCode) {
        this.cVenCode = cVenCode == null ? null : cVenCode.trim();
    }

    public String getcVenName() {
        return cVenName;
    }

    public void setcVenName(String cVenName) {
        this.cVenName = cVenName == null ? null : cVenName.trim();
    }

    public String getcVenAbbName() {
        return cVenAbbName;
    }

    public void setcVenAbbName(String cVenAbbName) {
        this.cVenAbbName = cVenAbbName == null ? null : cVenAbbName.trim();
    }

    public String getcVcCode() {
        return cVcCode;
    }

    public void setcVcCode(String cVcCode) {
        this.cVcCode = cVcCode == null ? null : cVcCode.trim();
    }

    public String getcVenAddress() {
        return cVenAddress;
    }

    public void setcVenAddress(String cVenAddress) {
        this.cVenAddress = cVenAddress == null ? null : cVenAddress.trim();
    }

    public Date getdVenDevDate() {
        return dVenDevDate;
    }

    public void setdVenDevDate(Date dVenDevDate) {
        this.dVenDevDate = dVenDevDate;
    }

    public String getcVenEmail() {
        return cVenEmail;
    }

    public void setcVenEmail(String cVenEmail) {
        this.cVenEmail = cVenEmail == null ? null : cVenEmail.trim();
    }

    public String getcVenPerson() {
        return cVenPerson;
    }

    public void setcVenPerson(String cVenPerson) {
        this.cVenPerson = cVenPerson == null ? null : cVenPerson.trim();
    }

    public String getcVenHand() {
        return cVenHand;
    }

    public void setcVenHand(String cVenHand) {
        this.cVenHand = cVenHand == null ? null : cVenHand.trim();
    }

    public String getcVenHeadCode() {
        return cVenHeadCode;
    }

    public void setcVenHeadCode(String cVenHeadCode) {
        this.cVenHeadCode = cVenHeadCode == null ? null : cVenHeadCode.trim();
    }

    public Byte getbVenTax() {
        return bVenTax;
    }

    public void setbVenTax(Byte bVenTax) {
        this.bVenTax = bVenTax;
    }

    public String getcCreatePerson() {
        return cCreatePerson;
    }

    public void setcCreatePerson(String cCreatePerson) {
        this.cCreatePerson = cCreatePerson == null ? null : cCreatePerson.trim();
    }

    public String getcModifyPerson() {
        return cModifyPerson;
    }

    public void setcModifyPerson(String cModifyPerson) {
        this.cModifyPerson = cModifyPerson == null ? null : cModifyPerson.trim();
    }

    public Date getdModifyDate() {
        return dModifyDate;
    }

    public void setdModifyDate(Date dModifyDate) {
        this.dModifyDate = dModifyDate;
    }

    public String getcVenExchName() {
        return cVenExchName;
    }

    public void setcVenExchName(String cVenExchName) {
        this.cVenExchName = cVenExchName == null ? null : cVenExchName.trim();
    }

    public String getcVenPuomProtocol() {
        return cVenPuomProtocol;
    }

    public void setcVenPuomProtocol(String cVenPuomProtocol) {
        this.cVenPuomProtocol = cVenPuomProtocol == null ? null : cVenPuomProtocol.trim();
    }

    public Float getiVenTaxRate() {
        return iVenTaxRate;
    }

    public void setiVenTaxRate(Float iVenTaxRate) {
        this.iVenTaxRate = iVenTaxRate;
    }

    public Date getdVenCreateDatetime() {
        return dVenCreateDatetime;
    }

    public void setdVenCreateDatetime(Date dVenCreateDatetime) {
        this.dVenCreateDatetime = dVenCreateDatetime;
    }

    public String getcVenMnemCode() {
        return cVenMnemCode;
    }

    public void setcVenMnemCode(String cVenMnemCode) {
        this.cVenMnemCode = cVenMnemCode == null ? null : cVenMnemCode.trim();
    }

    public String getcVenContactCode() {
        return cVenContactCode;
    }

    public void setcVenContactCode(String cVenContactCode) {
        this.cVenContactCode = cVenContactCode == null ? null : cVenContactCode.trim();
    }
}