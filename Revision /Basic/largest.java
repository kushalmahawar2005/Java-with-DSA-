
// public class largest {
//     public static void main(String main[]) {
//         int ar[] = { 1, 2, 3, 5, 4, 8, 6, 2 };
//         int max = Integer.MIN_VALUE;
//         int newMax = Integer.MIN_VALUE;
//         for (int i = 0; i < ar.length; i++) {
//             if (ar[i] > max) {
//                 max = ar[i];
//             }
//         }
//         for (int i = 0; i < ar.length; i++) {
//             if (ar[i] > newMax && ar[i] != max) {
//                 newMax = ar[i];
//             }
//         }
//         System.out.println(newMax); 
//     }
// }


// For Reverse in array 

public class largest {
    public static void main(String[] args) {
        int arr[] = {1 , 4, 6, 0, 4, 2, 0, 3, 0};

        int n = arr.length;
        int temp[] = new int[n];

        int j = 0;
    //Non Zero Element inserted in TEMP Array
        for(int i = 0 ; i < n; i++) {
            if(arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        //Now imsert zERO IN ARRAY

        while(j < n) {
            temp[j] = 0;
            j++;
        }   

        //print array
        for(int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }

    }
}