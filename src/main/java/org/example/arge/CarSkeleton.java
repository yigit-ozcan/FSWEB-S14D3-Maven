package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){}
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Engine has started");
    }

    public void drive() {
        runEngine();
        System.out.println("Car is driving");
    }

    protected void runEngine() {
        System.out.println("Running generic engine");
    };

    @Override
    public String toString() {
        return "Car type: " + getClass().getSimpleName()
                + ", name=" + name
                + ", description=" + description;
    }
}
