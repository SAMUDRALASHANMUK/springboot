package com.msf.Springboot.Learning.task.controller;

import com.msf.Springboot.Learning.task.dto.OrderRequest;
import com.msf.Springboot.Learning.task.dto.OrderResponse;
import com.msf.Springboot.Learning.task.model.Customer;
import com.msf.Springboot.Learning.task.repository.CustomerRepository;
import com.msf.Springboot.Learning.task.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/save/order")
    public Customer placeOrder(@RequestBody OrderRequest orderRequest) {
        return customerRepository.save(orderRequest.getCustomer());
    }

    @GetMapping("/get/all/orders")
    public List<Customer> findAllOrders() {
        return customerRepository.findAll();
    }

    @GetMapping("/get/join/information")
    public List<OrderResponse> get() {
        return customerRepository.getJoinInformation();
    }

}
