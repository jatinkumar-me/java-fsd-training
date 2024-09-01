package com.jatin.project_bean_config2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.jatin.project_bean_config2.config.CarCofig;
import com.jatin.project_bean_config2.model.Car;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CarCofig.class);

        Car myCar = ctx.getBean(Car.class);

        System.out.println("Car Name: " + myCar.getCarName());
        System.out.println("Engine running : " + myCar.getEngine().isRunning());
        System.out.println("Engine Type: " + myCar.getEngine().getType());

        ((AbstractApplicationContext) ctx).close();
    }
}
