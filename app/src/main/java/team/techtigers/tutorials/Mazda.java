package team.techtigers.tutorials;

public class Mazda extends Car {

    public Mazda(String model, int year, double milesPerGallon, double fuel) {
        super("Mazda", model, year, milesPerGallon, fuel);
    }


    @Override
    public void refuel() {
        this.fuel = 12.0;
    }
}
