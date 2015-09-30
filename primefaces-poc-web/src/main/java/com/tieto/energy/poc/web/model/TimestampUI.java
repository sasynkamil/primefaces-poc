package com.tieto.energy.poc.web.model;

import com.tieto.energy.poc.model.Timestamp;

import java.util.Date;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-09-10
 */
public class TimestampUI {

    public enum State {
        NOT_SET,
        SET,
        CHANGED_SET,
        CHANGED_CLEARED;
    }

    private Timestamp timestamp;
    private String username;

    private State state;
    private Date date;
    private String signature;

    public TimestampUI(Timestamp timestamp, String username) {
        this.timestamp = timestamp;
        this.username = username;

        setState(timestamp.getTimestampDate() == null ? State.NOT_SET : State.SET);
        this.date = timestamp.getTimestampDate();
        this.signature = timestamp.getTimestampSignature();
    }

    public void setState(State state) {
        this.state = state;

        switch (state) {
            case NOT_SET:
            case CHANGED_CLEARED:
                this.date = null;
                this.signature = null;
                break;
            case SET:
                this.date = timestamp.getTimestampDate();
                this.signature = timestamp.getTimestampSignature();
                break;
            case CHANGED_SET:
                this.date = new Date();
                this.signature = username;
                break;
        }
    }

    public boolean isTimestampNotSet() {
        return state == State.NOT_SET && state != State.CHANGED_CLEARED;
    }

    public boolean isTimestampSet() {
        return state == State.SET && state != State.CHANGED_SET;
    }

    public boolean isTimestampChangedSet() {
        return state == State.CHANGED_SET;
    }

    public boolean isTimestampChangedCleared() {
        return state == State.CHANGED_CLEARED;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
