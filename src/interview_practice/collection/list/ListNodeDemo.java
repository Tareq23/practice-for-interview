package interview_practice.collection.list;




public class ListNodeDemo {
	public static class ListNode{
		int data;
		ListNode next;
		
		ListNode(int data){
			this.data = data;
		}
		
		ListNode(int data, ListNode next){
			this.data = data;
			this.next = next;
		}
	}
	
	
	public static void main(String[] args)
	{
		ListNode head1;
		ListNode node1 = new ListNode(14);
		ListNode node2 = new ListNode(75);
		ListNode node3 = new ListNode(9);
		ListNode node4 = new ListNode(41);
		ListNode node5 = new ListNode(8);
		ListNode node6 = new ListNode(-6);
		
		
		
		head1 = node1;
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		
		
		ListNode n1 = new ListNode(5);
		ListNode n2 = new ListNode(5);
		ListNode n3 = new ListNode(5);
		
		ListNode head2 = n1;
		n1.next=n2;
		n2.next = n3;
		ListNode res = null,result=null;
		while(head1 != null && head2 != null)
		{
			ListNode temp = new ListNode(head1.data+head2.data);
			if(res == null) {
				res = temp;
				result = res;
				System.out.println("temp: "+temp.data+" ; res: "+res.data);
				
			}else {
				res.next = temp;
				res = res.next;
				
				System.out.println("temp: "+temp.data+" ; res: "+res.next);
			}
			
			head1 = head1.next;
			head2 = head2.next;
//			res = res.next;
			
			System.out.println("temp: "+temp.data+" ; res: "+res.data);
			
		}
		
		if(head1 != null)
		{
			
			if(res == null)
			{
				res = head1;
				result = res;
			}
			else {
				res.next = head1;
				System.out.println("res.next::  "+res.next.data);
			}
		}
		if(head2 != null)
		{
			
			if(res == null)
			{
				res = head2;
				result = res;
			}
			else {
				res.next = head2;
				
			}
		}
		
		while(result != null) {
			System.out.print(result.data+", ");
			result = result.next;
		}
		
		System.out.println("\ndone");
	}
}
