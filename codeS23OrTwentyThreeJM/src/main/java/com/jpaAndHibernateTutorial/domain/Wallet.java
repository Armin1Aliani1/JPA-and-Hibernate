package com.jpaAndHibernateTutorial.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = Wallet.TABLE_NAME)
public class Wallet {
    public static final String TABLE_NAME = "wallet";
    @Id
    @GeneratedValue
    private Long id;
    private Long totalAmount;
    private Long cashAmount;
    private Long creditAmount;

    public Wallet() {
    }

    public Wallet(Long id, Long totalAmount, Long cashAmount, Long creditAmount) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.cashAmount = cashAmount;
        this.creditAmount = creditAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Long cashAmount) {
        this.cashAmount = cashAmount;
    }

    public Long getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Long creditAmount) {
        this.creditAmount = creditAmount;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "id=" + id +
                ", totalAmount=" + totalAmount +
                ", cashAmount=" + cashAmount +
                ", creditAmount=" + creditAmount +
                '}';
    }
}
