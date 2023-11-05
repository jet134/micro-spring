package com.example.microspring.controller;

import com.example.microspring.dto.Customer;
import com.example.microspring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: Jet Ma
 * @Created: 5/11/2023
 */
@RequestMapping("api")
@RestController
public class BeerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<Customer> getCustomer() {
        return new ResponseEntity<>(customerService.getCustomer(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomerWithId(@PathVariable("id") UUID beerId) {
        return new ResponseEntity<>(customerService.getCustomerWithId(beerId), HttpStatus.OK);
    }
}
