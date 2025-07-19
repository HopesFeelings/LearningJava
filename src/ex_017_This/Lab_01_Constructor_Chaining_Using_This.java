package ex_017_This;

public class Lab_01_Constructor_Chaining_Using_This {

    public static void main(String[] args) {

        Chaining c = new Chaining("Radha");
        c.show();
    }
}


class Chaining {

    String name;
    int age;

    Chaining(String name)
    {
        this(name,18);
    }

    Chaining(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void show()
    {
        System.out.println(name+age);
        System.out.println(this);
    }
}
