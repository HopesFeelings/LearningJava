package ex_011_Constructors;

public class Lab_002_Parameterised {

    public static void main(String[] args) {


        SmallBoy obj = new SmallBoy("Ram",15);
        obj.name = "vijay";

        System.out.println(obj.name);
    }


}


class SmallBoy
{
    String name;
    int age;



    SmallBoy(String name, int age)
    {
        this.name = name;
        this.age = age;

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