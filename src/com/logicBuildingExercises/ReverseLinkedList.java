package com.logicBuildingExercises;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next= new Node(20);
		head.next.next= new Node(30);
		traverseLinkedList(head);
		traverseLinkedList(reverseLinkedList(head));

	}

	private static Node reverseLinkedList(Node head) {
		Node current=head;
		Node next=null;
		Node prev=null;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		return prev;
	}
	
	private static void traverseLinkedList(Node head) {
		System.out.println("");
		Node current=head;
		while(current!=null) {
			System.out.print(current.getData()+" ");
			current=current.next;
		}	
	}
}
