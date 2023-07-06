public class Main {
    public static void main(String[] args) {

        Car toyota = new Car("Toyota", 12000, 2021, "Black");

        toyota.setPrice(13500);

        Car toyota2 = new Car(toyota);

        toyota2.setColor("Yellow");
        toyota.setColor("Orange");
        toyota2.setColor("Blue");
        toyota.setColor("Purple");
        toyota2.setColor("Fuchsia");
        toyota.setColor("Beige");

        System.out.println("Car: \n name: " + toyota.getMake()
                + "\n price: " + toyota.getPrice()
                + "\n color: " + toyota.getColor());

        System.out.println("Car 2: \n name: " + toyota2.getMake()
                + "\n price: " + toyota2.getPrice()
                + "\n color: " + toyota2.getColor());
    }
}
