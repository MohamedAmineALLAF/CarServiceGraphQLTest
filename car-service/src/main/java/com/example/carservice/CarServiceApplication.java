package com.example.carservice;

import com.example.carservice.dao.entities.Car;
import com.example.carservice.dao.repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CarServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CarRepository carRepository) {
        return args -> {
            List<Car> carList = List.of(
                    Car.builder().model("Model1").color("Red").matricule("ABC123").price(20000.0f).build(),
                    Car.builder().model("Model2").color("Blue").matricule("XYZ456").price(25000.0f).build(),
                    Car.builder().model("Model3").color("Green").matricule("DEF789").price(18000.0f).build(),
                    Car.builder().model("Model4").color("Black").matricule("GHI101").price(30000.0f).build(),
                    Car.builder().model("Model5").color("White").matricule("JKL112").price(22000.0f).build()
            );
            carRepository.saveAll(carList);
        };
    }
}