package org.example;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = applicationContext.getBean("car",Car.class);
        System.out.println("Car: " + car);

        Car carv = applicationContext.getBean("carv",Car.class);
        System.out.println("CarV: " + carv);
    }
}
