package com.generics.max;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

	@Test
	public void integerMax_AtFirstPosition() {
        int actualResult = Maximum.findMaximum(10,8,6);
        Assert.assertEquals(10,actualResult);
    }

}
