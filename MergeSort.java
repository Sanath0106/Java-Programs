//Time Complexity is O(n log n) { n -> merging and log n -> dividing the array}
//Space Complexity is O(n) for merging purpose we need to create extra space to sort the elements in original Array
class MergeSort {
    static void merge (int[] arr , int l , int mid , int r) {
        int leftPart = mid - l + 1;
        int rightPart = r - mid;

        int[] left = new int[leftPart];
        int[] right = new int[rightPart];

        int i, j, k;
        for (i = 0; i < leftPart; i++) left[i] = arr[l + i];
        for (j = 0; j < rightPart; j++) right[j] = arr[mid + 1 + j];

        i = 0;
        j = 0;
        k = l;
        while (i < leftPart && j < rightPart) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else
                arr[k++] = right[j++];
        }

        while (i < leftPart)
            arr[k++] = left[i++];

        while (j < rightPart)
            arr[k++] = right[j++];
    }

    static void mergeSort(int[] arr , int l , int r)
    {

        if(l>=r) return;
        int mid = l + (r - l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);

        merge(arr,l,mid,r);
    }

    static void printArray(int[] arr){
        for(int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println("Unsorted Array : ");
        printArray(arr);
        
        mergeSort(arr,0, arr.length-1);

        System.out.println("Sorted Array : ");
        printArray(arr);
    
       
    }
}