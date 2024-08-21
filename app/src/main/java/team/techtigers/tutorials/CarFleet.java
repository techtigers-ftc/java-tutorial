package team.techtigers.tutorials;

/**
 * Really bad implementation of a car fleet management system.
 */
public class CarFleet {
    private final Car mazda = new Car("Mazda", "CX-5", 2019, 12.0, 12.0);
    private final Car toyota = new Car("Toyota", "Corolla", 2018, 10.0, 18.0);
    private final Car honda = new Car("Honda", "Civic", 2017, 8.0, 20.0);

    /**
     * Rent a car from the fleet. This will mark the car as not available.
     *
     * @param manufacturer The manufacturer of the car.
     * @param model The model of the car.
     */
    public void rentCar(String manufacturer, String model) {
        if (manufacturer.equals("Mazda") && model.equals("CX-5")) {
            mazda.rent();
        } else if (manufacturer.equals("Toyota") && model.equals("Corolla")) {
            toyota.rent();
        } else if (manufacturer.equals("Honda") && model.equals("Civic")) {
            honda.rent();
        } else {
            System.out.printf("Car not found: %s, %s\n", manufacturer, model);
        }
    }

    /**
     * Return a car to the fleet. This will mark the car as available.
     *
     * @param manufacturer The manufacturer of the car.
     * @param model The model of the car.
     */
    public void returnCar(String manufacturer, String model) {
        if (manufacturer.equals("Mazda") && model.equals("CX-5")) {
            mazda.returnCar();
        } else if (manufacturer.equals("Toyota") && model.equals("Corolla")) {
            toyota.returnCar();
        } else if (manufacturer.equals("Honda") && model.equals("Civic")) {
            honda.returnCar();
        } else {
            System.out.printf("Car not found: %s, %s\n", manufacturer, model);
        }
    }

    /**
     * Resets the fuel level of the car to the maximum value for the car.
     *
     * @param manufacturer The manufacturer of the car.
     * @param model The model of the car.
     */
    public void refuelCar(String manufacturer, String model) {
        if (manufacturer.equals("Mazda") && model.equals("CX-5")) {
            mazda.refuel(12.0);
        } else if (manufacturer.equals("Toyota") && model.equals("Corolla")) {
            toyota.refuel(10.0);
        } else if (manufacturer.equals("Honda") && model.equals("Civic")) {
            honda.refuel(8.0);
        } else {
            System.out.printf("Car not found: %s, %s\n", manufacturer, model);
        }
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
        if (manufacturer.equals("Mazda") && model.equals("CX-5")) {
            mazda.drive(distance);
        } else if (manufacturer.equals("Toyota") && model.equals("Corolla")) {
            toyota.drive(distance);
        } else if (manufacturer.equals("Honda") && model.equals("Civic")) {
            honda.drive(distance);
        } else {
            System.out.printf("Car not found: %s, %s\n", manufacturer, model);
        }
    }

    /**
     * Shows the current status of the car fleet.
     */
    public void show() {
        System.out.println(mazda);
        System.out.println(honda);
        System.out.println(toyota);
        System.out.println("==================================");
    }
}
