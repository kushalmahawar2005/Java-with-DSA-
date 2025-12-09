public class MergeSort {

    public static void MergeSort(int arr[], int si , int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        MergeSort(arr, si, mid);       // left part
        MergeSort(arr, mid + 1, ei);   // right part
        Merge(arr, si, mid, ei);       // merge step
    }

    public static void Merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        int i = si;      // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0;       // iterator for temp

        // merging both halves
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // copy remaining elements from left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // copy remaining elements from right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]) {
        int arr[] = {4, 3, 6, 8, 5, 2};
        MergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
