class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		//base case
		if (head == null) {
			return head;
		}

		if (head.next == null) {
			return head;
		}

		ListNode currNode = head.next;

		ListNode resultNode = new ListNode(head.val);
		ListNode handleNode = new ListNode();	

		while (currNode != null) {
			handleNode = new ListNode(currNode.val, resultNode);

			resultNode = handleNode;
			currNode = currNode.next;
		}

		return handleNode;
	}
}
