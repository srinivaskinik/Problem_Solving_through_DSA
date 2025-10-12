package com.logicBuildingExercises;

public class LinkedListRunner {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next= new Node(20);
		head.next.next= new Node(30);
		traverseLinkedList(head);
	}

	private static void traverseLinkedList(Node head) {
		Node current=head;
		while(current!=null) {
			System.out.println(current.getData());
			current=current.next;
		}	
	}
}
