package com.klusact.house2house.model;

/**
 * Created by klusact on 15.10.2016.
 */

public class Territory {
    private String address;
    private String number;

    public Territory(String address, String number) {
        this.address = address;
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
