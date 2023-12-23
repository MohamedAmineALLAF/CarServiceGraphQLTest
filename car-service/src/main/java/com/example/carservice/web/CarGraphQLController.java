package com.example.carservice.web;

import com.example.carservice.service.CarManagerAction;
import com.example.carservice.service.dtos.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CarGraphQLController {
    @Autowired
    private CarManagerAction carManagerAction;


    @QueryMapping
    public CarDto getCarById(@Argument Long id) {
        return carManagerAction.getCarById(id);
    }


    @MutationMapping
    public CarDto saveCar(CarDto carDto) {
        return carManagerAction.saveCar(carDto);
    }
}
