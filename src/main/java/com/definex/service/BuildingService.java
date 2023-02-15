package com.definex.service;


import com.definex.model.Building;
import com.definex.model.House;
import com.definex.model.SummerVilla;
import com.definex.model.Villa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

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

    public Double totalSquareMeterHouse() {
        return null;
    }

    public Double totalSquareMeterVilla() {
        return null;
    }


    public Double totalSquareMeterSummerVilla() {
        return null;
    }

    public Double totalSquareMeterBuilding() {
        return null;
    }

    public List<Building> filterBuilding(Integer numberOfRoom, Integer numberOfLivingRoom) {
        return null;
    }
}
