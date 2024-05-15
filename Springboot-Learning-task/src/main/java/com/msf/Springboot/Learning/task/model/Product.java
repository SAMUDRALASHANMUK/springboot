package com.msf.Springboot.Learning.task.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Product {
    @Id
    private int productId;
    private String productName;
    private String quantity;
    private int price;
}
