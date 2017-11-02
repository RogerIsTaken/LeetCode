package test.pers.rogerjin.LeetCode.Solution.Array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import pers.rogerjin.LeetCode.Solution.Array.MaximumSwap;

/**
 * MaximumSwap Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Ê®Ò»ÔÂ 1, 2017</pre>
 */
public class MaximumSwapTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: maximumSwap(int num)
     */
    @Test
    public void testMaximumSwap() throws Exception {
//TODO: Test goes here...
        MaximumSwap ms = new MaximumSwap();
        int num = 2736;
        Assert.assertEquals(7236, ms.maximumSwap(num));
    }


} 
