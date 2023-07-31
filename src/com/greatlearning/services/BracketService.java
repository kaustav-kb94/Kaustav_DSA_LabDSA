package com.greatlearning.services;

import java.util.Stack;

public class BracketService {

	public boolean isBracketBlanaced(String expression) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<expression.length(); i++) {
			char ch = expression.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				stack.push(ch);				
			}else if(ch==')' || ch=='}' || ch==']') {
				if(stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty()?true:false;
	}

}
