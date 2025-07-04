package ex_011_Constructors;

public class Lab_001_Default {
    public static void main(String[] args) {


        Boy obj = new Boy();

        System.out.println(obj.name);
        obj.walk();



    }
}

class Boy
{
    String name;
    int age;



    Boy()
    {
        name = "Radha";
        age = 20;

    }


    void walk()
    {
        System.out.println("Walking");
    }

    void talk()
    {
        System.out.println("Talking");
    }

}
