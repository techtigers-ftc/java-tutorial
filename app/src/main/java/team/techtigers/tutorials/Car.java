package team.techtigers.tutorials;

public abstract class Car {
    protected String make;
    protected String model;
    protected int year;
    protected double milesPerGallon;
    protected double fuel;
    protected boolean rented;

    public Car(String make, String model, int year, double milesPerGallon, double fuel) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.milesPerGallon = milesPerGallon;
        this.fuel = fuel;
        this.rented = false;
    }

    public void rent() {
        this.rented = true;
    }

    public void returnCar() {
        this.rented = false;
    }

    public void refuel(double fuel) {
        this.fuel = fuel;
    }

    public void drive(int distance) {
        this.fuel -= distance/this.milesPerGallon;
    }

    public boolean match(String manufacturer, String model) {
        return this.make.equals(manufacturer) && this.model.equals(model);
    }

    public boolean isAvailable() {
        return !this.rented;
    }

    public abstract void refuel();

    @Override
    public String toString() {
        return String.format("%s %s (%s):\n\tAvailable: %s\n\tFuel: %.2f " +
        "gallons\n\n",
                this.make, this.model, this.year, this.rented, this.fuel);
    }
}
