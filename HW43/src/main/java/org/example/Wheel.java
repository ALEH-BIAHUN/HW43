package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Wheel {
    Integer numberOfWheels;
    Integer radius;
    String nameOfTheTires;

    public void toDoWheel() {
        System.out.println("The wheels are turning");
    }
}