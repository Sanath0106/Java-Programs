//Time complexity is O(n+k) in worst case and O(n) in best
//Space complexity is O(n+k)
// where n is no. of element & k is the range of values 

class CountSort {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }

    static void countSort(int[] arr){
        int n =  arr.length;
        int[] output = new int[n];
        int max = findMax(arr);
        int[] count = new int [max+1];

        for(int i=0;i<arr.length;i++){ //frequency array
            count[arr[i]]++;
        }

        for(int i=1;i<count.length;i++){ //prefix sum
            count[i] += count[i-1];
        }

        //find index of each in original array and put it in output array
        for (int i=n-1;i>=0;i--){
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;

        }
        for(int i=0;i<n;i++)
        {
            arr[i] = output[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = {5,4,2,12,4,5,2};
        System.out.print("Unsorted Array : ");
        printArray(arr);
        countSort(arr);
        System.out.print("Sorted Array : ");
        printArray(arr);
    }

    static void printArray(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}