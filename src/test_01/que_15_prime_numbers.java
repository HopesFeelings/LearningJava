package test_01;

public class que_15_prime_numbers {

    public static void main(String[] args) {

        int count = 0;

        for(int i=2; i<=100; i++)
        {

            count = 0;

            for(int j=1; j<=i; j++)
            {
                if(i % j == 0)
                {
                    count++;
                }
            }

            if(count == 2)
            {
                System.out.println(i);
            }
        }
    }
}
