package ex_018_Abstraction.Abstract_Class;

public class Lab_01_Understanding {

    public static void main(String[] args) {

        Car c = new Car();
        c.plug();
    }
}


abstract class Engine {

    abstract void plug();

}

class Car extends Engine {

    void plug() {
        System.out.println("Plug is working properly");
    }
}