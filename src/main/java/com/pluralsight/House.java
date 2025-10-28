package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double houseValue = 0;

        switch (condition) {
            case 1:
                houseValue = 180 * squareFoot;
                break;
            case 2:
                houseValue = 130 * squareFoot;
                break;
            case 3:
                houseValue = 90 * squareFoot;
                break;
            case 4:
                houseValue = 80 * squareFoot;
                break;
            default:
                System.out.println("That condition doesn't exist");
                break;
        }
        return houseValue +  .25 * lotSize;
    }
}
