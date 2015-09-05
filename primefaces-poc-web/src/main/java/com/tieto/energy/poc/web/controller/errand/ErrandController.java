package com.tieto.energy.poc.web.controller.errand;

import com.tieto.energy.poc.CustomerService;
import com.tieto.energy.poc.model.Customer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.tieto.energy.poc.web.controller.layout.NewWindowController;
import org.omnifaces.cdi.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-09-05
 */
@Named
@ViewScoped
public class ErrandController implements Serializable {

    @Inject
    private CustomerService customerService;
    @Inject
    private NewWindowController newWindowController;

    private List<Customer> customers;

    private String errandId;
    private int counter = 0;

    @PostConstruct
    public void init() {
        System.out.println("Init ErrandController");

        customers = customerService.getAllCustomers();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy ErrandController");
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public String getErrandId() {
        return errandId;
    }

    public void setErrandId(String errandId) {
        this.errandId = errandId;
    }

    public void actionAdd() {
        errandId = "errand " + (++counter);
        newWindowController.setErrandId(errandId);
    }
}
