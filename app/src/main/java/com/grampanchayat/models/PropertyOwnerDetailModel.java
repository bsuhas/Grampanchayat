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
    private String gpid;
    private String psid;
    private String rid;
    private String mm;
    private String yearid;
    private String active;

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

    public String getGpid() {
        return gpid;
    }

    public void setGpid(String gpid) {
        this.gpid = gpid;
    }

    public String getPsid() {
        return psid;
    }

    public void setPsid(String psid) {
        this.psid = psid;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm;
    }

    public String getYearid() {
        return yearid;
    }

    public void setYearid(String yearid) {
        this.yearid = yearid;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
