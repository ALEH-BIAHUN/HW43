package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app.Context.xml");

        Car car = (Car) context.getBean("car");
        car.theСarIsDriving();
        Wheel wheel = (Wheel) context.getBean("wheel");
        wheel.toDoWheel();
        Engine engine = (Engine) context.getBean("engine");
        engine.doEngine();
        Transmission transmission = (Transmission) context.getBean("transmission");
        transmission.dotransmission();
    }
}