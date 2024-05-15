package com.msf.Springboot.Learning.task.repository;

import com.msf.Springboot.Learning.task.dto.OrderResponse;
import com.msf.Springboot.Learning.task.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query("SELECT new com.msf.Springboot.Learning.task.dto.OrderResponse(c.name,p.productName) from Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
