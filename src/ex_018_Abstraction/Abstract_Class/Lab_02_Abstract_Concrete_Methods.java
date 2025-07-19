package ex_018_Abstraction.Abstract_Class;

public class Lab_02_Abstract_Concrete_Methods {

    public static void main(String[] args) {

        NewAirWays n = new NewAirWays();
        n.jetEngine();
    }
}


abstract class Plane {

    void jetEngine(){
        System.out.println("Engine is working fine");
    }

}

class NewAirWays extends Plane {

    void jetEngine() {
        System.out.println("not working");
    }
}