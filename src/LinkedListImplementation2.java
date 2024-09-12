public class LinkedListImplementation2 {
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

        void inserAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }

        int size(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }

        void displayList(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

        void insertAt( int val, int idx){
            if(idx==0){
                insertAtHead(val);
                return;
            }else if(idx>=size()){
                inserAtEnd(val);
                return;
            }
            Node n = new Node(val);
            Node temp = head;

            for(int i = 1; i<idx; i++){
                temp = temp.next;
            }

            n.next = temp.next;
            temp.next = n;
        }

        int getAtIdx(int idx){
            Node temp = head;
            for(int i =1;i<=idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAtIdx(int idx){
            Node temp = head;

            if(idx==0){
                head = temp.next;
                return;
            } else if (idx==size()) {
                for(int i =1;i<idx-1;i++){
                    temp = temp.next;
                    System.out.println(temp.data);
                }
                tail = temp;
                temp.next = temp.next.next;
                return;
            }
            for(int i =1;i<idx;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

    }

    public static void main(String[] args) {
        linkedList ll =  new linkedList();
        ll.inserAtEnd(4);
        ll.inserAtEnd(5);
        ll.inserAtEnd(8);
        ll.inserAtEnd(9);
        ll.inserAtEnd(3);

//        ll.displayList();

//        ll.size();

//        ll.insertAtHead(0);

//        ll.insertAt(0,0);
//        ll.insertAt(0,4);
//        ll.insertAt(0,5);
//        ll.displayList();
//        System.out.println(ll.tail.data);

//        System.out.println(ll.getAtIdx(4));
//        ll.deleteAtIdx(0);
//        ll.deleteAtIdx(2);
        ll.deleteAtIdx(5);
        ll.displayList();
//        System.out.println(ll.head.data);
        System.out.println();
        System.out.println(ll.tail.data);
    }
}
