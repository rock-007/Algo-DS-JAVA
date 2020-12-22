/**
* 
*/
package com.datastructureandalgo.all;

/**
 * @author Umair
 * 
 */
public class selectionSort {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] arrayInt = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortedIndex = arrayInt.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int tempHighIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {

                if (arrayInt[tempHighIndex] > arrayInt[i]) {

                } else {
                    tempHighIndex = i;
                }

                replace(arrayInt, tempHighIndex, lastUnsortedIndex);

            }

        
        }
        for (int i = 0; i < arrayInt.length; i++) {

            System.out.println(arrayInt[i]);

            // TODO Auto-generated method stub

        }
    }

    /**
     * @param arrayInt
     * @param tempHighIndex
     * @param lastUnsortedArray
     */
    private static void replace(int[] arrayInt, int tempHighIndex, int lastUnsortedArray) {
        // TODO Auto-generated method stub

        int tmp = arrayInt[lastUnsortedArray];
        arrayInt[lastUnsortedArray]=arrayInt[tempHighIndex];
        arrayInt[tempHighIndex] = tmp;
    }

}
