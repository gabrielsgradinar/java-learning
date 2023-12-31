import java.util.Arrays;

public class Dealership {

    private Car[] cars;

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];

        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new Car(cars[i]); // deep copy
        }
    }

    public Car getCar(int index) {
        return new Car(this.cars[index]);
    }

    public void setCar(int index, Car newCar) {
        this.cars[index] = new Car(newCar);
    }

    public void sell(int index) {
        this.cars[index].drive();
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }

}
