package ex_017_This;

public class Lab_02_Returning_Cur_Class_Object {

    public static void main(String[] args) {

        Building b = new Building();

        b.setName("smart").setFloors(12);
        b.what();


    }

}


class Building{

    String name;
    int floors;

    Building setName(String name)
    {
        this.name = name;
        return this;
    }

    Building setFloors(int floors)
    {
        this.floors = floors;
        return this;
    }

    void what()
    {
        System.out.println(name+floors);
    }

}

