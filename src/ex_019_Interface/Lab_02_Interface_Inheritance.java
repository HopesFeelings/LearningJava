package ex_019_Interface;

public class Lab_02_Interface_Inheritance {
    public static void main(String[] args) {
        Earth e = new Earth();
        e.rotation();
        e.size();
    }
}

interface Planet
{
    void rotation();
}

interface Exoplanet extends Planet
{
    void size();
}

class Earth implements Planet{

    public void rotation(){
        System.out.println("Rotation");
    }

    public void size()
    {
        System.out.println("Size is perfect");
    }


}
