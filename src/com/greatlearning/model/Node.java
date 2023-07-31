package com.greatlearning.model;

import java.util.HashSet;
import java.util.Set;

public class Node {
	
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}

	public Node() {
	}

	public Node insert(Node node, int key) {
		// if tree is empty return new Node
				if (node == null) {
					node = new Node(key);
					return node;
				}
				// otherwise recur down the tree
				if (key < node.data) {
					node.left = insert(node.left, key);					
				}
				else if (key > node.data) {
					node.right = insert(node.right, key);					
				}
				return node;
	}

	public void inOrderTraverse(Node root) {		
		if (root == null) {
			return;
		}	
		inOrderTraverse(root.left);
		inOrderTraverse(root.right);		
	}

	public void findPairWithGivenSum(Node root, int givenSum) {
		Set<Integer> sumSet = new HashSet<>();
		if (!findPair(root, givenSum, sumSet)) {
			System.out.println("Nodes are not found");
		}
		
	}

	private boolean findPair(Node root, int givenSum, Set<Integer> sumSet) {
		
		if (root == null) {
			return false;			
		}

		int diff = givenSum - root.data;
		
		if (sumSet.contains(diff)) {
			System.out.println("Pair is (" + diff + ", " + root.data + ")");
			return true;
		}
		else {
			sumSet.add(root.data);			
		}

		if (findPair(root.left, givenSum, sumSet)) {
			return true;			
		}


		return findPair(root.right, givenSum, sumSet);
	}
	

}
