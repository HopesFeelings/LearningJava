package ex_02_TypeCasting;

public class Lab_002_Narrowing {
    public static void main(String[] args) {


//        long phone = 9865327548L;
//

//        int a = phone;          // implicit narrowing which is not allowed
//

        long phone = 9865327548L;

        int a = (int)phone;          // explicit narrowing which is allowed but may loss data

        System.out.println(a);


    }
}
