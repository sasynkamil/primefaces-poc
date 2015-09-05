package com.tieto.energy.poc.web.controller.layout;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-09-05
 */
@Named
@SessionScoped
public class NewWindowController implements Serializable {

    private String errandId;
    private String assetId;

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getErrandId() {
        return errandId;
    }

    public void setErrandId(String errandId) {
        this.errandId = errandId;
    }
}
