/**
 * 
 */
package com.datastructureandalgo.all;

/**
 * @author Umair
 *
 */
public class InsertionSort {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) { // here i>0 b/c we will comapre to each
                                                                                       // elelemt in sorted array till the
                                                                                       // index=0
                intArray[i] = intArray[i - 1]; // shift once

            }
            intArray[i] = newElement;// when we break out the for loop that means the i-1 index have lower value so index[i] is
                                     // filled iwth newelement and any iteams before index [i] is lower so no need to do to more
                                     // left
        }

        // TODO Auto-generated method stub
        for (int i = 0; i < intArray.length; i++) {

            System.out.println(intArray[i]);

            // TODO Auto-generated method stub

        }
    }

}
