package interview_practice.leetcode;



public class RotateList61 {

	
	public static class ListNode{
		int val;
		ListNode next;
		
		ListNode(){}
		ListNode(int val){
			this.val = val;
			this.next = null;
		}
	}
	
	public static int getSize(ListNode head) {
		int cnt = 0;
		while(head != null)
		{
			cnt++;
			head = head.next;
		}
		return cnt;
	}
	
	public static ListNode insertArray(int[] ar)
	{
		
		ListNode head = null;
		ListNode temp = null;
		for(int i = 0; i < ar.length; i++) {
			ListNode node = new ListNode(ar[i]);
			if(head == null)
			{
				temp = node;
				head = temp;
			}
			else {
				temp.next = node;
				temp = temp.next;
			}
			
		}
		
		return head;
	}
	
	public static ListNode reverseNode(ListNode head, int k)
	{
		int len = getSize(head);
		
		if(len == 0) return head;
		
		k = k % len;
		
		k = len - k;
		
		ListNode tempRes = null, res = null, temp = head;
		
		
		int i = 0;
		
		while(i<len)
		{
			i++;
			
			if(i == k)
			{
				tempRes = head.next;
				res = tempRes;
				head.next = null;
			}
			else {
				if(res == null) {
					head = head.next;
				}
				else {
					if(tempRes.next != null)
						tempRes = tempRes.next;
				}
			}
		}
		
		if(res == null) return temp;
		tempRes.next = temp;
		return res;
	}
	
	public static void printList(ListNode head)
	{
		while(head != null) {
			System.out.print(head.val+" ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
//		int[] ar = {1,2,3,4,5,6};
//		int[] ar = {0, 1, 2};
		int[] ar = {1, 2, 3, 4, 5};
		ListNode head = insertArray(ar);
		printList(head);
		
		head = reverseNode(head, 2);
		printList(head);
	}

}
