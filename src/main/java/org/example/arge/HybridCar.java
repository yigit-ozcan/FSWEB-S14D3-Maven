package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name,
                     String description,
                     double avgKmPerLitre,
                     int batterySize,
                     int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("HybridCar engine has started");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("HybridCar is driving");
    }

    @Override
    protected void runEngine() {
        System.out.println(
                "Running hybrid system with " +
                        cylinders + " cylinders and " +
                        batterySize + " kWh battery"
        );
    }
}
