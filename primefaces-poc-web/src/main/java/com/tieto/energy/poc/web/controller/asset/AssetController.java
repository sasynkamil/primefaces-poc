package com.tieto.energy.poc.web.controller.asset;

import com.tieto.energy.poc.CustomerService;
import com.tieto.energy.poc.model.Customer;
import com.tieto.energy.poc.web.controller.layout.NewWindowController;
import org.omnifaces.cdi.ViewScoped;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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
public class AssetController implements Serializable {

    @Inject
    private CustomerService customerService;
    @Inject
    private NewWindowController newWindowController;

    private List<Customer> customers;

    private String assetId;
    private int counter = 0;

    @PostConstruct
    public void init() {
        System.out.println("Init AssetController");

        customers = customerService.getAllCustomers();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy AssetController");
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public void actionAdd() {
        assetId = "asset " + (++counter);
        newWindowController.setAssetId(assetId);
    }
}
