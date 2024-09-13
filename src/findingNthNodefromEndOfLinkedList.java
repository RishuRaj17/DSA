public class findingNthNodefromEndOfLinkedList {
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

        int findLastNthNodeMethodOne(int idx){
            Node fast = head;
            Node slow = head;

            for(int i=1;i<=idx;i++){
                fast = fast.next;
            }

            while(fast.next!=null){
                fast = fast.next;
                slow = slow.next;
            }

            return slow.data;
        }

        int findLastNthNodeMethodTwo(int idx){
            int m = size;
            int n = idx;
            int index = (m-n)-1;
            Node temp = head;

            for(int i=1; i<=index;i++){
                temp = temp.next;
            }

            return temp.data;
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.insertAtEnd(9);
        ll.insertAtEnd(3);

//        int ans =  ll.findLastNthNodeMethodOne(1);

        int ans = ll.findLastNthNodeMethodTwo(5);

        System.out.println(ans);

    }
}
