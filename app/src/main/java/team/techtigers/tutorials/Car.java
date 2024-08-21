package team.techtigers.tutorials;

public class Car {
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

    @Override
    public String toString() {
        return String.format("%s %s (%s):\n\tAvailable: %s\n\tFuel: %.2f " +
                        "gallons\n\n",
                this.make, this.model, this.year, this.rented, this.fuel);
    }
}
