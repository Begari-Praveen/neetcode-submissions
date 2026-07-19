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

class Solution {
    public void reorderList(ListNode head) {
        
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int left = 0;
        int right = list.size()-1;
        ArrayList<Integer> list1 = new ArrayList<>();
        while(left < right){
             list1.add(list.get(left));
             list1.add(list.get(right));
             left++;
             right--;
        }
        if(left == right){
            list1.add(list.get(right));
        }
        ListNode temp1 = head;
        int i=0;
        while(temp1 != null){
            temp1.val = list1.get(i);
            i++;
            temp1=temp1.next;
        }
    }
}
