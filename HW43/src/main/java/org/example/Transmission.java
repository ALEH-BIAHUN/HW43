package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Transmission {
    private String transmissionType;

    public void dotransmission() {
        System.out.println("The transmission shifts gears");
    }
}