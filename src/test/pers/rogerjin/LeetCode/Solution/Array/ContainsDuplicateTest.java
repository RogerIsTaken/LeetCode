package test.pers.rogerjin.LeetCode.Solution.Array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import pers.rogerjin.LeetCode.Solution.Array.ContainsDuplicate;

/**
 * ContainsDuplicate Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Ê®Ò»ÔÂ 1, 2017</pre>
 */
public class ContainsDuplicateTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: containsDuplicate(int[] nums)
     */
    @Test
    public void testContainsDuplicate() throws Exception {
//TODO: Test goes here...
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = {3, 3};
        Assert.assertTrue(cd.containsDuplicate(nums));
    }


} 
