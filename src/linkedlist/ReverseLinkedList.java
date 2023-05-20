package linkedlist;

class Node {
	int data = 0;;
	Node next = null;
	Node(int data) {
		this.data = data;
	}
}

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		Node head = new Node(5);
		head.next = new Node(10);
		head.next.next = new Node(3);
		head.next.next.next = new Node(100);
		print(head);
		print(reverse(head));
	}
	
	private static void print(Node head) {
		while(head != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println();
	}

	public static Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

}

