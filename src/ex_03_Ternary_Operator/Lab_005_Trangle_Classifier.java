package ex_03_Ternary_Operator;

public class Lab_005_Trangle_Classifier {
    public static void main(String[] args) {

        int side = 3;
        int side2 = 3;
        int side3 = 5;


        if((side == side2) && (side2 == side3))
        {
            System.out.println("Triangle is equilateral triangle");
        }
        else if((side == side2) || (side2 == side3) || (side == side3))
        {
            System.out.println("Isoscales triangle");
        }
        else
        {
            System.out.println("Triangle is scalene");
        }
    }
}
