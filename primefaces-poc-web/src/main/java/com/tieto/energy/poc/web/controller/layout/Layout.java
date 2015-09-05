package com.tieto.energy.poc.web.controller.layout;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-09-05
 */
public enum Layout {

    ERRAND("/errand.xhtml"),
    ASSET("/asset.xhtml");

    private static final Map<String, Layout> LAYOUT_MAP = new HashMap<String, Layout>();
    private final String viewId;

    static {
        for (Layout layout : EnumSet.allOf(Layout.class)) {
            LAYOUT_MAP.put(layout.getViewId(), layout);
        }
    }

    Layout(String viewId) {
        this.viewId = viewId;
    }

    public String getViewId() {
        return viewId;
    }

    public static Layout getLayout(final String viewId) {
        return LAYOUT_MAP.get(viewId);
    }
}
