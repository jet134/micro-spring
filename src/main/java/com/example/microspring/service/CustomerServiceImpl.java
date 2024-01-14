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

    @Override
    public Customer deleteCustomerById(UUID id) {
        UUID uuid = UUID.fromString("9fe93008-bc0f-4fef-85e1-549cd179a107");
        return uuid.equals(id) ? Customer.builder()
                .id(id)
                .name("Jet with id")
                .build() : null;
    }
}
