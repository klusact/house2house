package com.klusact.house2house.model;

/**
 * Created by klaus on 15.10.2016.
 */

public class Territory {
    private String address;
    private Integer number;

    public Territory(String address, Integer number) {
        this.address = address;
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
