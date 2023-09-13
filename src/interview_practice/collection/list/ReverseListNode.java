package interview_practice.collection.list;

public class ReverseListNode {
	
	
	private static class ListNode{
		int data;
		ListNode next;
		
		ListNode(int data){
			this.data = data;
		}
	}
	
	
	public static void main(String[] args)
	{
		ListNode node1 = new ListNode(14);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(24);
		ListNode node4 = new ListNode(43);
		ListNode node5 = new ListNode(44);
		ListNode node6 = new ListNode(54);
		ListNode node7 = new ListNode(43);
		ListNode node8 = new ListNode(-4);
		ListNode node9 = new ListNode(49);
		
		ListNode head = node1;
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		boolean flag=false;
		ListNode prev=null,curr=null;
		
		
		while(head != null)
		{
			curr = head;
			head = head.next;
			if(prev == null)
			{
				prev = curr;
				prev.next=null;
			}else {
				curr.next = prev;
				prev = curr;
			}
		}
		
		head = prev;
		
		while(head != null) {
			System.out.print(head.data+", ");
			head = head.next;
		}
	}

}
