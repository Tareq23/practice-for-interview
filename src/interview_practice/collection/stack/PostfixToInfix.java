package interview_practice.collection.stack;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfix {
	
	
	/*
	 * 
	 * A postfix expression is a collection of operators and operand which the operator is placed after the operands. 
	 * 
	 * Postfix: ab*cd*+
	 * Infix: ((a*b)+(c*d))
	 * 
	 * */
	
	static boolean isOperand(char x) {
		return ((x>='a' && x<='z') || (x>='A' && x<='Z'));
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String postfix = sc.next();
		
		Stack<String> st = new Stack<String>();
		
		for(int i=0; i<postfix.length(); i++) {
			
			if(isOperand(postfix.charAt(i))) {
				st.push(postfix.charAt(i)+"");
			}
			else {
				String ch1 = st.peek();
				st.pop();
				String ch2 = st.peek();
				st.pop();
				st.push("("+ch1+postfix.charAt(i)+ch2+")");
			}
			
		}
		
		StringBuffer tempInfix = new StringBuffer(st.peek());
		
		StringBuffer infix = new StringBuffer();
		tempInfix.reverse();
		
		for(int i=0; i<tempInfix.length(); i++) {
			if(tempInfix.charAt(i) == ')') {
				infix.append("(");
			}
			else if(tempInfix.charAt(i) == '(') {
				infix.append(")");
			}
			else {
				infix.append(tempInfix.charAt(i));
			}
		}
		
		
		
		System.out.println("Infix: "+infix);
		
	}

}
