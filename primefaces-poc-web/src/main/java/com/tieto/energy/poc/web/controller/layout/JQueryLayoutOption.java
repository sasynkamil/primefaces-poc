package com.tieto.energy.poc.web.controller.layout;

/**
 * See http://layout.jquery-dev.com & http://www.primefaces.org/showcase-ext
 *
 * @author Kamil Sasyn (sasynkam)
 *         2015-09-05
 */
public interface JQueryLayoutOption {

    String SIZE = "size";
    String MIN_SIZE = "minSize";
    final static String MAX_SIZE = "maxSize";
    // Speed of opening/closing pane
    String FX_SPEED_OPEN = "fxSpeed_open";
    String FX_SPEED_CLOSE = "fxSpeed_close";
    // Possibility to drag resizer-bar
    String RESIZABLE = "resizable";
    // Possibility to open/close pane by hot key (ctrl+arrow)
    String ENABLE_CURSORS = "enableCursorHotkey";
    // Set pane closed
    String INIT_CLOSED = "initClosed";
    // Size of resizer-bar
    String SPACING_OPEN = "spacing_open";
    String SPACING_CLOSED = "spacing_closed";
    // ??
    String SLIDABLE = "slidable";
}
