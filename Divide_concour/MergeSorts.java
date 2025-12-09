public class MergeSorts {

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }


    public static void mergeSort(int arr[] , int si , int ei) {
        //Base Case
        if ( si >= ei) {
            return;
        }
        //Kaam 
        int mid = si + (ei - si) / 2;  //Start or we Write it also (si  + ei) / 2;
        mergeSort(arr , si , mid); //Left Part 
        mergeSort(arr , mid + 1 , ei);  //Right Part 
        merge(arr , si , mid , ei); //Merge the array 
    }

    public static void merge(int arr[] ,int si , int mid ,int ei ) {
            int temp[] = new int[ei-si+1];
            int i = si;  //Iterator For Left Part
            int j = mid + 1; //Iterator For Right Part 
            int k = 0; //Iterator For Temp Array 

            while ( i <= mid && j <= ei) {
                if(arr[i] < arr[j]) {
                    temp[k] = arr[i];
                    i++;
                 
                }
                else {
                    temp[k] = arr[j];
                    j++;
                    
                }
                   k++;
            }
            //Left Part 
            while( i <= mid) {
                temp[k++] = arr[i++];
            }
            //Right Part 
            while(j <=ei) {
                temp[k++] = arr[j++];
            }

        //Copy Temp Array To Main Array 
        for(k = 0, i = si; k <= temp.length - 1 ; k++, i++) {
                arr[i] = temp[k];
        }


    }
    public static void main(String args[]) {
        int arr[] =  { 2, 4 , 5, 7 , 4 , 9}; 
        mergeSort(arr, 0 , arr.length - 1);
        printArr(arr);
    }
}