class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode currNode;

		if (list1 == null) {
			return list2;
		} else if (list2 == null) {
			return list1;
		}

		if (list1.val <= list2.val) {
			currNode = new ListNode(list1.val, mergeTwoLists(list1.next, list2));
		} else {
			currNode = new ListNode(list2.val, mergeTwoLists(list2.next, list1));
		}

		return currNode;
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) {this.val = val;}
	ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}
