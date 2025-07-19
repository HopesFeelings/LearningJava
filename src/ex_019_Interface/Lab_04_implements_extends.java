package ex_019_Interface;

public class Lab_04_implements_extends {
}

interface A{
    void method();

    private void sample(){
        System.out.println("Sample");
    }
}

class D {
    void method_class(){
        System.out.println("D is here");
    }
}


class Demo extends D implements A {

    @Override
    public void method() {
        System.out.println("yes");

    }



    public static void main(String[] args) {
        Demo d = new Demo();
        d.method();

        d.method_class();



    }
}




