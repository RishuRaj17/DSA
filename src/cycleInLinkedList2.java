public class cycleInLinkedList2 {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
//    public class Solution {
//        public ListNode detectCycle(ListNode head) {
//            if(head==null) return null;
//            if(head==head.next) return head;
//            if(head.next==null) return null;
//
//            ListNode fast = head;
//            ListNode slow = head;
//            ListNode prev = fast;
//
//            while(fast!=null && fast.next!=null){
//                slow = slow.next;
//                fast = fast.next.next;
//
//                if(fast==slow){
//                    return prev;
//                }
//                prev = fast;
//            }
//
//            return null;
//        }
//    }

//    Standard Method:
//    public class Solution {
//        public ListNode detectCycle(ListNode head) {
//            if(head==null) return null;
//            if(head==head.next) return head;
//            if(head.next==null) return null;
//
//            ListNode fast = head;
//            ListNode slow = head;
//
//            while(fast!=null && fast.next!=null){
//                slow = slow.next;
//                fast = fast.next.next;
//
//                if(fast==slow){
//                    break;
//                }
//            }
//
//            if(fast==null || fast.next==null) return null;
//
//            while(head!=slow){
//                head = head.next;
//                slow = slow.next;
//            }
//
//            return slow;
//        }
//    }
}

