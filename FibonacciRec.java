package prog.sorting;

import java.util.Scanner;
public class FibonacciRec {
        static int fib(int n)
        {
            // Base Case
            if (n <= 1)
                return n;
            // Recursive call
            return fib(n - 1) + fib(n - 2);
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value of N :");
            int N = sc.nextInt();

            // Print the first N numbers
            for (int i = 0; i < N; i++) {
                System.out.print(fib(i) + " ");
            }
        }
    }


