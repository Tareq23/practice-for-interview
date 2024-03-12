package interview_practice.leetcode.linkedlist;

public class MiddleOfTheLinkedList {

	private static class ListNode{
		int val;
		ListNode next;
		ListNode(int _val){
			val = _val;
			next = null;
		}
	}
	
	public static ListNode insert(ListNode head, int data) {
		
		if(head == null) return new ListNode(data);
		
		
		ListNode temp = head;
		
		while(head.next != null) {
			head = head.next;
		}
		
		head.next = new ListNode(data);
		
		return temp;
	}
	
	public static void display(ListNode head) {
		while(head != null) {
			System.out.print(head.val+" ");
			head = head.next;
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		int[] nums = {4, 5, 7, 1, 3, 9, 2};
		
		ListNode head = null;
		
		for(int i = 0; i < nums.length; i++) {
			head = insert(head, nums[i]);
		}
		
		display(head);
		
	}

}
