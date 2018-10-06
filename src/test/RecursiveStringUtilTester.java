package test;

import main.recursion.RecursiveStringUtil;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/** Contains JUnit tests for class RecursiveStringUtil */
public class RecursiveStringUtilTester {

    @Test
    public void testCheckNestedParenthesesSimpleFalse() {
        boolean res = RecursiveStringUtil.checkNestedParentheses("(");
        boolean expected = false;
        assertTrue("checkNestedParentheses returns true for ( which is incorrect", expected == res);

    }

    @Test
    public void testCheckNestedParenthesesSimpleTrue() {
        boolean res = RecursiveStringUtil.checkNestedParentheses("()");
        boolean expected = true;
        assertTrue("checkNestedParentheses returns false for () which is incorrect", expected == res);
    }

    @Test
    public void testCheckNestedParenthesesMediumTrue() {
        boolean res = RecursiveStringUtil.checkNestedParentheses("((()))");
        boolean expected = true;
        assertTrue("checkNestedParentheses returns false for ((())) which is incorrect", expected == res);
    }

    @Test
    public void testCheckNestedParenthesesMediumFalse() {
        boolean res = RecursiveStringUtil.checkNestedParentheses("((())");
        boolean expected = false;
        assertTrue("checkNestedParentheses returns true for ((()) which is incorrect", expected == res);
    }

    @Test
    public void testCheckNestedParenthesesLongerFalse() {
        boolean res = RecursiveStringUtil.checkNestedParentheses("(()(())())");
        boolean expected = false;
        assertTrue("checkNestedParentheses returns true for (()(())()) which is incorrect", expected == res);
    }

    @Test
    public void testCheckNestedParenthesesLongerTrue() {
        boolean res = RecursiveStringUtil.checkNestedParentheses("((((((((()))))))))");
        boolean expected = true;
        assertTrue("checkNestedParentheses returns false for ((((((((())))))))) which is incorrect", expected == res);
    }

    @Test
    public void testRemoveAdjacentDuplicatesSimple() {
        String res = RecursiveStringUtil.removeAdjacentDuplicates("parallel");
        String expected = "paralel";
        assertTrue("removeAdjacentDuplicates is incorrect", res.equals(expected));
    }

    @Test
    public void testRemoveAdjacentDuplicatesNoDuplicates() {
        String res = RecursiveStringUtil.removeAdjacentDuplicates("holidays");
        String expected = "holidays";
        assertTrue("removeAdjacentDuplicates is incorrect", res.equals(expected));
    }

    @Test
    public void testRemoveAdjacentDuplicatesNonAdjacentDuplicates() {
        String res = RecursiveStringUtil.removeAdjacentDuplicates("racecar");
        String expected = "racecar";
        //System.out.println(res);
        assertTrue("removeAdjacentDuplicates is incorrect", res.equals(expected));
    }

    @Test
    public void testRemoveAdjacentDuplicatesDifficult() {
        String res = RecursiveStringUtil.removeAdjacentDuplicates("abbyccusgggggt");
        String expected = "abycusgt";
        //System.out.println(res);
        assertTrue("removeAdjacentDuplicates is incorrect", res.equals(expected));
    }
}