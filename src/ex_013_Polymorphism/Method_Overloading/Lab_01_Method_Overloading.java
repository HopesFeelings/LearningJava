package ex_013_Polymorphism.Method_Overloading;

public class Lab_01_Method_Overloading {

    public static void main(String[] args) {

        Calculator cl = new Calculator();

        cl.sum();
        System.out.println(cl.sum(1.1,2));
    }
}

class Calculator{

    void sum(){
        System.out.println("The working cal");
    }

    int sum(int a, int b) {
        return a+b;
    }

    double sum(double a, double b)
    {
        return a / b;
    }

    float sum(int a, float b)
    {
        return a * b;
    }

    float sum(float a, int b)
    {
        return a+b+10;
    }
}