package com.tieto.energy.poc.web.controller;

import javax.ejb.Stateless;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-06-25
 */
@Stateless
public class Calculator {

    public double add(double x, double y) {
        return someMethod(x, y);
    }

    private double someMethod(double x, double y) {
        return x + y;
    }
}
