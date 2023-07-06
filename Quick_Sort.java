public class Quick_Sort { //Using Pivot,partition and swap; pivot chosen using 1. first element 2. last element 3. random element OR 4. median element
    //Time Complexity Average Case = O(nlogn) but worst case is O(n^2) 
    //worst case occurs when pivot is either the smallest or largest element i.e. the case when array is completely sorted or unsorted i.e. elements arranged in ascending or descending order
    //quicksort is implemented when we have average cases and due to it's advantage of using less memory whereas merge sort is implemented when we have more memory so that we can take extra array and we want even the worst case time complexity as nlogn
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swapping                 
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i; //pivot index
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr={6,3,9,5,2,8};
        int n=arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}