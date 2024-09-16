public class mergeTwoSprtedList {
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
//
//            if(list1==null) return list2;
//            if(list2==null) return list1;
//
//            ListNode listA = list1;
//            ListNode listB = list2;
//            ListNode tempA = listA;
//            ListNode tempB = listB;
//            ListNode head = (list1.val<=list2.val)?list1:list2;
//
//            while(tempA!=null && tempB!=null){
//                if(tempA.val<=tempB.val){
//                    tempA = tempA.next;
//                    listA.next = tempB;
//                    if(tempA!=null){
//                        listA = tempA;
//                    }
//                }else{
//                    tempB = tempB.next;
//                    listB.next = tempA;
//                    if(tempB!=null){
//                        listB = tempB;
//                    }
//                }
//            }
//
//            if(tempA!=null){
//                listB.next = listA;
//            }else if(tempB!=null){
//                listA.next = listB;
//            }
//
//            return head;
//        }
//    }
}
