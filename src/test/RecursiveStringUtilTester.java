package test;

import main.recursion.RecursiveStringUtil;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/** Contains JUnit tests for class RecursiveStringUtil */
public class RecursiveStringUtilTester {

    @Test
    public void testCheckNestedParenthesesSimpleFalse() {
        boolean res = RecursiveStringUtil.checkNestedParentheses("(");
        System.out.println(res);
        boolean expected = false;
        System.out.println(expected);
        assertTrue("checkNestedParentheses returns true for ( which is incorrect", expected == res);

    }

    @Test
    public void testCheckNestedParenthesesSimpleTrue() {
        boolean res = RecursiveStringUtil.checkNestedParentheses("()");
        System.out.println(res);
        boolean expected = true;
        System.out.println(expected);
        assertTrue("checkNestedParentheses returns false for () which is incorrect", expected == res);
    }

    @Test
    public void testCheckNestedParenthesesMediumTrue() {
        boolean res = RecursiveStringUtil.checkNestedParentheses("((()))");
        System.out.println(res);
        boolean expected = true;
        System.out.println(expected);
        assertTrue("checkNestedParentheses returns false for ((())) which is incorrect", expected == res);
    }

    @Test
    public void testCheckNestedParenthesesMediumFalse() {
        boolean res = RecursiveStringUtil.checkNestedParentheses("((())");
        System.out.println(res);
        boolean expected = false;
        System.out.println(expected);
        assertTrue("checkNestedParentheses returns true for ((()) which is incorrect", expected == res);
    }

    @Test
    public void testCheckNestedParenthesesLongerFalse() {
        boolean res = RecursiveStringUtil.checkNestedParentheses("(()(())())");
        System.out.println(res);
        boolean expected = false;
        System.out.println(expected);
        assertTrue("checkNestedParentheses returns true for (()(())()) which is incorrect", expected == res);
    }

    @Test
    public void testCheckNestedParenthesesLongerTrue() {
        boolean res = RecursiveStringUtil.checkNestedParentheses("((((((((()))))))))");
        System.out.println(res);
        boolean expected = true;
        System.out.println(expected);
        assertTrue("checkNestedParentheses returns false for ((((((((())))))))) which is incorrect", expected == res);
    }

    @Test
    public void testRemoveAdjacentDuplicatesSimple() {
        String res = RecursiveStringUtil.removeAdjacentDuplicates("parallel");
        System.out.println(res);
        String expected = "paralel";
        System.out.println(expected);
        assertTrue("removeAdjacentDuplicates is incorrect", res.equals(expected));
    }

    @Test
    public void testRemoveAdjacentDuplicatesNoDuplicates() {
        String res = RecursiveStringUtil.removeAdjacentDuplicates("holidays");
        System.out.println(res);
        String expected = "holidays";
        System.out.println(expected);
        assertTrue("removeAdjacentDuplicates is incorrect", res.equals(expected));
    }

    @Test
    public void testRemoveAdjacentDuplicatesNonAdjacentDuplicates() {
        String res = RecursiveStringUtil.removeAdjacentDuplicates("racecar");
        System.out.println(res);
        String expected = "racecar";
        System.out.println(expected);
        //System.out.println(res);
        assertTrue("removeAdjacentDuplicates is incorrect", res.equals(expected));
    }

    @Test
    public void testRemoveAdjacentDuplicatesDifficult() {
        String res = RecursiveStringUtil.removeAdjacentDuplicates("abbyccusgggggt");
        System.out.println(res);
        String expected = "abycusgt";
        System.out.println(expected);
        //System.out.println(res);
        assertTrue("removeAdjacentDuplicates is incorrect", res.equals(expected));
    }
}