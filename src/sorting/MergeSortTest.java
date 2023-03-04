package sorting;

import java.util.Arrays;

/**
 * Leetcode 912. Sort an Array
 * https://leetcode.com/problems/sort-an-array/
 *
 * Given an array of integers nums, sort the array in ascending order and return
 * it.
 * 
 * You must solve the problem without using any built-in functions in O(nlog(n))
 * time complexity and with the smallest space complexity possible.
 */

public class MergeSortTest {

	public static void main(String[] args) {

		Integer[] arr = { 12, 3, 45, 76, 100, 4, 423, 67 };
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void merge(Integer[] arr, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = 0;
		Integer[] temp = new Integer[high - low + 1];

		while (i <= mid && j <= high) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		while (j <= high) {
			temp[k++] = arr[j++];
		}

		for (int l = 0; l < temp.length; l++) {
			arr[low + l] = temp[l];
		}

	}

	public static void mergeSort(Integer[] arr, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);

	}

}
