package ex_012_Inheritance.Single;

public class Lab_01_Single_Animal_Sound_Simulator {
    public static void main(String[] args) {

        Cat ct = new Cat();

        ct.makesound();
        ct.meow();




    }
}




//        Task 1: "Animal Sound Simulator"
//
//        📄 Description:  (Single Inheritance + Method Call)
//
//      Create a base class Animal with a method makeSound(). Then create a derived class Cat that has a method meow().
//      In the main method, call both methods using the Cat object.
//
//
//
//        ✅ Task 2: "Vehicle Constructor Chain"
//
//        📄 Description:
//
//      Create a class Vehicle with a constructor that prints "Vehicle is ready".
//      Create a class Bike that extends Vehicle and prints "Bike is ready" in its constructor.
//      Create an object of Bike in the main method and observe constructor call order.
//
//
//
//        ✅ Task 3: "Multilevel Login System"
//
//        📄 Description: (Multilevel Inheritance)
//
//              Create a class User with a method login().
//              Extend it with a class AdminUser that adds a method accessAdminPanel().
//              Then create a SuperAdmin class that extends AdminUser and adds a method shutdownSystem().
//
//              Use an object of SuperAdmin to call all three methods.


