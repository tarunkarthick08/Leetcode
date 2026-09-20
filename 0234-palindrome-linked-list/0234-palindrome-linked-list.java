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
    public boolean isPalindrome(ListNode head) {
       ArrayList<Integer> s=new ArrayList<>();
       ListNode t=head;
       while(t!=null){
        s.add(t.val);
        t=t.next;
       }
       int m=s.size();
       for(int i=0;i<m/2;i++){
          if (!s.get(i).equals(s.get(m - 1 - i))) {
                return false;
            }
       }
       return true;
    }
}