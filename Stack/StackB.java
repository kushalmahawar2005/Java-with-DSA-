
//Stack uning arrayList
import java.util.ArrayList;

public class StackB {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push

        public static void push(int data) {
            list.add(data); // Insert at the last of Index
        }

        // pop

        public static int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peak operation

        public static int peek() {
            int top = list.get(list.size() - 1);
            return top;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}