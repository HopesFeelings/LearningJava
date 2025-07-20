package ex_21_Static_Block;

public class Lab_02_IIB {

    public static void main(String[] args) {
        Galaxy milkyway = new Galaxy();

    }
}



class Galaxy {

    static {
        System.out.println("inside the static block");
    }

    {
        System.out.println("inside the IIb");
    }

    Galaxy()
    {
        System.out.println("inside the constructor");
    }


}
