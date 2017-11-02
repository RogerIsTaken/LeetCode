package test.pers.rogerjin.LeetCode.Solution.Array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import pers.rogerjin.LeetCode.Solution.Array.TwoSum;

import java.util.Arrays;

/**
 * TwoSum Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ʮ�� 15, 2017</pre>
 */
public class TwoSumTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: solution(int[] nums, int target)
     */
    @Test
    public void testSolution() throws Exception {
//TODO: Test goes here...
        int[] nums = {0, 1, 2};
        int[] answer = {2, 3};
        int target = 3;
        TwoSum ts = new TwoSum();
        Assert.assertArrayEquals(ts.solution(nums, target), answer);


    }


} 
