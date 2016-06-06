package com.grampanchayat.models;

/**
 * Created by SUHAS on 05/06/2016.
 */
public class FinancialYearMasterModel {

    public String yearid;
    public String startDate;
    public String enddate;
    public boolean isCurrent;
    public boolean isLastYear;

    public String getYearid() {
        return yearid;
    }

    public void setYearid(String yearid) {
        this.yearid = yearid;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public boolean isCurrent() {
        return isCurrent;
    }

    public void setCurrent(boolean current) {
        isCurrent = current;
    }

    public boolean isLastYear() {
        return isLastYear;
    }

    public void setLastYear(boolean lastYear) {
        isLastYear = lastYear;
    }
}
