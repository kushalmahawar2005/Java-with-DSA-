
public class isSorted {
     public static int firstOcc(int arr[] ,int key , int i) {
        if(i == arr.length) { //Ager i ne sare index check karlyee or kuch nahi milaa to -1 Return akr dega orr Ye Base case hai 
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
           return firstOcc(arr, key ,  i+1);
    }


    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i + 1]) {
            return false;
        }

         return isSorted(arr, i + 1);
    }

    public static int lastOcc(int arr[], int key , int i ) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, key , i + 1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static int power(int x , int n) {
        if(n == 0) {
            return 1;
        }
        return x * power(x  , n-1);
    }


   

    public static void main(String args[]) {
        int arr[] = {8 , 3 , 6 , 9 , 5 , 10 , 2, 5 ,3};
        System.out.println(power(2, 5));
    }

}
