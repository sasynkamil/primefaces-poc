package com.tieto.energy.poc.model;

import java.util.Date;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-09-10
 */
public class Timestamp {

    private Long timestampId;
    private Long errandId;
    private int timestampTypeId;
    private String timestampSignature;
    private Date timestampDate;

    public Long getTimestampId() {
        return timestampId;
    }

    public void setTimestampId(Long timestampId) {
        this.timestampId = timestampId;
    }

    public Long getErrandId() {
        return errandId;
    }

    public void setErrandId(Long errandId) {
        this.errandId = errandId;
    }

    public int getTimestampTypeId() {
        return timestampTypeId;
    }

    public void setTimestampTypeId(int timestampTypeId) {
        this.timestampTypeId = timestampTypeId;
    }

    public String getTimestampSignature() {
        return timestampSignature;
    }

    public void setTimestampSignature(String timestampSignature) {
        this.timestampSignature = timestampSignature;
    }

    public Date getTimestampDate() {
        return timestampDate;
    }

    public void setTimestampDate(Date timestampDate) {
        this.timestampDate = timestampDate;
    }
}
