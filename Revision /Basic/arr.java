public class arr {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        // System.out.print(i + " " + j + "\t");
        // }
        // System.out.println();
        // }

        int mid = arr.length / 2;
        int target = 20;

        for (int i = 0; i < mid; i++) {
            if (arr[mid] == target) {
                System.out.println("Element is present at index " + mid);
            }

            else if (arr[mid] > target) {
                for (i = 0; i < mid; i++) {
                    System.out.println(arr[i]);
                }
            }

            else {
                for (i = mid + 1; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
            }
        }

        int arr[] = new int[5];
        

    }
}