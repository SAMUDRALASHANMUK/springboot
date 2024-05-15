package com.msf.Springboot.Learning.task.dto;

import com.msf.Springboot.Learning.task.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
    private Customer customer;
}
