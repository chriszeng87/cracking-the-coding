
/**
 * Write code to remove duplicates from an unsorted linked list. FOLLOW UP How
 * would you solve this problem if a temporary buffer is not allowed? 
 * 
 * @author Chris
 * 
 */
public class Chapter2_1 {
	
	public static void removeDuplicates(ListNode lists) {
		if (lists == null || lists.next == null) {
			return;
		}
		
		ListNode head = lists;
		ListNode p = lists.next;
		ListNode pre = head;
		while (p != null) {
			ListNode q = head;
			while (q != p && q != null && q.val != p.val) {
				q = q.next;
			}
			if (q != p && q != null && q.val == p.val) {
				pre.next = p.next;
			} else {
				pre = p;
			}
			p = p.next;
		}
		
	}
	
	
	public static void printList(ListNode lists) {
		if (lists == null) {
			return;
		}
		
		ListNode p = lists;
		System.out.print("-----lists: ");
		while (p != null) {
			System.out.print("  " + p.val);
			p = p.next;
		}
		
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode h = new ListNode(1);
		ListNode h1 = new ListNode(2);
		ListNode h2 = new ListNode(3);
		ListNode h3 = new ListNode(1);
		ListNode h4 = new ListNode(2);
		h.next = h1;
		h1.next = h2;
		h2.next = h3;
		h3.next = h4;
		
		removeDuplicates(h);
		printList(h);

	}

}
