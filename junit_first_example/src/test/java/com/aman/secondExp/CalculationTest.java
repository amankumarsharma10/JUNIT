package com.aman.secondExp;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Aman on 28-12-2016.
 */
public class CalculationTest {

    Calculation calculation = new Calculation();
    int[] arr1 = {1,3,5,4,2};
    int[] arr2 = {-12,-1,-3,-4,-2};
    @Test
    public void testFindMaximum(){
        System.out.println("test case Calculation");
        Assert.assertEquals(5,calculation.findMaximum(arr1));
        Assert.assertEquals(-1,calculation.findMaximum(arr2));
    }
}
