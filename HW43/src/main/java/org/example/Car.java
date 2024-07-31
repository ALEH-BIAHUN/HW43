package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    String type;
    String color;
    Integer speed;
    Integer age;

    public void theСarIsDriving() {
        System.out.println("The car is moving");
    }
}