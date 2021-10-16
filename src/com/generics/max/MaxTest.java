package com.generics.max;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

	@Test
	public void floatMax_AtFirstPosition() {
        float actualResult = Maximum.findMaximum(8.6f,7.42f,3.4f);
        Assert.assertEquals(8.6f,actualResult,0.0);
    }
	
	@Test
	public void floatMax_AtSecondPosition() {
        float actualResult = Maximum.findMaximum(7.42f,8.6f,3.4f);
        Assert.assertEquals(8.6f,actualResult,0.0);
    }
	
	@Test
	public void floatMax_AtThirdPosition() {
        float actualResult = Maximum.findMaximum(3.4f,7.42f,8.6f);
        Assert.assertEquals(8.6f,actualResult,0.0);
    }

}
