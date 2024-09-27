import java.util.Scanner;
public class LinearSearch {
    public static int LS(int[] arr,int key){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i; //successful search
            }
        }
        return -1; //unsuccessful search
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int size = sc.nextInt(); //size of the array

        int[] arr = new int[size]; //Array Creation

        System.out.println("Enter the Elements :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key value :");
        int key = sc.nextInt();
        int result = LS(arr,key);
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
