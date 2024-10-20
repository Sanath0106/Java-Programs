import java.util.Random;

class QuickSort{
    public static void main(String[] args) {
        int[] arr = {5,4,3,4,1,2,1,0};
        System.out.print("UnSorted Array :");
        printArray(arr);

        quickSort(arr,0,arr.length-1);

        System.out.print("Sorted Array :");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int n : arr)
        {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low>=high)
        {
            return;
        }
        int pivot = partition(arr,low,high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
    }

    public static int partition(int[] arr, int low , int high){
        Random rand = new Random();
        int pivotIndex = low + rand.nextInt(high - low + 1);
        swap(arr,low,pivotIndex);

        int pivotElement = arr[low];
        int count = 0;
        for(int i=low+1;i<=high;i++) {
            if (arr[i] <= pivotElement) {
                count++;
            }
        }

        int pivotIdx = low + count;
        swap(arr,low,pivotIdx);
        int i =low , j=high;
        while (i < pivotIdx && j > pivotIdx){
            while (arr[i] <= pivotElement) i++;
            while (arr[j] > pivotElement) j--;

            if(i < pivotIdx && j > pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }

        return pivotIdx;
    }

    public static void swap(int[] arr , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}