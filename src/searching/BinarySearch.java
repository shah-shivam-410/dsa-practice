package searching;

/**
 * 
 * Binary search applies to sorted array only. Time complexity O(log n)
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { -5, -1, 30, 443, 1000, 89899 };
		System.out.println(binarySearch(arr, 1000, 0, arr.length-1));
	}

	public static int binarySearch(int[] arr, int targetVal, int low, int high) {
//		int low = 0;
//		int high = arr.length - 1;
		int count = 0;
		while (low <= high) {
			System.out.println("Count: " + count++);
			int mid = (low + high) / 2;
			if (arr[mid] == targetVal)
				return mid;
			else if (arr[mid] > targetVal)
				high = mid - 1;
			else if (arr[mid] < targetVal)
				low = mid + 1;
		}
		return -1;
	}
	
	// lower index is known, higher index is  infinite, orted array
	public static int infiniteSearch(int[] arr, int targetVal) {
		int low = 0; 
		int high = 1;
		while(arr[high] < targetVal) {
			low = high;
			high = high * 2; // log n complexity -> 2^n exponential growth
		}
		return binarySearch(arr, targetVal, low, high);		
	}
}
