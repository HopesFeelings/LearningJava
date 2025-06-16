package ex_03_Ternary_Operator;

public class Lab_004_Grade {
    public static void main(String[] args) {


        int marks = 95;


        String ans = (marks >= 90) ? "A+" : (marks >= 75) ? "A" : (marks >= 60) ? "B" : (marks >= 40) ? "C" : "Fail";


        System.out.println(ans);
    }
}


//   Marks 90 = A+,
//   75 = A,
//   60 = B,
//   40 = C,
//   below 40 Fail.