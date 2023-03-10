package com.definex.housecategoryapp.service;


import com.definex.housecategoryapp.model.Building;
import com.definex.housecategoryapp.model.House;
import com.definex.housecategoryapp.model.SummerVilla;
import com.definex.housecategoryapp.model.Villa;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BuildingService {

    private List<Building> buildingList;

    public Double totalHousePrice() {
        return buildingList.stream().filter(building -> building instanceof House).mapToDouble(Building::getPrice).sum();
    }

    public Double totalVillaPrice() {
        return buildingList.stream().filter(building -> building instanceof Villa).mapToDouble(Building::getPrice).sum();
    }

    public Double totalSummerVillaPrice() {
        return buildingList.stream().filter(building -> building instanceof SummerVilla).mapToDouble(Building::getPrice).sum();
    }

    public Double totalBuildingPrice() {
        return buildingList.stream().mapToDouble(Building::getPrice).sum();
    }

    public Double averageSquareMeterHouse() {
        return buildingList.stream().filter(building -> building instanceof House).mapToDouble(Building::getSquareMeter).average().getAsDouble();
    }

    public Double averageSquareMeterVilla() {
        return buildingList.stream().filter(building -> building instanceof Villa).mapToDouble(Building::getSquareMeter).average().getAsDouble();
    }


    public Double averageSquareMeterSummerVilla() {
        return buildingList.stream().filter(building -> building instanceof SummerVilla).mapToDouble(Building::getSquareMeter).average().getAsDouble();
    }

    public Double averageSquareMeterBuilding() {
        return buildingList.stream().mapToDouble(Building::getSquareMeter).average().getAsDouble();
    }

    public List<Building> filterBuilding(Integer numberOfRoom, Integer numberOfLivingRoom) {
        return buildingList.stream().filter(building -> building.getNumberOfLivingRoom().equals(numberOfLivingRoom) && building.getNumberOfRoom().equals(numberOfRoom)).toList();
    }

}
