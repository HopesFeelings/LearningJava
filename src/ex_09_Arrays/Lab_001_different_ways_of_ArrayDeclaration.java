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


        // Second Way

        int[] arr2 = new int[4];

        arr2[0] = 20;
        arr2[1] = 50;

        System.out.println(arr2[1]);
        System.out.println(arr2.length);


        // Third Way

        int[] arr3 = new int[] {
            1,2                                // size automatically inferred
        };

        System.out.println(arr3.length);



        int[][] twod = {
                {1,2}
        };

        int [][] twod2 = new int[][]{
                {2,3},
                {5,6},
                {4,6},
                {7,8}
        };

        System.out.println(twod2.length);

    }
}
