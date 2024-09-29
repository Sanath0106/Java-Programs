import java.util.Scanner;

public class SelectionSort {
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
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

        for(int i=0;i< arr.length-1;i++) //to swap
        {
            int min = i;
            for(int j=i+1;j<arr.length;j++) //to search smallest element
            {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp ;
        }
        System.out.print("Sorted Array : ");
        printArray(arr);
        sc.close();
    }
}
