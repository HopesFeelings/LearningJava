package ex_018_Abstraction.Abstract_Class;

import java.awt.*;

public class Lab_03_Abstract_without_Method {

    public static void main(String[] args) {

        Bat b = new Bat();



    }
}


//abstract class Toy {
//
//}
//
//class Bat extends Toy {
//
//}

// Constructor in abstract class

abstract class Toy {
    Toy() {
        System.out.println("Toy's constructor");
    }
}

class Bat extends Toy {
    Bat() {
        System.out.println("Bat's constructor");
    }
}

