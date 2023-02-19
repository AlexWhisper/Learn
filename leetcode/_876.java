package leetcode;

/*
 * @author Alex
 * @version 1.0
 */
public class _876 {
    /*
    * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。

    如果有两个中间结点，则返回第二个中间结点。
    * */
    public static void main(String[] args) {
        ListNode listNode = new ListNode();

    }

    public ListNode middleNode(ListNode head) {
        ListNode lowPointer = head,fastPointer  = head;
        while (fastPointer != null && fastPointer.next != null){
            lowPointer  = lowPointer.next;
            fastPointer  = fastPointer.next.next;
        }

        return lowPointer;
    }


}
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) {
         this.val = val;
     }
     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
 }