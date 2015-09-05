package com.tieto.energy.poc.web.controller;

import javax.annotation.PostConstruct;
import org.omnifaces.cdi.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-06-10
 */
@Named("someController")
@ViewScoped
public class SomeController implements Serializable {

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    private int someValue = 0;
    private boolean editable = false;

    public int getSomeValue() {
        return someValue;
    }

    public void setSomeValue(int someValue) {
        this.someValue = someValue;
    }

    public void actionIncreaseValue() {
        someValue = ++someValue;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public void actionEditableSwitch() {
        editable = !editable;
    }

    public void aaa() {
        System.out.println("aaaaaaaaaaaaaa");
        System.out.println("aaaaaaaaaaaaaa");
        System.out.println("aaaaaaaaaaaaaa");
        System.out.println("aaaaaaaaaaaaaa");
        System.out.println("aaaaaaaaaaaaaa");
        System.out.println("aaaaaaaaaaaaaa");
    }
}
