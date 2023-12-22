package com.driver;

public class Boat implements WaterVehicle {
    String name;
    int capacity;
    
    
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        // TODO Auto-generated method stub
        return name;
       // throw new UnsupportedOperationException("Unimplemented method 'getVehicleName'");
    }

    @Override
    public int getVehicleCapacity() {
        // TODO Auto-generated method stub
        return capacity;
       // throw new UnsupportedOperationException("Unimplemented method 'getVehicleCapacity'");
    }
    
}
