package com.example.microspring.service;

import com.example.microspring.dto.Customer;

import java.util.List;
import java.util.UUID;

/**
 * @Author: Jet Ma
 * @Created: 5/11/2023
 */
public interface CustomerService {
    Customer saveCustomer(Customer customer);
    Customer getCustomerWithId(UUID id);

    void updateCustomer(UUID id, Customer customer);

    Customer deleteCustomerById(UUID id);
}
