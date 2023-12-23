package com.example.carservice.service;

import com.example.carservice.service.dtos.CarDto;

public interface CarManagerAction {
    public CarDto getCarById(Long id);
    public CarDto saveCar(CarDto carDto);
}
