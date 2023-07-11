package Assignment;

import java.util.Arrays;

public class BubbleSort {
	
	    public static void main(String[] args) {
	        int[] arr = {5, 2, 8, 12, 1, 6};

	        System.out.println("Array before sorting: " + Arrays.toString(arr));

	        bubbleSort(arr);

	        System.out.println("Array after sorting: " + Arrays.toString(arr));
	    }

	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        boolean swapped;

	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;

	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap elements
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }

	            // If no two elements were swapped in the inner loop, the array is already sorted
	            if (!swapped) {
	                break;
	            }
	        }
	    }
	}


