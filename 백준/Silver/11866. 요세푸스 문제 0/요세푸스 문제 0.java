import java.util.Scanner;

public class Main {
    static class ListNode {
        String item;
        ListNode next;

        public ListNode(String item) {
            this.item = item;
            this.next = null;
        }
        public ListNode(String item, ListNode next) {
            this.item = item;
            this.next = next;
        }
        public String getItem() {
            return this.item;
        }
    }
    static class CircularList {
        private ListNode tail;
        private int size;

        public CircularList() {
            this.tail = null;
            this.size = 0;
        }

        public void add(String item) {
            ListNode newNode = new ListNode(item);
            if(tail == null) {
                tail = newNode;
                tail.next = tail;
            } else {
                newNode.next = tail.next;
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }
        public String remove(int k) {
            if(tail == null || size == 0) {
                return null;
            }

            ListNode prev = tail;
            for(int i = 0; i < k-1; i++) {
                prev = prev.next;
            }

            ListNode toRemove = prev.next;
            String result = toRemove.item;

            if(toRemove == tail) {
                if(tail == tail.next) {
                    tail = null;
                } else {
                    tail = prev;
                }
            }

            prev.next = toRemove.next;
            size--;

            tail = prev;

            return result;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        CircularList list = new CircularList();
        for(int i = 1; i <= N; i++) {
            list.add(String.valueOf(i));
        }
        System.out.print("<");
        for(int i = 0; i < N; i++) {
            String removed = list.remove(K);
            if(i == N - 1) {
                System.out.print(removed);
            } else {
                System.out.print(removed + ", ");
            }
        }
        System.out.print(">");
    }

}
