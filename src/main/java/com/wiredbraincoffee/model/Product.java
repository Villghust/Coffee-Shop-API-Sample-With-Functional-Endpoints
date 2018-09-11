package com.wiredbraincoffee.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
}
