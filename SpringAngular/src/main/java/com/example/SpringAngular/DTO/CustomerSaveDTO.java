package com.example.SpringAngular.DTO;

import java.util.Date;

public class CustomerSaveDTO {

    private String customername;
    private String customeraddress;
    private int mobile;
    private Date customerdebut;
    private Date   customerfin;

    public CustomerSaveDTO(String customername, String customeraddress, int mobile, Date customerdebut, Date customerfin) {
        this.customername = customername;
        this.customeraddress = customeraddress;
        this.mobile = mobile;
        this.customerdebut = customerdebut;
        this.customerfin = customerfin;
    }

    public CustomerSaveDTO() {
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
    public Date getCustomerdebut() {
        return customerdebut;
    }

    public void setCustomerdebut(Date customerdebut) {
        this.customerdebut = customerdebut;
    }

    public Date getCustomerfin() {
        return customerfin;
    }

    public void setCustomerfin(Date customerfin) {
        this.customerfin = customerfin;
    }

    @Override
    public String toString() {
        return "CustomerSaveDTO{" +
                "customername='" + customername + '\'' +
                ", customeraddress='" + customeraddress + '\'' +
                ", mobile=" + mobile +
                ", customerdebut=" + customerdebut +
                ", customerfin=" +customerfin +

                '}';
    }
}