package com.definex.housecategoryapp;

import com.definex.model.Building;
import com.definex.model.House;
import com.definex.model.SummerVilla;
import com.definex.model.Villa;
import com.definex.service.BuildingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HouseCategoryAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseCategoryAppApplication.class, args);
        List<Building> buildingList = List.of(
                House.builder().price(12000000D).squareMeter(150D).numberOfRoom(3).numberOfLivingRoom(1).build(),
                House.builder().price(18000000D).squareMeter(160D).numberOfRoom(4).numberOfLivingRoom(1).build(),
                House.builder().price(32000000D).squareMeter(180D).numberOfRoom(5).numberOfLivingRoom(1).build(),
                Villa.builder().price(35000000D).squareMeter(230D).numberOfRoom(6).numberOfLivingRoom(2).build(),
                Villa.builder().price(10000000D).squareMeter(250D).numberOfRoom(7).numberOfLivingRoom(2).build(),
                Villa.builder().price(15000000D).squareMeter(280D).numberOfRoom(8).numberOfLivingRoom(2).build(),
                SummerVilla.builder().price(45000000D).squareMeter(300D).numberOfRoom(5).numberOfLivingRoom(4).build(),
                SummerVilla.builder().price(55000000D).squareMeter(400D).numberOfRoom(6).numberOfLivingRoom(2).build(),
                SummerVilla.builder().price(85000000D).squareMeter(500D).numberOfRoom(9).numberOfLivingRoom(2).build()
        );
        BuildingService buildingService = new BuildingService();
        buildingService.setBuildingList(buildingList);
        System.out.printf("Total House Price is : %,.01f%n", buildingService.totalHousePrice());   // 1,234,567,890.1234560000
        System.out.printf("Total Villa Price is : %,.01f%n", buildingService.totalVillaPrice());   // 1,234,567,890.1234560000
        System.out.printf("Total Summer Villa Price is : %,.01f%n", buildingService.totalSummerVillaPrice());   // 1,234,567,890.1234560000
        System.out.printf("Total Building Price is : %,.01f%n", buildingService.totalBuildingPrice());   // 1,234,567,890.1234560000
        System.out.printf("Average House Square Meter is : %,.01f%n", buildingService.averageSquareMeterHouse());   // 1,234,567,890.1234560000
        System.out.printf("Average Villa  Square Meter is : %,.01f%n", buildingService.averageSquareMeterVilla());   // 1,234,567,890.1234560000
        System.out.printf("Average Summer Villa  Square Meter is : %,.01f%n", buildingService.averageSquareMeterSummerVilla());   // 1,234,567,890.1234560000
        System.out.printf("Average Building Price Square Meter : %,.01f%n", buildingService.averageSquareMeterBuilding());   // 1,234,567,890.1234560000
        System.out.printf("The House with livingRoom: %d, room: %d, are listed below  %n %s", 6,2,buildingService.filterBuilding(6,2).stream().map(Building::toString).toList());   // 1,234,567,890.1234560000
    }
}
