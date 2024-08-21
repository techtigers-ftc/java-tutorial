package team.techtigers.tutorials;

public class Toyota extends Car {
    public Toyota(String model, int year, double milesPerGallon, double fuel) {
        super("Toyota", model, year, milesPerGallon, fuel);
    }

    @Override
    public void refuel() {
        this.fuel = 10.0;
    }
}
