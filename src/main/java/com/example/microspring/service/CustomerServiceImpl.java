package com.example.microspring.service;

import com.example.microspring.dto.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @Author: Jet Ma
 * @Created: 5/11/2023
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCustomerWithId(UUID id) {
        return Customer.builder()
                .id(id)
                .name("Jet with id")
                .build();
    }
    @Override
    public Customer saveCustomer(Customer customer) {
//        return Customer.builder()
//                .id(UUID.randomUUID())
//                .name("Jet")
//                .build();
        return customer;
    }

    @Override
    public void updateCustomer(UUID id, Customer customer) {
        customer.setId(id);
    }
}
