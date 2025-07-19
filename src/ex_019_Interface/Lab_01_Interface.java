package ex_019_Interface;

public class Lab_01_Interface {

    public static void main(String[] args) {
        NewShip n = new NewShip();

        n.navigation();
    }
}



interface Ship {

    int no = 100;            // Public static final

    void navigation();

    default void fuel(){
        System.out.println("fuel is full");
    }



}

class NewShip implements Ship {

    public void navigation(){
        System.out.println("Engine is working fine");
    }

}