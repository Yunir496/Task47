package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

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
    public Car carv(){
        Car car = new Car();
        car.setBrand("Honda");
        car.setColor("Black");
        return car;
    }
}
