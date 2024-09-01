package com.jatin.project_bean_config2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jatin.project_bean_config2.model.Car;
import com.jatin.project_bean_config2.model.Engine;

/**
 * CarCofig
 */
@Configuration
public class CarCofig {

   @Bean
    public Car car() {
        return new Car("Tata Nixon", new Engine("Electric", true));
    }

    @Bean
    public Engine engine() {
        return new Engine("Diesel", false);
    }
}
