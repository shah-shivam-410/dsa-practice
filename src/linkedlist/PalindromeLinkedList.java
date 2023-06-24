package linkedlist;

public class PalindromeLinkedList {

	static class Node {
		int val;
		Node next;

		Node() {
		}

		Node(int val) {
			this.val = val;
		}

		Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(5);
		head.next = new Node(10);
		head.next.next = new Node(3);
		head.next.next.next = new Node(100);
		print(head);
//		print(reverse(head));
		isPalindrome(head);
	}

	static void print(Node head) {
		while (head != null) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
		System.out.println();
	}

	static Node findMid(Node head) {
		Node fast = head;
		Node slow = head;
		while (fast.next != null) {
			if (fast.next.next != null) {
				fast = fast.next.next;
			}
			slow = slow.next;
		}
		return slow;
	}

	static Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	static boolean isPalindrome(Node head) {
		System.out.println("Inside check prelindropme");
		Node mid = findMid(head);
		Node rev = reverse(mid.next);
		print(rev);
		print(head);
		while (rev != null) {
			if (head.val != rev.val) {
				System.out.println(false);
				return false;
			}
		}
		System.out.println(true);
		return true;
	}
}
