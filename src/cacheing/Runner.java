package cacheing;

public class Runner {

	public static void main(String[] args) {

		//LRU cache working
//		LRUCache cache = new LRUCache(3);
		LRUCacheInbuilt cache = new LRUCacheInbuilt(3);
		cache.put(1, 10);
		cache.print();
		cache.put(3, 15);
		cache.print();
		cache.put(2, 17);
		cache.print();
		cache.put(4, 20);
		cache.print();
		cache.put(4, 25);
		cache.print();
		cache.put(7, 100);
		cache.print();
		cache.put(2, 40);
		cache.print();

	}

}
