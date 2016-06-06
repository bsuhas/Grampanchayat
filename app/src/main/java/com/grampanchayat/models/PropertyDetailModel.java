package com.grampanchayat.models;

import android.widget.TextView;

/**
 * @ Firstcry
 * Created by suhasbachewar on 2/6/16.
 */
public class PropertyDetailModel {

    private String malmataNum;
    private String homeType;
    private String homeLength;
    private String homeWidth;
    private String homeArea;
    private String address;
    private String wardName;
    private String business;
    private String ownerName;
    private String yearRent;
    private String malmataDetails;
    private String homeNum;
    private String srNum;
    private String anukrmank;
    private String bandhkam;
    private String buildYear;
    private String useFor;
    private String yearid;
    private String active;
    private String gpid;
    private String psid;
    private String rid;

    public PropertyDetailModel() {
    }

    public PropertyDetailModel(String title, String genre, String year) {
        this.malmataNum = title;
        this.homeType = genre;
        this.homeLength = year;
    }

    public String getMalmataNum() {
        return malmataNum;
    }

    public void setMalmataNum(String malmataNum) {
        this.malmataNum = malmataNum;
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public String getHomeLength() {
        return homeLength;
    }

    public void setHomeLength(String homeLength) {
        this.homeLength = homeLength;
    }

    public String getHomeWidth() {
        return homeWidth;
    }

    public void setHomeWidth(String homeWidth) {
        this.homeWidth = homeWidth;
    }

    public String getHomeArea() {
        return homeArea;
    }

    public void setHomeArea(String homeArea) {
        this.homeArea = homeArea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getYearRent() {
        return yearRent;
    }

    public void setYearRent(String yearRent) {
        this.yearRent = yearRent;
    }

    public String getMalmataDetails() {
        return malmataDetails;
    }

    public void setMalmataDetails(String malmataDetails) {
        this.malmataDetails = malmataDetails;
    }

    public String getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(String homeNum) {
        this.homeNum = homeNum;
    }

    public String getSrNum() {
        return srNum;
    }

    public void setSrNum(String srNum) {
        this.srNum = srNum;
    }

    public String getAnukrmank() {
        return anukrmank;
    }

    public void setAnukrmank(String anukrmank) {
        this.anukrmank = anukrmank;
    }

    public String getBandhkam() {
        return bandhkam;
    }

    public void setBandhkam(String bandhkam) {
        this.bandhkam = bandhkam;
    }

    public String getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(String buildYear) {
        this.buildYear = buildYear;
    }

    public String getUseFor() {
        return useFor;
    }

    public void setUseFor(String useFor) {
        this.useFor = useFor;
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
}
