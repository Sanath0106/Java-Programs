//Time complexity is O(d*(n+k) in all Case
//Space complexity is O(n+k)

class RadixSort {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }
    static void countSort(int[] arr,int place){
        int n =  arr.length;
        int[] output = new int[n];
        int[] count = new int [10];

        for(int i=0;i<arr.length;i++){ //frequency array
            count[(arr[i]/place)%10]++;
        }

        for(int i=1;i<count.length;i++){ //prefix sum
            count[i] += count[i-1];
        }

        //find index of each in original array and put it in output array
        for (int i=n-1;i>=0;i--){
            int idx = count[(arr[i]/place)%10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;

        }
        for(int i=0;i<n;i++)
        {
            arr[i] = output[i];
        }

    }

    static void radixSort(int[] arr){
        int max = findMax(arr);
        //apply count sort to sort elements based on place value
        for(int place =1;max/place > 0;place *= 10){
            countSort(arr,place);

        }

    }
    public static void main(String[] args) {
        int[] arr = {0,894,626,43,3,453};
        System.out.print("Unsorted Array : ");
        printArray(arr);
        radixSort(arr);
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