package com.HibernatePart2.Part2.InheritanceMapping.TablePerClass;

import javax.persistence.Entity;

@Entity
public class CheckPayTC extends PaymentTC {
    private String checknumber;

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber;
    }
}
