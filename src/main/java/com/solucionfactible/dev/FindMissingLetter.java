package com.solucionfactible.dev;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input
 * and that returns the missing letter in the array. You will always get an
 * valid array. And it will be always exactly one letter be missing. The length
 * of the array will always be at least 2.The array will always contain letters
 * in only one case. (Use the English alphabet with 26 letters)
 *
 * @author developer
 */
public class FindMissingLetter {

    public static char findMissingLetter(char[] array) {
        char letter;
        int cont = 0, reference = 0;
        boolean flag = false, isUpperCase = false;

        for (char i = 'a'; i <= 'z'; i++) {

            for (int j = cont; j < array.length; j++) {

                if ((Character.isUpperCase(array[j]))) {
                    isUpperCase = true;
                }
                if (i == Character.toLowerCase(array[j])) {
                    cont += 1;
                    flag = true;
                }
                if (flag == true) {
                    reference += 1;
                    if (cont == reference) {
                        break;
                    }
                }
                if (cont != reference) {
                    letter = i;
                    if (isUpperCase == true) {
                        return Character.toUpperCase(letter);
                    } else {
                        return letter;
                    }
                }
            }
        }

        return ' ';
    }
  
}
