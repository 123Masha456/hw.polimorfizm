public class Main {
    public static void main(String[] args) {

        Truck truck1 = new Truck("truck1", 6, "A", "light");
        Truck truck2 = new Truck("truck2", 8, "B", "heavy");

        Car car1 = new Car("car1", 4, "C");
        Car car2 = new Car("car2", 4, "D");

        Bicycle bicycle1 = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(car2);
        serviceStation.check(bicycle1);
        serviceStation.check(truck2);
    }
}
