class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}
		ListNode curr1 = l1;
		ListNode curr2 = l2;

		ListNode nodeToLookAt = new ListNode();
		ListNode resultNode = new ListNode();

		resultNode.next = nodeToLookAt;
		
		int carryOver = 0;
		
		while (curr1 != null || curr2 != null) {
			int num1 = curr1 != null ? curr1.val : 0;
			int num2 = curr2 != null ? curr2.val : 0;
			
			int result = num1 + num2 + carryOver;

			if (result >= 10) {
				carryOver = result / 10;
				result = result % 10;
			} else {
				carryOver = 0;
			}
			
			nodeToLookAt.next = new ListNode(result);
			
			curr1 = curr1 != null ? curr1.next : curr1;
			curr2 = curr2 != null ? curr2.next : curr2;

			nodeToLookAt = nodeToLookAt.next;

			
			if (curr1 == null && curr2 == null) {
				if (carryOver > 0) {
					nodeToLookAt.next = new ListNode(carryOver);
				}
			}
		}
		
		return resultNode.next.next;
	}
}
