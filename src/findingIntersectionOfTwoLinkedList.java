public class findingIntersectionOfTwoLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static int findLength(Node head){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    static void findIntersection(Node head1, Node head2){
        int head1Count = findLength(head1);
        int head2Count = findLength(head2);

        if(head1Count>head2Count){
            int dif = head1Count-head2Count;
            for(int i = 1;i<=dif;i++){
                head1 = head1.next;
            }
        }else{
            int dif = head2Count-head1Count;
            for(int i = 1;i<=dif;i++){
                head2 = head2.next;
            }
        }

        while (head1.next!=head2.next){
            head1 = head1.next;
            head2 = head2.next;
        }

        System.out.println(head1.next.data);
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        a.next.next = c;
        a.next.next.next = d;
        a.next.next.next.next = e;
        a.next.next.next.next.next =f;

        Node g = new Node(90);
        Node h = new Node(9);

        g.next = h;
        h.next = d;

        findIntersection(a,g);
    }
}

//leetcode solution:

//public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//    //boundary check
//    if(headA == null || headB == null) return null;
//
//    ListNode a = headA;
//    ListNode b = headB;
//
//    //if a & b have different len, then we will stop the loop after second iteration
//    while( a != b){
//        //for the end of first iteration, we just reset the pointer to the head of another linkedlist
//        a = a == null? headB : a.next;
//        b = b == null? headA : b.next;
//    }
//
//    return a;
//}