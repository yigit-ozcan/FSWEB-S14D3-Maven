package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name,
                       String description,
                       double avgKmPerLitre,
                       int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("GasPoweredCar engine has started");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("GasPoweredCar is driving");
    }

    @Override
    protected void runEngine() {
        System.out.println("Running gas engine with " + cylinders + " cylinders");
    }
}
