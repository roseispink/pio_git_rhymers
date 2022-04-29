package edu.kis.vh.nursery.list;

public class Node {

	private int value;
	Node prev;
	private Node next;

	public Node(int i) {
		setValue(i);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
