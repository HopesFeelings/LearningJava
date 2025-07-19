package ex_018_Abstraction.Abstract_Class;

//abstract public class Lab_04_Constructor {
//
//    public static void main(String[] args) {
//        Flat f = new Flat("Radha");
//
//
//    }
//}


abstract class Home {
    String name;

    Home(String name) {

        this.name = name;
        System.out.println("Home's constructor "+name);
    }

    public static void main(String[] args) {

        Flat f = new Flat("Radha");
    }
}

class Flat extends Home {


    Flat(String name){
        super(name);
        System.out.println("Flat's constructor "+name);
    }
}