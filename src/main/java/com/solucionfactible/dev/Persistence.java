package com.solucionfactible.dev;

/**
 * persistence takes in a positive parameter num and returns its multiplicative
 * persistence, which is the number of times you must multiply the digits in num
 * until you reach a single digit.
 *
 * @author developer
 */
public class Persistence {

    public static int persistence(long num) {
        int cont = 0, total;
        int size = 0;
        char aux;

        do {
            total = 1;
            String str_num = String.valueOf(num);
            size = str_num.length();
            if (size == 1) {
                return cont;
            }
            for (int i = 0; i < size; i++) {
                aux = str_num.charAt(i);
                total *= Character.getNumericValue(aux);
            }
            num = total;
            cont += 1;
        } while (size > 1);
  
        return cont;
    }

}
