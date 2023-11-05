package com.example.microspring.service;

import com.example.microspring.dto.Customer;

import java.util.UUID;

/**
 * @Author: Jet Ma
 * @Created: 5/11/2023
 */
public interface CustomerService {
    Customer getCustomer();
    Customer getCustomerWithId(UUID id);
}
