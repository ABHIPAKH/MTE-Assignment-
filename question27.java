public class question27 {

    
        public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode a = headA, b = headB;
            while (a != b) {
                a = (a == null) ? headB : a.next;
                b = (b == null) ? headA : b.next;
            }
            return a;
        }
    
        public static void main(String[] args) {
            // Build two intersecting lists manually if needed
            ListNode common = new ListNode(8); common.next = new ListNode(10);
            ListNode headA = new ListNode(3); headA.next = new ListNode(7); headA.next.next = common;
            ListNode headB = new ListNode(99); headB.next = common;
    
            ListNode intersect = getIntersectionNode(headA, headB);
            System.out.println("Intersection at node with value: " + (intersect != null ? intersect.val : "null"));
        }
    }
    
