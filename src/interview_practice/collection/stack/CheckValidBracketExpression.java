package interview_practice.collection.stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckValidBracketExpression {
	
	
	/*
	 *  Stack is a linear data structure that is used to store the collection of objects. It is based on Last-In-First-Out (LIFO).
	 *  
	 *  Java collection framework provides many interfaces and classes to store the collection of objects. One of them is the stack class that
	 *  provides different operation such as push, pop, search and etc.
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args) {
		
		
		Stack<Character> st = new Stack<>();
		
		
		Scanner sc = new Scanner(System.in);
		
		String bracket = sc.next();
		boolean isValid = true;
		for(int i=0; i<bracket.length(); i++) {
			
			if(bracket.charAt(i) == '(' || bracket.charAt(i) == '{' || bracket.charAt(i) == '[') {
				st.push(bracket.charAt(i));
			}
			else {
				if(st.isEmpty()) {
					isValid = false;
					break;
				}
				else {
					char ch = st.peek();
					if((ch == '[' && bracket.charAt(i) == ']') ||  (ch == '{' && bracket.charAt(i) == '}') || (ch == '(' && bracket.charAt(i) == ')')) {
						st.pop();
					}else {
						isValid = false;
					}
				}
			}
			
		}
		
		
		
		if(!isValid) {
			System.out.println("Invalid bracket expression");
		}
		else if(st.isEmpty()) {
			System.out.println("Valid bracket expression");
		}
		else {
			System.out.println("Invalid bracket expression");
		}
		
		sc.close();
	}
	

}
