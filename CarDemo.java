class Car {
    // attributes
    String brand;
    String color;
    int speed;

    // methods
    void start() {
        System.out.println(brand + " is starting");
    }

    void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " is now running at " + speed + " km/h");
    }

    void stop() {
        System.out.println(brand + " has stopped");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Honda";
        car1.color = "Red";
        car1.speed = 0;

        car1.start();
        car1.accelerate(50);
        car1.stop();

        System.out.println("---------");

        Car car2 = new Car();
        car2.brand = "Tesla";
        car2.color = "Blue";
        car2.speed = 100;

        car2.start();
        car2.accelerate(50);
        car2.stop();
    }
}
