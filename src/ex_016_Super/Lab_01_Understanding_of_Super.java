package ex_016_Super;

public class Lab_01_Understanding_of_Super {

    public static void main(String[] args) {
        Child c = new Child();


    }

}


class Parent {

    Parent(String name){
        System.out.println(name);
    }

    Parent(){
        System.out.println("Hi form parent");
    }

    void read() {
        System.out.println("Reading");
    }
}


class Child extends Parent {

    protected Child() {



        System.out.println("Child is doing the work");
    }
}

