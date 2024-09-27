import java.util.Scanner;
class BinarySearch{
    public static int BS(int[] arr,int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of the Array : ");
    int size = sc.nextInt(); //size of the array

    int[] arr = new int[size]; //Array Creation

    System.out.println("Enter the Elements in Ascending Order :");
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }

    System.out.println("Enter the key value :");
    int key = sc.nextInt();
    int result = BS(arr,key);
    if(result != -1)
    {
        System.out.println("Found Element @index "+ result);
    }
    else{
        System.out.println("Not Found!");
    }
    sc.close();
}
}
