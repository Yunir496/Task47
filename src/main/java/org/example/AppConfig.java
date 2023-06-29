package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Car car(){
        Car car = new Car();
        car.setBrand("Toyota");
        car.setColor("Red");
        return car;
    }
    @Bean
    public CarV carv(){
        CarV carv = new CarV();
        carv.setBrand("Honda");
        carv.setColor("Black");
        return carv;
    }
}
