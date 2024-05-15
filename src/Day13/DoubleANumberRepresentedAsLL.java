package Day13;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class DoubleANumberRepresentedAsLL {
    public static ListNode doubleNode(ListNode head) {
        ListNode curr = head;
        ListNode carry = new ListNode(0); // Initialize carry with 0
        while (curr != null) {
            int twiceOfVal = carry.val * 2 + curr.val; // Add current node value

            curr.val = twiceOfVal % 10; // Update current node value

            if (twiceOfVal >= 10) {
                carry.val = 1; // Set carry to 1
            } else {
                carry.val = 0; // Reset carry
            }

            carry = curr;
            curr = curr.next;
        }

        // If carry is still 1 after processing all nodes, add a new node with value 1
        if (carry.val == 1) {
            carry.next = new ListNode(1);
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(9);
        head.next.next = new ListNode(8);

        ListNode result = doubleNode(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}
