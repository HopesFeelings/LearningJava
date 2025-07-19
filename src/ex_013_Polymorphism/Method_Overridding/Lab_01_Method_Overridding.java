package ex_013_Polymorphism.Method_Overridding;

public class Lab_01_Method_Overridding {


    public static void main(String[] args) {


        Vehicle vc = new Car();
        vc.engine();

    }

}


class Vehicle{

    void engine(){
        System.out.println("Engine is working");
    }
}


class Car extends Vehicle{

    void engine() {
        System.out.println("Small Engine");

    }
}


class Truck extends Vehicle{

    void engine() {
        System.out.println("Big Engine");
    }
}