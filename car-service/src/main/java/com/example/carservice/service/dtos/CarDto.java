package com.example.carservice.service.dtos;


import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CarDto {
    private String color;
    private String price;
    private String model;
}
