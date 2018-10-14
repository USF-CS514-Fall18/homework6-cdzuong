package main.recursion;

/** Includes several recursive methods for string processing.
 *  All methods in this class must be recursive and use no loops. */
public class RecursiveStringUtil {

    /**
     * Checks (recursively) if a given string of nested parentheses
     * is "valid". Parentheses must occur in pairs and be nested.
     * No other characters are allowed in the string. Method must be
     * recursive and use no loops.
     * Example: (())) is invalid.
     *         ((())) is valid
     * @param nestedParentheses string
     * @return true if parentheses in the string are nested correctly
     */
    public static boolean checkNestedParentheses(String nestedParentheses) {

            if (nestedParentheses.charAt(0) == nestedParentheses.charAt(nestedParentheses.length() - 1) && nestedParentheses.length() == 2) {
                return true;
            }
            checkNestedParentheses(nestedParentheses.substring(0, nestedParentheses.length() - 1));


        return false;
    }


    /**
     * Takes a string and returns a new string where if
     * adjacent characters are "duplicate", only one of these
     * characters is left in the string. Method must be recursive
     * and use no loops.
     * Example: if the input is "parallel", the output is "paralel";
     *          if the input is "abbyccusggggt", the output is "abycusgt"
     * @param str string
     * @return string without adjacent duplicates
     */
    public static String removeAdjacentDuplicates(String str) {
        String res;
        if(str.charAt(str.length() - 1) != str.charAt(str.length() - 2)) {
            res = removeAdjacentDuplicates(str.substring(0, str.length() - 1)) + str.charAt(str.length() - 1);
        }
        else {
            res = removeAdjacentDuplicates(str.substring(0, str.length() - 1));
        }
        return res;
    }

}
