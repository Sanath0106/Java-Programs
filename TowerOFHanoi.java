package prog.sorting;

import java.util.Scanner;

public class TowerOFHanoi {
    public static int towerOfHanoi(int  n , String src , String temp , String  dest){
        if(n==0){
            System.out.println("No Disk to move");
            return 0;
        }

        if(n==1){
            System.out.println("Transferred Disk "+ n + " from "+ src + " to "+ dest);
            return 1;
        }

        int count =  towerOfHanoi(n-1,src,dest,temp);
        System.out.println("Transferred Disk "+ n + " from "+ src + " to "+ dest);
        count++;
        count += towerOfHanoi(n-1,temp,src,dest);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no . Disk :");
        int n = sc.nextInt();
        int totalSteps = towerOfHanoi(n,"S","T","D");
        System.out.println("No. of Steps Taken : "+ totalSteps);
    }
}

