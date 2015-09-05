package com.tieto.energy.poc.web.controller;

import com.tieto.energy.poc.web.controller.layout.NewWindowController;
import org.omnifaces.cdi.ViewScoped;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-09-05
 */
@Named
@ViewScoped
public class PreviewController implements Serializable {

    @Inject
    private NewWindowController newWindowController;

    private String errandId;
    private String assetId;

    @PostConstruct
    public void init() {
        this.errandId = newWindowController.getErrandId();
        this.assetId = newWindowController.getAssetId();
    }

    public String getErrandId() {
        return errandId;
    }

    public void setErrandId(String errandId) {
        this.errandId = errandId;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }
}
