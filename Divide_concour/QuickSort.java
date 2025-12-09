public class QuickSort {

    public static void printArr(int arr[]) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[] , int si , int ei) {
        if(si >= ei) {
            return;
        }
        //Last Element
        int pidx =  partition(arr, si , ei);
        quickSort(arr, si, pidx - 1); //Left Index
        quickSort(arr, pidx + 1, ei); //Right Index
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; //to make place for els smaller than Pivot 

        for(int j = 0; j < ei; j++) { // For Smaller Element 
            if(arr[j] <= pivot) {
                i++;
                //swap 
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }

        i++;
        int temp = pivot;
                arr[ei] = arr[i];
                arr[i] = temp;
                return i;
    }
    public static void main(String args[]) {
        int arr[] = {6 , 3 , 9 , 8 , 4};
        quickSort(arr, 0 , arr.length - 1);
    }
}