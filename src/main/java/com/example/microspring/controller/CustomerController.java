package com.example.microspring.controller;

import com.example.microspring.dto.Customer;
import com.example.microspring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @Author: Jet Ma
 * @Created: 5/11/2023
 */
@RequestMapping("api/customer")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("{id}")
    @ResponseBody
    public ResponseEntity<Customer> getCustomerWithId(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(customerService.getCustomerWithId(id), HttpStatus.OK);
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Object> saveCustomer(Customer customer) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Endpoint", "api/customer");
        headers.add("Location", customerService.saveCustomer(customer).getId().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Object> updateCustomer(@PathVariable("id") UUID id, Customer customer) {
        customerService.updateCustomer(id, customer);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

//    @DeleteMapping("{id}")
//    public ResponseEntity<Object> deleteCustomerById(@PathVariable("id") UUID id) {
//        Customer customer = customerService.deleteCustomerById(id);
//        return customer == null ? new ResponseEntity<>(HttpStatus.NOT_FOUND) : new ResponseEntity<>(customer, HttpStatus.OK);
//    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomerById(@PathVariable("id") UUID id) {
        customerService.deleteCustomerById(id);
    }
}
