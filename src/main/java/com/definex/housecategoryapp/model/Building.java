package com.definex.housecategoryapp.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Building {
    private Integer numberOfRoom;
    private Integer numberOfLivingRoom;
    private Double squareMeter;
    private Double price;

    @Override
    public String toString() {
        return "Building {" +
                "numberOfRoom=" + numberOfRoom +
                ", numberOfLivingRoom=" + numberOfLivingRoom +
                ", squareMeter=" + squareMeter +
                ", price=" + String.format("%,.01f",price) +
                '}';
    }
}
