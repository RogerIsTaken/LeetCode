package test.pers.rogerjin.LeetCode.Solution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import pers.rogerjin.LeetCode.Solution.Array.OneAndTwoChars;

/** 
* OneAndTwoChars Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®ÔÂ 30, 2017</pre> 
* @version 1.0 
*/ 
public class OneAndTwoCharsTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: isOneBitCharacter(int[] bits) 
* 
*/ 
@Test
public void testIsOneBitCharacter() throws Exception { 
//TODO: Test goes here...
    OneAndTwoChars oat = new OneAndTwoChars();
    int[] bits = {1,1,0};
    Assert.assertTrue(oat.isOneBitCharacter(bits));
} 


} 
