package com.tieto.energy.poc.web.controller;

import com.tieto.energy.poc.CustomerService;
import org.omnifaces.cdi.ViewScoped;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-06-14
 */
@Named
@ViewScoped
public class CustomerController implements Serializable {

    @Inject
    private CustomerService customerService;

    // tag vs. component
    private boolean show;

    public void actionSwitchShow() {
        show = !show;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }
}
