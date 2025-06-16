package ex_03_Ternary_Operator;

public class Lab_003_NestedTernary {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int n3 = 2;

        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;

        System.out.println(max);
    }
}
