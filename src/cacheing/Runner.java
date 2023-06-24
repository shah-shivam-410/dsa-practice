package cacheing;

public class Runner {

	public static void main(String[] args) {

		//LRU cache working
		LRUCache cache = new LRUCache(3);
		cache.put(1, 10);
		cache.print();
		cache.put(3, 15);
		cache.print();
		cache.put(2, 17);
		cache.print();
		System.out.println(cache.get(1));
		cache.print();
		cache.put(4, 20);
		cache.print();
		System.out.println(cache.get(2));
		cache.print();
		cache.put(4, 25);
		System.out.println(cache.get(7));
		cache.print();

	}

}
