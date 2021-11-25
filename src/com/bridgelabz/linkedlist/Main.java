package com.bridgelabz.linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		//linkedList.insertAtPosition(2,80);
		linkedList.popLast();
		linkedList.search(30);
		linkedList.print();
	}
}
