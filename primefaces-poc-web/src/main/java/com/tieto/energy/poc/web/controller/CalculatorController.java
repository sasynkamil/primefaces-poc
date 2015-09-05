package com.tieto.energy.poc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-06-25
 */
@Named
@RequestScoped
public class CalculatorController implements Serializable {

    static final Logger LOG = LoggerFactory.getLogger(CalculatorController.class);

    @Inject
    Calculator calculator;

    private double x;
    private double y;
    private double result;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getResult() {
        return result;
    }

    public void add() {
        LOG.trace("Some trace loooooooooooooooooog");
        LOG.debug("Some debug loooooooooooooooooog");
        LOG.info("Some info loooooooooooooooooog");


        result = calculator.add(x, y);
    }
}
