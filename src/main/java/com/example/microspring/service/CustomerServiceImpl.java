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
    public Customer getCustomer() {
        return Customer.builder()
                .id(UUID.randomUUID())
                .name("Jet")
                .build();
    }
    @Override
    public Customer getCustomerWithId(UUID id) {
        return Customer.builder()
                .id(id)
                .name("Jet with id")
                .build();
    }
}
