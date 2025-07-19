package ex_018_Abstraction.Abstract_Class;

public class Lab_05_Multilevel_Abstraction {
}


abstract class Vehicle {

    abstract void gear();
}

abstract class Truck extends Vehicle {

    abstract void engine();

    void tyres(){
        System.out.println("Working fine");
    }
}

class SuperCar extends Truck {


    void gear() {
        System.out.println("Gears");
    }

    void engine(){
        System.out.println("Engine");
    }

    public static void main(String[] args) {
        SuperCar s = new SuperCar();
        s.engine();
        s.gear();
        s.tyres();
    }
}