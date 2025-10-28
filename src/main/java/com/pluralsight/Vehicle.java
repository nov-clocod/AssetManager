package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = LocalDate.now().getYear();
        int carAge = currentYear - this.year;
        double cost = getValue();
        double currentVehiclePrice = 0;

        if (carAge <= 3) {
            for (int i = 0; i < carAge; i++) {
                currentVehiclePrice = cost * .97;
            }
        } else if (carAge <= 6) {
            for (int i = 0; i < carAge; i++) {
                currentVehiclePrice = cost * .94;
            }
        } else if (carAge <= 10) {
            for (int i = 0; i < carAge; i++) {
                currentVehiclePrice = cost * .92;
            }
        } else {
            currentVehiclePrice = 1000;
        }

        if (odometer > 100000) {
            if (makeModel.equalsIgnoreCase("Toyota") || makeModel.equalsIgnoreCase("Honda")) {
                return currentVehiclePrice;
            } else {
                currentVehiclePrice = currentVehiclePrice * .75;
            }
        }

        return currentVehiclePrice;
    }
}
