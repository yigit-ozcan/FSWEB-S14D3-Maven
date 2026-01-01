package org.example;
import org.example.arge.CarSkeleton;
import org.example.arge.GasPoweredCar;
import org.example.arge.ElectricCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;


public class Main {
    public static void main(String[] args) {
        CarSkeleton gasCar = new GasPoweredCar(
                "BMW 3 Series",
                "Gas powered sedan",
                15.5,
                4
        );

        CarSkeleton electricCar = new ElectricCar(
                "Tesla Model 3",
                "Electric sedan",
                420,
                75
        );

        CarSkeleton hybridCar = new HybridCar(
                "Toyota Prius",
                "Hybrid hatchback",
                22.0,
                50,
                4
        );

        testCar(gasCar);
        testCar(electricCar);
        testCar(hybridCar);

        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

    }

    private static void testCar(CarSkeleton car) {
        System.out.println(car);

        car.startEngine();
        car.drive();

        System.out.println("---------------");
    }
}