package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;

public class Item {

    private String code;
    private String providerCode;
    private int quantity;
    private BigDecimal unitCost;

    public Item(String code, String providerCode, BigDecimal unitCost, int quantity) {
        this.code=code;
        this.providerCode=providerCode;
        this.unitCost=unitCost;
        this.quantity=quantity;
    }

    public Item() {

    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }
}
