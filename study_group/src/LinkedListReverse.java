/*
 * Given Singly Linked List, we have to reverse it.
 * There might be a null data as an input.
 *
 * input:
 *  Singly Linked List
 *
 * *solution
 * There 2 possible solutions, one is using recursive call. The point is we can go to the end of the Linked List recursively,
 * and add a value and make & move to the next node whenever we terminated each recursive call.
 * However the problem of this solution is we are going to make one additional node since we need to make next node whenever
 * we got the value return with the next node element.
 * To solve this, I started with the second node of Linked List, and before I made the recursive call I stored the first value of head node.
 * So we can finish the recursive call with the new Link list which has same amount of newly added node, but has a null value in the last node.
 * Then we can assign that data with the value which we stored before we started recursion.
 *
 * However, the Leetcode's solution was more efficient. They use iteration.
 * So we can set 3 LinkedList as a pointer, then we can keep storing next series of nodes to the next pointer, and replace the current node's next as a previous nodes.
 * Also we need to store the nodes currently updated with the previous nodes to the previous nodes, and update next node to the current node.
 * Then we can make iteration of this process until we find the current node is null.
 *
 *      ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;

        while (null != cur) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
 */


public class LinkedListReverse {

    public ListNode resversList(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        ListNode revList = new ListNode();
        ListNode revPointer = revList;

        int headValue = head.val;

        revPointer = recursive(head.next, revPointer);

        revPointer.val = headValue;

        return revList;

    }

    public ListNode recursive(ListNode head, ListNode revPointer) {

        int val = head.val;

        if(head.next != null) {
            head = head.next;
            revPointer = recursive(head, revPointer);
        }

        revPointer.val = val;
        revPointer.next = new ListNode();
        revPointer = revPointer.next;

        return revPointer;
    }



public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

 }