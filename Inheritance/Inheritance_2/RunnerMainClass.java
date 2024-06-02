public class RunnerMainClass {

public static void main(String[] args) {
    
    Car car = new Car();
    Bike bike = new Bike();
    Bus bus = new Bus();

    System.out.println(car.fuel());
    System.out.println(bike.fuel());
    System.out.println(bus.fuel());
}


}
