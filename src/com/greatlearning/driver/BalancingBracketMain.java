package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.services.BracketService;

public class BalancingBracketMain {

	public static void main(String[] args) {
		
		BracketService bracketService = new BracketService();
		Scanner sc = new Scanner(System.in);
		System.out.println("Sample Input");
		System.out.println();
				
		String expression = sc.nextLine();
		
		System.out.println();
		boolean result = bracketService.isBracketBlanaced(expression);
		System.out.println("Sample Output");
		System.out.println();
		if(result) {
			System.out.println("The entered String has Balanced Brackets");			
		}else {
			System.out.println("The entered String does not contains Balanced Brackets");			
		}	
		
		sc.close();

	}

}
