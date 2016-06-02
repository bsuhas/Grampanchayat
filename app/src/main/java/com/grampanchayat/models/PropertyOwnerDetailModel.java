package com.grampanchayat.models;

/**
 * Created by SUHAS on 02/06/2016.
 */
public class PropertyOwnerDetailModel {

    private String khatedar;
    private String name;
    private String addr;
    private String wifeName;
    private String mobileNum;

    public PropertyOwnerDetailModel() {
    }

    public PropertyOwnerDetailModel(String khatedar, String name, String addr, String wifeName, String mobileNum) {
        this.khatedar = khatedar;
        this.name = name;
        this.addr = addr;
        this.wifeName = wifeName;
        this.mobileNum = mobileNum;
    }

    public String getKhatedar() {
        return khatedar;
    }

    public void setKhatedar(String khatedar) {
        this.khatedar = khatedar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
}
