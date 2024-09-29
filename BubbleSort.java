import java.util.Scanner;
class BubbleSort {
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
        for (int i = 0; i < arr.length-1; i++) { //No. of passes
            for (int j = 0; j < arr.length - i - 1; j++) { //Swapping
                if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        System.out.print("After Sorting :");
        printArray(arr);
        sc.close();

    }
}
