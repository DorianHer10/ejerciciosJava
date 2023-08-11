package com.solucionfactible.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * diff subtracts one list from another and returns the result. It should remove
 * all values from list a, which are present in list b keeping their order.
 *
 * @author developer
 */
public class ArrayDiff {

    public static int[] diff(int[] a, int[] b) {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        boolean isInArray;

        for (int i = 0; i < a.length; i++) {
            isInArray = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    isInArray = true;
                }
            }
            if (isInArray == false) {
                listA.add(a[i]);
            }
        }

        int[] newArray = new int[listA.size()];
        int i = 0;
        for (int elementA : listA) {
            newArray[i] = elementA;
            i++;
        }
        return newArray;
        
    }
   
}
