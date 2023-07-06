public class LinkedL {
    public static void main(String[] args) {
        
    }
}
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
/* https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/986775260/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        //size
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            curr=curr.next;
            size++;
        }
        //corner case
        if(n==size){
            return head.next;
        }
        //finding previous node to nth or last node
        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;
        while(i<indexToSearch){
            prev = prev.next;
            i++;
        }
        //using previous to cut down nth node from last and returned head
        prev.next = prev.next.next;
        return head;

    }
}
*/

/**https://leetcode.com/problems/palindrome-linked-list/submissions/986899409/
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/* 
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode findMiddle(ListNode head){
        //turtle hare approach to reach middle faster by moving hare 2 step at a time while turtle moving one step so that eventually when hare reaches a stage when it can't take anymore steps the position of turtle would be the first middle
       ListNode hare = head;
       ListNode turtle = head; 
       while(hare.next != null && hare.next.next != null){
           hare = hare.next.next;
           turtle=turtle.next;
       }
       return turtle;
    }
    public boolean isPalindrome(ListNode head) {
        //corner case of either empty linked list or atleast one element present in a linked list
        if(head == null || head.next == null){
            return true;
        }
        //Find out middle of a linked list
        ListNode middle = findMiddle(head); //gives us 1st half ka end function middle will be defined by us 
        ListNode secondHalfStart = reverse(middle.next); 
        ListNode firstHalfStart = head;
//function reverse will be defined by us which will reverse half of the linked list
//Comparison
while(secondHalfStart != null){
    if(firstHalfStart.val != secondHalfStart.val){
        return false;
    }
    firstHalfStart = firstHalfStart.next;
    secondHalfStart = secondHalfStart.next;
}
return true;
    }
}*/

//Floyd's Algorithm to detect loop using hare and turtle approach believing that if they both meet at some point that means loop exist but if they never meet it means no loop exist.
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
/*public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode hare = head; //fast
        ListNode turtle = head; //slow
        while(hare!= null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
            if(hare == turtle){
                return true;
            }
        }
        return false;
    }
}*/
