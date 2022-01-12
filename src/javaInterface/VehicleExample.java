package javaInterface;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        //vehicle.checkfare() // Vehicle 인터페이스에는 checkFare()가 없으므로 안된다.

        Bus bus = (Bus) vehicle; //강제 타입 변환

        bus.run();
        bus.checkFare();
    }
}
