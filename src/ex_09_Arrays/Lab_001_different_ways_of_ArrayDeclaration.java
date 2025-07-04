package ex_09_Arrays;

public class Lab_001_different_ways_of_ArrayDeclaration {
    public static void main(String[] args) {



        // First Way

        int []arr = {1,2,3,4,5};

        System.out.println(arr[1]);
        System.out.println(arr);
        System.out.println(System.identityHashCode(arr));

        System.out.println(System.identityHashCode(arr[0]));

        System.out.println(System.identityHashCode(arr[1]));
    }
}
