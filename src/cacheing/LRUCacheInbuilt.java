package cacheing;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCacheInbuilt {

	Integer capacity;
	
	// List will contains keys
	LinkedList<Integer> list = null;
	// Map will have entries as <Key, Value>
	Map<Integer, Integer> map = null;
	
	public LRUCacheInbuilt(Integer capacity) {
		this.capacity = capacity;
		list = new LinkedList<>();
		map = new HashMap<>();
	}
	
	public Integer get(Integer key) {
		if (!list.contains(key))
			return -1;
		Integer value = map.get(key);
		list.remove(key);
		list.addFirst(key);
		return value;
	}
	
	public void put(Integer key, Integer value) {
		if (list.contains(key)) {
			list.remove(key);
		}
		if (list.size() >= capacity) {
			Integer deletedKey = list.removeLast();
			map.remove(deletedKey);
		}
		list.addFirst(key);
		map.put(key, value);
		
	}
	
	void print() {
		System.out.print(list);
		System.out.print(" --- ");
		System.out.println(map);
	}
	
}
