package ch.noseryoung.blj;

import java.util.HashSet;
import java.util.Set;

public class TypeConverter {

    /**
     * This method converts a String to a Short.
     * Accepted Values are:
     * - (only at first place)
     * _ and ' (10_000 and 10'000 are equal to 10000)
     * numbers 0-9
     *
     * @param toConvert String to be converted
     * @return converted short
     * @throws IllegalArgumentException if String cannot be converted
     * @author Filip und Nikola
     */
    public static short convertStringToShort(String toConvert) throws IllegalArgumentException {
        if ((!toConvert.contains("-") || toConvert.startsWith("-")) && toConvert.matches("[-_'0-9]+")) {
            toConvert = toConvert.replaceAll("[_'-]", "");
            Short convertedNum = Short.parseShort(toConvert);
            return convertedNum;
        } else {
            throw new IllegalArgumentException("Illegal characters in String");
        }

    }

    /**
     * This method converts a String to a Double.
     * Accepted Values are:
     * - (only at first place)
     * _ and ' (10_000 and 10'000 are equal to 10000)
     * . and , for decimal (only one allowed)
     * numbers 0-9
     *
     * @param toConvert String to be converted
     * @return converted Double
     * @throws IllegalArgumentException if String cannot be converted
     * @author <todo: Name of author>
     */
    public static double convertStringToDouble(String toConvert) throws IllegalArgumentException {
        if ((!toConvert.contains("-") || toConvert.startsWith("-")) && toConvert.matches("[-.,_'0-9]+")) {
            int count = toConvert.length() - toConvert.replaceAll("[.,]", "").length();
            if (count <= 1) {
                toConvert = toConvert.replaceAll("[_'-]", "");
                Double convertedNum = Double.parseDouble(toConvert);
                return convertedNum;
            }
        }
        throw new IllegalArgumentException("Illegal characters in String");

    }

    /**
     * This method converts a String to a Long.
     * Accepted Values are:
     * - (only at first place)
     * _ and ' (10_000 and 10'000 are equal to 10000)
     * numbers 0-9
     *
     * @param toConvert String to be converted
     * @return converted long
     * @throws IllegalArgumentException if String cannot be converted
     * @author <todo: Name of author>
     */
    public static Long convertStringToLong(String toConvert) throws IllegalArgumentException {
        if ((!toConvert.contains("-") || toConvert.startsWith("-")) && toConvert.matches("[-_'0-9]+")) {
            toConvert = toConvert.replaceAll("[_'-]", "");
            Long convertedNum = Long.parseLong(toConvert);
            return convertedNum;
        } else {
            throw new IllegalArgumentException("Illegal characters in String");
        }
    }

    /**
     * This method converts a String to a lowercase Char Array.
     * Accepted Values are:
     * - (only after second place and before second last place, e.g. ge-laufen is ok, g-elaufen is not ok)
     * letters a-z and A-Z
     *
     * @param toConvert String to be converted
     * @return converted Char Array
     * @throws IllegalArgumentException if String cannot be converted
     * @author <todo: Name of author>
     */
    public static char[] StringToCharArray(String toConvert) throws IllegalArgumentException {
        char[] charArr = new char[toConvert.length()];
        if (toConvert.contains("-") && toConvert.indexOf("-") != 2){
            throw new IllegalArgumentException("Illegal characters in String");
        }
        for (int i = 0; i < toConvert.length(); i++){
            charArr[i] = toConvert.toLowerCase().charAt(i);
        }
        return charArr;
    }

    /**
     * This method converts a String to a lowercase Char Array.
     * Accepted Values are:
     *    - (only after second place and before second last place, e.g. ge-laufen is ok, g-elaufen is not ok)
     *    letters a-z and A-Z
     *    each letter is allowed only once
     *
     * @param toConvert String to be converted
     * @return converted Char Array
     * @throws IllegalArgumentException if String cannot be converted
     *
     * @author <todo: Name of author>
     */
    public static Set<Character> StringToCharSet(String toConvert){
        HashSet<Character> charSet = new HashSet<Character>();
        if (toConvert.contains("-") && toConvert.indexOf("-") != 2){
            throw new IllegalArgumentException("Illegal characters in String");
        }
        for (int i = 0; i < toConvert.length(); i++){
            charSet.add(toConvert.toLowerCase().charAt(i));
        }
        return charSet;
    }

}
