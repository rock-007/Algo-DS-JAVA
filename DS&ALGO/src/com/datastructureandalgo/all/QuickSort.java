/**
 * 
 */
package com.datastructureandalgo.all;

/**
 * @author Umair
 *
 */
public class QuickSort {

    /**
     * @param argsb
     */
    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

    }

    public static void quickSort(int[] input, int start, int end) {

        if (end - start < 2) { // one element array check
            return;
        }
        // otherwise find the pivot index
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex, end);
    }

    public static int partition(int[] input, int start, int end) {
        int pivot = input[start];

        int i = start;
        int j = end;
while(i<j) {
    while(i<j && input[--j]>= pivot);
    
    
}
    }
}
