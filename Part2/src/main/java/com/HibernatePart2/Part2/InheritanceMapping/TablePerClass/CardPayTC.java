package com.HibernatePart2.Part2.InheritanceMapping.TablePerClass;

import javax.persistence.Entity;

@Entity
public class CardPayTC extends PaymentTC {
    private String cardnumber;

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
}
