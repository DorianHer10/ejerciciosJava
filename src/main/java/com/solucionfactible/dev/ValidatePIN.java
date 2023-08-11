package com.solucionfactible.dev;

/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything
 * but exactly 4 digits or exactly 6 digits. If the function is passed a valid
 * PIN string, return true, else return false.
 *
 * @author developer
 */
public class ValidatePIN {

    public static boolean isValid(String pin) {

        int size = pin.length();

        if (size == 4 | size == 6) {
            for (int i = 0; i < size; i++) {
                char c = pin.charAt(i);
                if (!(c >= '0' && c <= '9')) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
    
}
