// Makes a class called sum_even_fibonacci
public class sum_even_fibonacci {
    // Main function of the class
    public static void main(String[] args) {
        // Does the fibonacci sequence several several times
        int a = 0, b = 1;
        int sumEven = 0;
        while (b < 4000000) {
            if (b % 2 == 0) {
                sumEven += b;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        // Returns the sumEven variable
        System.out.println(sumEven);
    }
}

// answer should be 4613732
