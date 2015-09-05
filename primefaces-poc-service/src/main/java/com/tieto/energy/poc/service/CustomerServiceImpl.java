package com.tieto.energy.poc.service;

import com.tieto.energy.poc.CustomerService;
import com.tieto.energy.poc.model.Customer;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-07-26
 */
@Named
public class CustomerServiceImpl implements CustomerService {

    private static final String[] first = {"John", "Lukas", "Helena", "Georg", "Evelin", "Stephani", "Michael", "Mia", "Olivia"};
    private static final String[] last = {"Washington", "Black", "Newton", "Blair", "Queen", "Davidson", "House", "Moore", "Nelson"};

    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<Customer>();

        Random random = new Random();

        for (int i = 1; i <= 1000; i++) {
            Customer customer = new Customer();
            customer.setId((long) i);
            customer.setFirstName(first[random.nextInt(first.length)]);
            customer.setSurname(last[random.nextInt(last.length)]);
            customer.setBirthDate(new Date());
            customers.add(customer);
        }

        return customers;
    }
}
