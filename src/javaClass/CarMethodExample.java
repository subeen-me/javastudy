package javaClass;

public class CarMethodExample {
    public static void main(String[] args) {
        CarMethod myCar = new CarMethod();
        myCar.keyTurnOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.println("현재 속도 : " + speed + "km/h");
    }
}
