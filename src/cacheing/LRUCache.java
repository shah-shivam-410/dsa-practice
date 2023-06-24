package cacheing;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author SHIVAM SHAH
 * 
 * LRU - Least Recently User cache
 * get(K) - Get operation will return value associated with key and will make same key most recently used.
 * put(K,V) - Put operation will insert new element, if capacity is reached, 
 * 			  it will remove least recently used element, and will insert new element as most recently used.
 * Main data Structures: HashMap<Integer, Node>
 * 				         Node - represent doubly linked list with patameter: Key, Value, Previous and Next.
 */

public class LRUCache {

	class Node {
		Integer key;
		Integer value;
		Node next;
		Node prev;
		Node(Integer key, Integer value) {
			this.key = key;
			this.value = value;
		}
	}

	private Integer capacity = 3;
	Map<Integer, Node> map = new HashMap<>();
	private Node head = new Node(0, 0);
	private Node tail = new Node(0, 0);
	
	public LRUCache(Integer capacity) {
		this.capacity = capacity;
		head.next = tail;
		tail.prev = head;
	}

	public Integer get(Integer key) {
		if (!map.containsKey(key))
			return -1;
		Node node = map.get(key);
		remove(node);
		insert(node);
		return node.value;
	}

	public void put(Integer key, Integer value) {
		if (map.containsKey(key)) {
			remove(map.get(key));
		}
		if (map.size() >= capacity) {
			remove(tail.prev);
		}
		insert(new Node(key, value));
	}

	private void insert(Node node) {
		map.put(node.key, node);
		Node temp = head.next;
		head.next = node;
		node.prev = head;
		node.next = temp;
		temp.prev = node;
	}

	private void remove(Node node) {
		map.remove(node.key);
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}
	
	void print() {
		Node a = head;
		System.out.print("Head->");
		while(a.next != null) {
			System.out.print(a.key + "->");
			a = a.next;
		}
		System.out.print("Tail");
		System.out.println();
	}
}
