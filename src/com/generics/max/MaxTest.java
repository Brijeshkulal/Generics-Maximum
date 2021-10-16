package com.generics.max;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

	@Test
	public void integerMax_AtFirstPosition() {
        int actualResult = Maximum.findMaximum(10,8,6);
        Assert.assertEquals(10,actualResult);
    }
	
	@Test
	public void integerMax_AtSecondPosition() {
        int actualResult = Maximum.findMaximum(8,10,6);
        Assert.assertEquals(10,actualResult);
    }
	
	@Test
	public void integerMax_AtThirdPosition() {
        int actualResult = Maximum.findMaximum(8,6,10);
        Assert.assertEquals(10,actualResult);
    }

}
