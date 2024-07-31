package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Engine {
    Double engineDisplacement;
    String engineType;
    String engineName;

    public void doEngine() {
        System.out.println("The car engine is running");
    }
}