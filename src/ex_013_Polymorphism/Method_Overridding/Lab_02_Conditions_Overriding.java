package ex_013_Polymorphism.Method_Overridding;

public class Lab_02_Conditions_Overriding {
    public static void main(String[] args) {

        Animal cow1 = new Animal();
        cow1.sound();
    }

}



class Animal {


    static void sound() {
        System.out.println("Normal");
    }
}

//class Cow extends Animal {
//
//     void sound() {
//        System.out.println("Cow's sound");
//    }
//}
//
//class Cat extends Animal {
//
//    void sound() {
//        System.out.println("Cat's sound");
//    }
//}
