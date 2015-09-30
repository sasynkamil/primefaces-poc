package com.tieto.energy.poc.model;

import java.util.List;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-09-10
 */
public class Errand {

    private Long errandId;
    private Long parentId;
    private int typeId;

    private List<Timestamp> timestamps;

    public Long getErrandId() {
        return errandId;
    }

    public void setErrandId(Long errandId) {
        this.errandId = errandId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public List<Timestamp> getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(List<Timestamp> timestamps) {
        this.timestamps = timestamps;
    }
}
