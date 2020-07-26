package medium;

public class Add_Two_Numbers {

	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
		
		ListNode ll = addTwoNumbers(l1, l2);
		
		while (ll != null) {
			if (ll != null) {
				System.out.println(ll.val);
				ll = ll.next;
			}
		}
		
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		
		while (l1 != null || l2 != null) {
			if (l1 != null) {
				sb1.insert(0, l1.val);
				l1 = l1.next;
			}
			if (l2 != null) {
				sb2.insert(0, l2.val);
				l2 = l2.next;
			}
		}
		
		int i1 = Integer.parseInt(sb1.toString());
		int i2 = Integer.parseInt(sb2.toString());
		
		String s1 = String.valueOf(i1 + i2);
		StringBuffer sb3 = new StringBuffer();
		for (int i = 0; i < s1.length(); i++) {
			sb3.insert(0, s1.charAt(i));
		}
		
		s1 = sb3.toString();
		
		ListNode ln = new ListNode();
		ListNode ll = new ListNode();
		ln.next = ll;
		
		for (int i = 0; i < s1.length(); i++) {
			
			switch (i) {
				case 0:
					ll.val = Character.getNumericValue(s1.charAt(i));
					break;
				default:
					ll.next = new ListNode(Character.getNumericValue(s1.charAt(i)));
					ll  = ll.next;
			}
		}
		
		return ln.next;
	}
	
}

class ListNode {
	
	int val;
	ListNode next;
	
	ListNode() {
		
	}
	
	ListNode(int val) {
		this.val = val;
	}
	
	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}