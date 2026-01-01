package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name,
                       String description,
                       double avgKmPerCharge,
                       int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("ElectricCar engine has started");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("ElectricCar is driving");
    }

    @Override
    protected void runEngine() {
        System.out.println("Running electric motor with " + batterySize + " kWh battery");
    }
}
