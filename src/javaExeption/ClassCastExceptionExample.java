package javaExeption;

public class ClassCastExceptionExample {
    public static void main(String[] args) {

    }

    public static void changeDog(Animal animal) {
        if(animal instanceof Dog) {
            Dog dog = (Dog) animal;  //예외 발생 가능하므로 if문으로 체크
        }
    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}