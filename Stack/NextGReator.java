import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = { 6, 7, 8, 5, 3, 0, 1 };

        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.println(nextGreater[i] + " ");
        }

    }
}

// This is for next Greater Right
// for Next Greater Left - > for (int i = arr.length - 1; i >= 0 ; i-- ) {
// change it 0 to n
// for next smaller right -> while(!s.isEmpty() && arr[i] >= arr[s.peek()]) {
// change it sign

// for next smaller left - > change both size and diirection