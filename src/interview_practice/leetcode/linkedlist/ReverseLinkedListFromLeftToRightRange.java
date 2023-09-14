package interview_practice.leetcode.linkedlist;

import java.util.Scanner;

public class ReverseLinkedListFromLeftToRightRange {
	
	
	private static class ListNode{
		
		int data;
		ListNode next;
		
		ListNode(int data){
			this.data = data;
		}
		
	}
	
	public static void print(ListNode head)
	{
		while(head != null)
		{
			System.out.print(head.data+", ");
			head = head.next;
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		
		
		ListNode node1 = new ListNode(32);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(-21);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(3);
		ListNode node6 = new ListNode(54);
		ListNode node7 = new ListNode(43);
		ListNode node8 = new ListNode(33);
		ListNode node9 = new ListNode(6);
		ListNode node10 = new ListNode(90);
		ListNode node11 = new ListNode(-3);
		ListNode node12 = new ListNode(90);
		ListNode node13 = new ListNode(8);
		
		ListNode head = node1;
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;
		node10.next = node11;
		node11.next = node12;
		node12.next = node13;
		
		int left=2, right=12;
		
		print(head);
		
		ListNode tempHead = head, leftSide = null, rightSide = null,rangeLeft=null;
		
		int cnt = 1;
		ListNode res = head;
		while(cnt<left)
		{
			cnt++;
			leftSide = tempHead;
			tempHead = tempHead.next;
		}
		
		ListNode prev = null, curr=null;
		while(left<=right)
		{
			if(left == cnt) {
				rangeLeft = tempHead;
			}
			left++;
			
			curr = tempHead;
			tempHead = tempHead.next;
			
			if(prev == null) {
				prev = curr;
				prev.next=null;
			}
			else {
				curr.next = prev;
				prev = curr;
			}
		}
		
		if(leftSide != null) {
			leftSide.next = prev;
		}else {
			res = prev;
		}
		
		if(tempHead != null){
			rightSide = tempHead;
			rangeLeft.next = rightSide;
		}
		
		print(head);
		print(res);
		
		


	}

}
