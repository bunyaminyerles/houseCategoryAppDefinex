package com.definex.model;

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
}
