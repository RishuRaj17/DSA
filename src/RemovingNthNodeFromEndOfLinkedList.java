public class RemovingNthNodeFromEndOfLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class linkedList{
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void removeNthNodeFromLast(int idx){
            Node fast = head;
            Node slow = head;

            for(int i=1; i<=idx;i++){
                fast = fast.next;
            }

            if(fast==null){
                head = head.next;
                return;
            }

            while(fast.next!=null){
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;
        }

        void displayList(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

        public static void main(String[] args) {
            linkedList ll = new linkedList();
            ll.insertAtEnd(4);
            ll.insertAtEnd(5);
            ll.insertAtEnd(8);
            ll.insertAtEnd(9);
            ll.insertAtEnd(3);

            ll.removeNthNodeFromLast(5);

            ll.displayList();
        }
    }
}
