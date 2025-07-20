package ex_21_Static_Block;

public class Lab_01_Static_Block {

    public static void main(String[] args) {
        Animal a = new Animal();

       // a.show();

       // System.out.println(Animal.num1);
    }
}

class Animal {
    static int num1 = 10;
    int num2 = 120;

    static {                                              // runs when the class is loaded
        System.out.println("This is the static block");   // the static variable num1 can be initialized here
        System.out.println(Animal.num1+"*");              // or used to perform class level operations

        Animal obj = new Animal();
        System.out.println(obj.num2);
    }

    void show()
    {
        System.out.println(this.num1);
        System.out.println(this.num2);
    }
}

