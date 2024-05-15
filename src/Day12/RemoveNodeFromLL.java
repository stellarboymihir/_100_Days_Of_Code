package Day12;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}

public class RemoveNodeFromLL {
        public static ListNode removeNodes(ListNode head) {
//            Day12.ListNode cur = head;
//            Stack<Day12.ListNode> stack = new Stack<>();
//
//            while (cur != null) {
//                while (!stack.isEmpty() && stack.peek().val < cur.val) {
//                    stack.pop();
//                }
//                stack.push(cur);
//                cur = cur.next;
//            }
//
//            Day12.ListNode nxt = null;
//            while (!stack.isEmpty()) {
//                cur = stack.pop();
//                cur.next = nxt;
//                nxt = cur;
//            }
//
//            return cur;

            if (head == null) {
                return null;
            }
            ListNode node = head;
            ListNode nxtGreater = removeNodes(node.next);

            node.next = nxtGreater;
            if (nxtGreater == null || node.val >= nxtGreater.val) {
                return node;
            }
            return nxtGreater;
        }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        ListNode result = RemoveNodeFromLL.removeNodes(head);
        while (result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}
