package com.solucionfactible.dev;

/**
 * comp checks whether the two arrays have the "same" elements, with the same
 * multiplicities. "Same" means, here, that the elements in b are the elements
 * in a squared, regardless of the order.
 *
 * @author developer
 */
public class AreSame {

    public static boolean comp(int[] a, int[] b) {
        int cont = 0;
        int squared = 0;
        for (int elementA : a) {
            squared = elementA * elementA;
            for (int elementB : b) {
                if (squared == elementB) {
                    cont += 1;
                    break;
                }
            }
        }
        if (cont == a.length) 
            return true;
        return false;
    }
     
}
