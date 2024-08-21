package team.techtigers.tutorials;

public class Honda extends Car {
    public Honda(String model, int year, double milesPerGallon, double fuel) {
        super("Honda", model, year, milesPerGallon, fuel);
    }

    @Override
    public void refuel() {
        this.fuel = 8.0;
    }
}
