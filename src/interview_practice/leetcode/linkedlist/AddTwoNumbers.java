package interview_practice.leetcode.linkedlist;

public class AddTwoNumbers {

	
	private static class ListNode{
		
		int data;
		ListNode next;
		ListNode(int data){
			this.data = data;
		}
		ListNode(){};
		
	}
	
	public static void main(String[] args) {
		
		
		ListNode node1 = new ListNode(9);
		ListNode node2 = new ListNode(9);
		ListNode node3 = new ListNode(9);
		ListNode node4 = new ListNode(9);
		ListNode node5 = new ListNode(9);
		ListNode node6 = new ListNode(9);
		ListNode node7 = new ListNode(9);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		
		ListNode n1 = new ListNode(9);
		ListNode n2 = new ListNode(9);
		ListNode n3 = new ListNode(9);
		ListNode n4 = new ListNode(9);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		ListNode l1 = node1, l2 = n1;
		
		
		ListNode tempResult = new ListNode((l1.data + l2.data)%10);
		ListNode res = tempResult;
		int carry = (l1.data + l2.data)/10;
		
		l1 = l1.next;
		l2 = l2.next;
		
		while(l1 != null && l2 != null)
		{
			int sum = l1.data + l2.data + carry;
			
			l1 = l1.next;
			l2 = l2.next;
			ListNode temp= new ListNode(sum%10);
			carry = sum / 10;
			
			tempResult.next = temp;
			tempResult = tempResult.next;
			
		}
		
		while(l1 != null)
		{
			int sum = l1.data + carry;
			
			l1 = l1.next;
			
			ListNode temp= new ListNode(sum%10);
			carry = sum / 10;
			
			tempResult.next = temp;
			tempResult = tempResult.next;
		}
		
		while(l2 != null)
		{
			int sum =  l2.data + carry;
			
			
			l2 = l2.next;
			ListNode temp= new ListNode(sum%10);
			carry = sum / 10;
			
			tempResult.next = temp;
			tempResult = tempResult.next;
		}
		
		if(carry>0) {
			tempResult.next  = new ListNode(carry);
		}
		
		while(res != null)
		{
			System.out.print(res.data+", ");
			res = res.next;
		}

	}

}
