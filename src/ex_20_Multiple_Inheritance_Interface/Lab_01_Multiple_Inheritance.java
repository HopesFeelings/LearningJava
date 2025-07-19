package ex_20_Multiple_Inheritance_Interface;

public class Lab_01_Multiple_Inheritance {




}


interface A {

    default void sound(){
        System.out.println("A's");
    }
}


interface B {
    default void sound(){
        System.out.println("B's");
    }
}


class Microphone implements A, B {

    public void sound()
    {
        A.super.sound();
        //System.out.println("Perfect sound");
    }



    public static void main(String[] args) {
        Microphone m = new Microphone();
        m.sound();


    }




}