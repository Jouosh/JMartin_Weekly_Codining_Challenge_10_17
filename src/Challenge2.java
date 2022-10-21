import java.sql.SQLOutput;

public class Challenge2 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class MyStack {

        Node head;
        Node max;

        void push(int val) {

            Node data = new Node(val);

            if (head == null) {
                head = data;
                max = data;
                return;
            }

            if (val > max.data) {
                data.next = max;
                max = data;
            }

            data.next = head;
            head = data;
        }

        Node pop() {

            if (head == null) {
                throw new RuntimeException("Stack is empty");
            }

            if (head.data == max.data) {
                Node temp = max;
                max = max.next;
                temp = null;
            }

            Node popped = head;
            head = head.next;

            return popped;
        }

        int max() {
            if (head == null) {
                throw new RuntimeException("Stack is empty");
            }

            return max.data;
        }


    }

    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        for (int i = 0; i < 10; i++) {
            myStack.push((int) (Math.random() * 100));
        }

        System.out.println(myStack.max());

        int pops = (int) (Math.random() * 10);
        for (int i = 0; i < pops; i++) {
            Node popped = myStack.pop();
            System.out.print(popped.data + " ");
        }

        System.out.println();
        System.out.println(myStack.max());

    }

}
