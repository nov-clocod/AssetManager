package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Asset> assets =  new ArrayList<>();

        House house1 = new House("My House", "2023-10-28", 300000,
                "123 Street", 2, 2000, 5000);
        House vacationHome = new House("Vacation Home", "2021-06-15", 450000,
                "789 Ocean View Dr", 1, 2800, 8000);

        Vehicle car1 = new Vehicle("Daily Commuter", "2022-03-12", 22000,
                "Toyota Camry", 2020, 45000);

        Vehicle car2 = new Vehicle(
                "Weekend Sports Car", "2021-07-05", 58000,
                "Chevrolet Corvette", 2019, 18000);
        System.out.println("Value: " + house1.getValue());

        assets.add(house1);
        assets.add(vacationHome);
        assets.add(car1);
        assets.add(car2);

        for (Asset asset : assets) {
            System.out.println(asset.getDescription() + "|" + asset.getDateAcquired() + "|" + asset.getOriginalCost());
            if (asset instanceof House) {
                System.out.println(((House) asset).getValue());
                System.out.println(((House) asset).getAddress());
            } else if (asset instanceof Vehicle) {
                System.out.println(((Vehicle) asset).getValue());
                System.out.println(((Vehicle) asset).getMakeModel());
            } else {
                System.out.println("Just an asset");
            }
        }
    }
}
