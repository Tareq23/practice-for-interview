package interview_practice.leetcode.linkedlist;

public class RemoveDuplicatesFromSortedList {
	
	
	private static class ListNode{
		int data;
		ListNode next;
		
		ListNode(int data)
		{
			this.data = data;
		}
	}
	
	
	public static void main(String[] args)
	{
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		
		ListNode head = node1;
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		ListNode tempResult = head;
		
		ListNode res = tempResult;
		
		head = head.next;
		
		while(head != null)
		{
			ListNode temp = new ListNode(head.data);
			head = head.next;
			System.out.println(temp.data+", temp-result: "+tempResult.data);
			if(temp.data != tempResult.data) {
			
				tempResult.next = temp;
				tempResult = tempResult.next;
//				System.out.println(temp.data);
			}
		}
		
		while(res != null)
		{
			System.out.print(res.data+", ");
			res = res.next;
		}
		
		
	}

}
