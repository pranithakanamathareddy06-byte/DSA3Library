class Vehicle{
    int speed = 50;
    Vehicle(){
        System.out.println("vehicle constructor called");
    }
    void displayspeed(){
        System.out.println("speed: " + speed);
    }
}
class Car extends Vehicle{
    int speed = 100;
    Car(){
        super();
        System.out.println("car constructor called");
    }
    void showSpeed(){
        System.out.println("car speed: " + speed);
        System.out.println("vehicle speed: " + super.speed);
    }
}
public class SuperDemo{
    public static void main(String[] args){
        Car c = new Car();
        c.showSpeed();
    }
}