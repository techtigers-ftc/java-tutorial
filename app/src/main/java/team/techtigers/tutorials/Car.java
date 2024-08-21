package team.techtigers.tutorials;

/**
 * Really bad implementation of a car fleet management system.
 */
public class Car {
    private final Object[] mazda = new Object[] {
            "Mazda",
            "CX-5",
            2019,
            12.0,
            12.0,
            true
    };
    private final Object[] toyota = new Object[]{
            "Toyota",
            "Corolla",
            2018,
            10.0,
            18.0,
            true
    };
    private final Object[] honda = new Object[]{
            "Honda",
            "Civic",
            2017,
            8.0,
            20.0,
            true
    };

    /**
     * Rent a car from the fleet. This will mark the car as not available.
     *
     * @param manufacturer The manufacturer of the car.
     * @param model The model of the car.
     */
    public void rentCar(String manufacturer, String model) {
        if (manufacturer.equals("Mazda") && model.equals("CX-5")) {
            mazda[5] = false;
        } else if (manufacturer.equals("Toyota") && model.equals("Corolla")) {
            toyota[5] = false;
        } else if (manufacturer.equals("Honda") && model.equals("Civic")) {
            honda[5] = false;
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
            mazda[5] = true;
        } else if (manufacturer.equals("Toyota") && model.equals("Corolla")) {
            toyota[5] = true;
        } else if (manufacturer.equals("Honda") && model.equals("Civic")) {
            honda[5] = true;
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
            mazda[3] = 12.0;
        } else if (manufacturer.equals("Toyota") && model.equals("Corolla")) {
            toyota[3] = 10.0;
        } else if (manufacturer.equals("Honda") && model.equals("Civic")) {
            honda[3] = 8.0;
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
            double gallonsConsumed = distance / (double) mazda[4];
            mazda[3] = (double)mazda[3] - gallonsConsumed;

        } else if (manufacturer.equals("Toyota") && model.equals("Corolla")) {
            double gallonsConsumed = distance / (double) toyota[4];
            toyota[3] = (double)toyota[3] - gallonsConsumed;

        } else if (manufacturer.equals("Honda") && model.equals("Civic")) {
            double gallonsConsumed = distance / (double) honda[4];
            honda[3] = (double)honda[3] - gallonsConsumed;

        } else {
            System.out.printf("Car not found: %s, %s\n", manufacturer, model);
        }
    }

    /**
     * Shows the current status of the car fleet.
     */
    public void show() {
        System.out.printf("%s %s (%s):\n\tAvailable: %s\n\tFuel: %.2f " +
                        "gallons\n\n",
                mazda[0], mazda[1], mazda[2], mazda[5], mazda[3]
        );
        System.out.printf("%s %s (%s):\n\tAvailable: %s\n\tFuel: %.2f " +
                        "gallons\n\n",
                honda[0], honda[1], honda[2], honda[5], (double)honda[3]
        );
        System.out.printf("%s %s (%s):\n\tAvailable: %s\n\tFuel: %.2f " +
                        "gallons\n\n",
                toyota[0], toyota[1], toyota[2], toyota[5], (double)toyota[3]
        );

    }
}
