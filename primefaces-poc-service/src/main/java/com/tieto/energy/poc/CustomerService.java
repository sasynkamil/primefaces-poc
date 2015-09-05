package com.tieto.energy.poc;

import com.tieto.energy.poc.model.Customer;

import java.io.Serializable;
import java.util.List;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-09-05
 */
public interface CustomerService extends Serializable {

    List<Customer> getAllCustomers();
}
