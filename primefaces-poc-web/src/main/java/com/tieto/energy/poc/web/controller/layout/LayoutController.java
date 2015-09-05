package com.tieto.energy.poc.web.controller.layout;

import org.primefaces.extensions.model.layout.LayoutOptions;

import javax.annotation.PostConstruct;
import org.omnifaces.cdi.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-07-25
 */
@Named
@ViewScoped
public class LayoutController implements Serializable {

    private LayoutOptions layoutOptions;
    private Layout layout;

    @PostConstruct
    public void init() {
        final String viewId = FacesContext.getCurrentInstance().getViewRoot().getViewId();
        System.out.println("viewId: [" + viewId + "]");
        layout = Layout.getLayout(viewId);
    }

    public LayoutOptions getLayoutOptions() {
        switch (layout) {
            case ERRAND:
                initErrandTemplateLayout();
                break;
            case ASSET:
                initAssetTemplateLayout();
                break;
        }
        return layoutOptions;
    }

    public void setLayoutOptions(LayoutOptions layoutOptions) {
        this.layoutOptions = layoutOptions;
    }

    private void setDefaultOptions(LayoutOptions pane) {
        pane.addOption(JQueryLayoutOption.ENABLE_CURSORS, false);
        pane.addOption(JQueryLayoutOption.FX_SPEED_OPEN, 100);
        pane.addOption(JQueryLayoutOption.FX_SPEED_CLOSE, 100);
        pane.addOption(JQueryLayoutOption.RESIZABLE, false);
    }

    private LayoutOptions initCommonTemplateLayout() {
        layoutOptions = new LayoutOptions();

        LayoutOptions north = new LayoutOptions();
        layoutOptions.setNorthOptions(north);
        setDefaultOptions(north);
        north.addOption(JQueryLayoutOption.SIZE, 70);

        LayoutOptions center = new LayoutOptions();
        layoutOptions.setCenterOptions(center);
        setDefaultOptions(center);

        LayoutOptions centerChild = new LayoutOptions();
        center.setChildOptions(centerChild);
        setDefaultOptions(centerChild);

        LayoutOptions centerNorth = new LayoutOptions();
        centerChild.setNorthOptions(centerNorth);
        setDefaultOptions(centerNorth);
        centerNorth.addOption(JQueryLayoutOption.SIZE, 50);

        LayoutOptions centerCenter = new LayoutOptions();
        centerChild.setCenterOptions(centerCenter);
        setDefaultOptions(centerCenter);

        LayoutOptions centerCenterChild = new LayoutOptions();
        centerCenter.setChildOptions(centerCenterChild);

        return centerCenterChild;
    }

    private void initErrandTemplateLayout() {
        LayoutOptions commonLayout = initCommonTemplateLayout();

        // LEFT MENU
        LayoutOptions leftMenu = new LayoutOptions();
        commonLayout.setWestOptions(leftMenu);
        setDefaultOptions(leftMenu);
        leftMenu.addOption(JQueryLayoutOption.MIN_SIZE, 400);

        // RIGHT MENU
        LayoutOptions rightMenu = new LayoutOptions();
        commonLayout.setEastOptions(rightMenu);
        setDefaultOptions(rightMenu);
        rightMenu.addOption(JQueryLayoutOption.MIN_SIZE, 160);
//        rightMenu.addOption(INIT_CLOSED, true);

        LayoutOptions center = new LayoutOptions();
        commonLayout.setCenterOptions(center);
        setDefaultOptions(center);

//        LayoutOptions centerChild = new LayoutOptions();
//        center.setChildOptions(centerChild);


        // TIMESTAMP MENU

        // BOTTOM CONTROL PANEL
    }

    private void initAssetTemplateLayout() {
        LayoutOptions commonLayout = initCommonTemplateLayout();

        // TOP FORM
        LayoutOptions topForm = new LayoutOptions();
        commonLayout.setNorthOptions(topForm);
        setDefaultOptions(topForm);
        topForm.addOption(JQueryLayoutOption.MIN_SIZE, 250);

        LayoutOptions center = new LayoutOptions();
        commonLayout.setCenterOptions(center);
        setDefaultOptions(center);
    }
}
