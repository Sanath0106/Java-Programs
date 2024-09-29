import java.util.Scanner;

public class InsertionSort {  //shifting of elements not swapping
    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = sc.nextInt(); //size of the array

        int[] arr = new int[size]; //Array Creation

        System.out.println("Enter the Elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before Sorting :");
        printArray(arr);

        for(int i=1;i<arr.length;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.print("After Sorting :");
        printArray(arr);
        sc.close();
    }
}
