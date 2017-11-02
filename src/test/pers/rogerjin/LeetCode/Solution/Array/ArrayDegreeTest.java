package test.pers.rogerjin.LeetCode.Solution.Array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import pers.rogerjin.LeetCode.Solution.Array.ArrayDegree;

/**
 * ArrayDegree Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Ê®ÔÂ 28, 2017</pre>
 */
public class ArrayDegreeTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: findShortestSubArray(int[] nums)
     */
    @Test
    public void testFindShortestSubArray() throws Exception {
//TODO: Test goes here...
        ArrayDegree ad = new ArrayDegree();
        int[] nums ={2,1,1,2,1,3,3,3,1,3,1,3,2};
        Assert.assertEquals(7, ad.findShortestSubArray(nums));
    }


} 
