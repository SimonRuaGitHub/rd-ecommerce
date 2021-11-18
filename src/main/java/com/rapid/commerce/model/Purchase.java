package com.rapid.commerce.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class Purchase {

       private BigInteger id;
       private String productId;
       private UUID summaryUUID;
       private int quantity;
       private double valuePerUnit;

    public Purchase(BigInteger id, String productId, UUID summaryUUID, int quantity, double valuePerUnit) {
        this.id = id;
        this.productId = productId;
        this.summaryUUID = summaryUUID;
        this.quantity = quantity;
        this.valuePerUnit = valuePerUnit;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public UUID getSummaryUUID() {
        return summaryUUID;
    }

    public void setSummaryUUID(UUID summaryUUID) {
        this.summaryUUID = summaryUUID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getValuePerUnit() {
        return valuePerUnit;
    }

    public void setValuePerUnit(double valuePerUnit) {
        this.valuePerUnit = valuePerUnit;
    }
}
