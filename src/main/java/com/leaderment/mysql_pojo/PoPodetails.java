package com.leaderment.mysql_pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PoPodetails {
    private Integer poPodetailsId;

    private String cPoId;
    
    private String poId;

    private String cInvCode;

    private BigDecimal iQuantity;

    private BigDecimal iUnitPrice;

    private BigDecimal iMoney;

    private BigDecimal iTax;

    private BigDecimal iSum;

    private BigDecimal iNatUnitPrice;

    private BigDecimal iNatMoney;

    private BigDecimal iNatTax;

    private BigDecimal iNatSum;

    private Date dArriveDate;

    private BigDecimal iInvQty;

    private BigDecimal iInvMoney;

    private BigDecimal iNatInvMoney;

    private BigDecimal iPerTaxRate;

    private String cDefine24;

    private BigDecimal iTaxPrice;

    private BigDecimal iArrMoney;

    private BigDecimal iNatArrMoney;

    private BigDecimal fPoValidQuantity;

    private BigDecimal fPoValidNum;

    private BigDecimal fPoArrQuantity;

    private Integer iVouchrowNo;

    private BigDecimal freceivedQty;

    private String cBsysbarCode;

    public Integer getPoPodetailsId() {
		return poPodetailsId;
	}

	public void setPoPodetailsId(Integer poPodetailsId) {
		this.poPodetailsId = poPodetailsId;
	}

	public String getcPoId() {
        return cPoId;
    }

    public void setcPoId(String cPoId) {
        this.cPoId = cPoId == null ? null : cPoId.trim();
    }
    
    public String getPoId() {
		return poId;
	}

	public void setPoId(String poId) {
		this.poId = poId;
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

    public BigDecimal getiUnitPrice() {
        return iUnitPrice;
    }

    public void setiUnitPrice(BigDecimal iUnitPrice) {
        this.iUnitPrice = iUnitPrice;
    }

    public BigDecimal getiMoney() {
        return iMoney;
    }

    public void setiMoney(BigDecimal iMoney) {
        this.iMoney = iMoney;
    }

    public BigDecimal getiTax() {
        return iTax;
    }

    public void setiTax(BigDecimal iTax) {
        this.iTax = iTax;
    }

    public BigDecimal getiSum() {
        return iSum;
    }

    public void setiSum(BigDecimal iSum) {
        this.iSum = iSum;
    }

    public BigDecimal getiNatUnitPrice() {
        return iNatUnitPrice;
    }

    public void setiNatUnitPrice(BigDecimal iNatUnitPrice) {
        this.iNatUnitPrice = iNatUnitPrice;
    }

    public BigDecimal getiNatMoney() {
        return iNatMoney;
    }

    public void setiNatMoney(BigDecimal iNatMoney) {
        this.iNatMoney = iNatMoney;
    }

    public BigDecimal getiNatTax() {
        return iNatTax;
    }

    public void setiNatTax(BigDecimal iNatTax) {
        this.iNatTax = iNatTax;
    }

    public BigDecimal getiNatSum() {
        return iNatSum;
    }

    public void setiNatSum(BigDecimal iNatSum) {
        this.iNatSum = iNatSum;
    }

    public Date getdArriveDate() {
        return dArriveDate;
    }

    public void setdArriveDate(Date dArriveDate) {
        this.dArriveDate = dArriveDate;
    }

    public BigDecimal getiInvQty() {
        return iInvQty;
    }

    public void setiInvQty(BigDecimal iInvQty) {
        this.iInvQty = iInvQty;
    }

    public BigDecimal getiInvMoney() {
        return iInvMoney;
    }

    public void setiInvMoney(BigDecimal iInvMoney) {
        this.iInvMoney = iInvMoney;
    }

    public BigDecimal getiNatInvMoney() {
        return iNatInvMoney;
    }

    public void setiNatInvMoney(BigDecimal iNatInvMoney) {
        this.iNatInvMoney = iNatInvMoney;
    }

    public BigDecimal getiPerTaxRate() {
        return iPerTaxRate;
    }

    public void setiPerTaxRate(BigDecimal iPerTaxRate) {
        this.iPerTaxRate = iPerTaxRate;
    }

    public String getcDefine24() {
        return cDefine24;
    }

    public void setcDefine24(String cDefine24) {
        this.cDefine24 = cDefine24 == null ? null : cDefine24.trim();
    }

    public BigDecimal getiTaxPrice() {
        return iTaxPrice;
    }

    public void setiTaxPrice(BigDecimal iTaxPrice) {
        this.iTaxPrice = iTaxPrice;
    }

    public BigDecimal getiArrMoney() {
        return iArrMoney;
    }

    public void setiArrMoney(BigDecimal iArrMoney) {
        this.iArrMoney = iArrMoney;
    }

    public BigDecimal getiNatArrMoney() {
        return iNatArrMoney;
    }

    public void setiNatArrMoney(BigDecimal iNatArrMoney) {
        this.iNatArrMoney = iNatArrMoney;
    }

    public BigDecimal getfPoValidQuantity() {
        return fPoValidQuantity;
    }

    public void setfPoValidQuantity(BigDecimal fPoValidQuantity) {
        this.fPoValidQuantity = fPoValidQuantity;
    }

    public BigDecimal getfPoValidNum() {
        return fPoValidNum;
    }

    public void setfPoValidNum(BigDecimal fPoValidNum) {
        this.fPoValidNum = fPoValidNum;
    }

    public BigDecimal getfPoArrQuantity() {
        return fPoArrQuantity;
    }

    public void setfPoArrQuantity(BigDecimal fPoArrQuantity) {
        this.fPoArrQuantity = fPoArrQuantity;
    }

    public Integer getiVouchrowNo() {
        return iVouchrowNo;
    }

    public void setiVouchrowNo(Integer iVouchrowNo) {
        this.iVouchrowNo = iVouchrowNo;
    }

    public BigDecimal getFreceivedQty() {
        return freceivedQty;
    }

    public void setFreceivedQty(BigDecimal freceivedQty) {
        this.freceivedQty = freceivedQty;
    }

    public String getcBsysbarCode() {
        return cBsysbarCode;
    }

    public void setcBsysbarCode(String cBsysbarCode) {
        this.cBsysbarCode = cBsysbarCode == null ? null : cBsysbarCode.trim();
    }
}