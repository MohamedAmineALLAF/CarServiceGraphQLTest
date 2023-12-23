package com.example.carservice.service;

import com.example.carservice.dao.entities.Car;
import com.example.carservice.dao.repositories.CarRepository;
import com.example.carservice.service.dtos.CarDto;
import com.example.carservice.service.mappers.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CarManager implements CarManagerAction {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CarMapper carMapper;

    @Override
    public CarDto getCarById(Long id) {
        return carMapper.fromCarToCarDto(carRepository.findById(id).get());
    }

    @Override
    public CarDto saveCar(CarDto carDto) {
        return carMapper.fromCarToCarDto(carRepository.save(carMapper.fromCarDtoToCar(carDto)));
        /*Long carId = carDto.getModel().;
        if (carId != null && carRepository.existsById(carId)) {

            throw new CarExistsException("Car with ID " + carId + " already exists.");
        }

        Car savedCar = carRepository.save(carMapper.fromCarDtoToCar(carDto));
        return carMapper.fromCarToCarDto(savedCar);*/
    }
}
