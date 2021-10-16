package com.generics.max;

import org.junit.Assert;
import org.junit.Test;
public class MaxTest {

	@Test
	public void integerMax() {
        int actualResult = Maximum.findMaximum(8,10,6);
        Assert.assertEquals(10,actualResult);
    }

	@Test
	public void floatMax() {
        float actualResult = Maximum.findMaximum(7.42f,8.6f,3.4f);
        Assert.assertEquals(8.6f,actualResult,0.0);
    }

    @Test
    public void StringMax() {
        String actualResult = Maximum.findMaximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach",actualResult);
    }

}
