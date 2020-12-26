/**
 * 
 */
package com.datastructureandalgo.all;

/**
 * @author Umair
 *
 */
public class MergSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        mergeSort(intArray, 0, intArray.length);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(input, start, mid); // start here is index=0 ,mid is last eleement +1 so need to subtract
        mergeSort(input, mid, end); // mid here is index=3 end is last elelemt +1 so need to subtract
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start]; // should be large engough to hold all array, then comare in i and j index and place
                                           // smaalest in the temp
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];

        }
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
