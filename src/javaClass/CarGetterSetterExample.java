package javaClass;

public class CarGetterSetterExample {
    public static void main(String[] args) {
        CarGetterSetter myCar = new CarGetterSetter();

        myCar.setSpeed(-50);

        System.out.println("현재 속도 : " + myCar.getSpeed());

        myCar.setSpeed(60);

        if(!myCar.isStop()) {
            myCar.setStop(true);
        }

        System.out.println("현재 속도 : " + myCar.getSpeed());
    }
}
