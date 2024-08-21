package team.techtigers.tutorials;

import java.util.Arrays;
import java.util.List;

public class CarFleet {
    private final Car mazda = new Mazda( "CX-5", 2019, 12.0, 12.0);
    private final Car honda = new Honda("Civic", 2017, 8.0, 20.0);
    private final Car toyota = new Toyota("Corolla", 2018, 10.0, 18.0);
    private final List<Car> fleet = Arrays.asList(mazda, honda, toyota);

    /**
     * Rent a car from the fleet. This will mark the car as not available.
     *
     * @param manufacturer The manufacturer of the car.
     * @param model The model of the car.
     */
    public void rentCar(String manufacturer, String model) {
        for (Car car : this.fleet) {
            if (car.match(manufacturer, model) && car.isAvailable()) {
                car.rent();
                return;
            }
        }
        System.out.printf("Car not found: %s, %s\n", manufacturer, model);
    }

    /**
     * Return a car to the fleet. This will mark the car as available.
     *
     * @param manufacturer The manufacturer of the car.
     * @param model The model of the car.
     */
    public void returnCar(String manufacturer, String model) {
        for (Car car : this.fleet) {
            if (car.match(manufacturer, model) && !car.isAvailable()) {
                car.returnCar();
                return;
            }
        }
        System.out.printf("Car not found: %s, %s\n", manufacturer, model);
    }

    /**
     * Resets the fuel level of the car to the maximum value for the car.
     *
     * @param manufacturer The manufacturer of the car.
     * @param model The model of the car.
     */
    public void refuelCar(String manufacturer, String model) {
        for (Car car : this.fleet) {
            if (car.match(manufacturer, model) && !car.isAvailable()) {
                car.refuel();
                return;
            }
        }

        System.out.printf("Car not found: %s, %s\n", manufacturer, model);

    }

    /**
     * Drives the car around for a bit, consuming fuel.
     *
     * @param manufacturer The manufacturer of the car.
     * @param model The model of the car.
     * @param distance The distance to drive the car. The longer the
     *                 distance, the greater the fuel consumption.
     */
    public void driveCar(String manufacturer, String model, int distance) {
        for (Car car : this.fleet) {
            if (car.match(manufacturer, model) && !car.isAvailable()) {
                car.drive(distance);
                return;
            }
        }

        System.out.printf("Car not found: %s, %s\n", manufacturer, model);

    }

    /**
     * Shows the current status of the car fleet.
     */
    public void show() {
        System.out.printf(mazda.toString());
        System.out.printf(honda.toString());
        System.out.printf(toyota.toString());
        System.out.println("==================================");
    }
}
