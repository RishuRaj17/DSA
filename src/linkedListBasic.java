public class linkedListBasic {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    static void recursiveDisplay(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        recursiveDisplay(head.next);
    }

    static void reverseList(Node head){
        if(head == null) return;
        reverseList(head.next);
        System.out.print(head.data+" ");
    }

    static void findLength(Node head){
        int count =0;
        while (head!=null){
            count++;
            head = head.next;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(9);
        Node e = new Node(8);

//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;

//        or

        a.next = b;
        a.next.next = c;
        a.next.next.next = d;
        a.next.next.next.next = e;

//        Displaying Data:

//        1)System.out.println(a.next.data);

//        or

//        2) When you know the length.
//        Node temp = a;
//        for(int i =1;i<6;i++){
//            System.out.print(temp.data+" ");
//            temp =  temp.next;
//        }

//        or

//        3) When the length is unknown.
//        Node temp =a;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }

//        or

//        4) Displaying from a method.
//        display(a);

//        or
//        5) Display through recursion
//        recursiveDisplay(a);

//        ** Printing Linked list in reverse Order through Recursion **
//        reverseList(a);

//        ** Finding Length of the linked list: **
        findLength(a);
    }
}
