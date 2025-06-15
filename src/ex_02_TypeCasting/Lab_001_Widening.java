package ex_02_TypeCasting;

public class Lab_001_Widening {
    public static void main(String[] args) {
         byte a = 100;
         int b = a;           // implicit widening

        System.out.println(b);


        byte c = 120;
        int d = (int)c;           // explicit widening with is not required

        System.out.println(d);
    }
}
