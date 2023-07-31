package com.greatlearning.driver;


import com.greatlearning.model.Node;


public class BinarySearchTreeMain {
	
	public static void main(String[] args) {
				
		Node root = new Node();	
		
		root = root.insert(root, 40);
		root = root.insert(root, 20);
		root = root.insert(root, 60);
		root = root.insert(root, 10);
		root = root.insert(root, 30);
		root = root.insert(root, 50);
		root = root.insert(root, 70);
		root.inOrderTraverse(root);
		int givenSum = 130;
		System.out.println("Sum = " + givenSum);
		root.findPairWithGivenSum(root, givenSum);

	}

}
