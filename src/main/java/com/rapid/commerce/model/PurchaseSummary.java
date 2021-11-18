package com.rapid.commerce.model;

import java.time.LocalDate;
import java.util.UUID;

public class PurchaseSummary {

       private UUID uuid;
       private double totalAmount;
       private LocalDate creationDate;
       private String consumerId;
       private String companyId;

    public PurchaseSummary(UUID uuid, double totalAmount, LocalDate creationDate, String consumerId, String companyId) {
        this.uuid = uuid;
        this.totalAmount = totalAmount;
        this.creationDate = creationDate;
        this.consumerId = consumerId;
        this.companyId = companyId;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
