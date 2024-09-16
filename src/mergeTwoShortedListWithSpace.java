public class mergeTwoShortedListWithSpace {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
//    class Solution {
//        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//            if(list1==null && list2==null) return null;
//            if(list1==null) return list2;
//            if(list2==null) return list1;
//
//            ListNode tempA = list1;
//            ListNode tempB = list2;
//            ListNode head = new ListNode(0);
//            ListNode temp = head;
//
//            while(tempA!=null && tempB!=null){
//                if(tempA.val<tempB.val){
//                    ListNode node = new ListNode(tempA.val);
//                    temp.next = node;
//                    temp = temp.next;
//                    tempA = tempA.next;
//                }else{
//                    ListNode node = new ListNode(tempB.val);
//                    temp.next = node;
//                    temp = temp.next;
//                    tempB = tempB.next;
//                }
//            }
//
//            if(tempA!=null){
//                temp.next = tempA;
//            }else{
//                temp.next = tempB;
//            }
//
//            return head.next;
//        }
//    }
}
