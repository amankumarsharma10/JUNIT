package com.aman.basic;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Aman on 28-12-2016.
 */
public class IntegerArithmeticTest {

    IntegerArithmetic arithmetic = new IntegerArithmetic();

    @Test
    public void testWithJUnitHamcrestEqualTo(){
        final int[] integers = {4, 5, 6, 7};
        final int expectedResult = 2 * 3 * 4 * 5 * 6 * 7;

        int result = arithmetic.multiplyIntegers(2,3,integers);

        Assert.assertThat(result, CoreMatchers.equalTo(expectedResult));
    }

    //Using Hamcrest sameInstance() with not()
    @Test
    public void testWithJUnitHamcrestNotSameInstance(){
        final int[] integers = {4, 5, 6, 7};
        final int expectedResult = 2 * 3 * 4 * 5 * 6 * 7;

        int result = arithmetic.multiplyIntegers(2,3,integers);

        Assert.assertThat(result,CoreMatchers.not(CoreMatchers.sameInstance(expectedResult)));

    //  Assert.assertThat(result,CoreMatchers.not(CoreMatchers.sameInstance(result)));// pass in this case both place result
    }

    //Using Hamcrest asDescribed() with sameInstance()
    @Test
    public void testWithJUnitHamcrestSameInstanceDescribedAs() {
        final int[] integers = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        final int expectedResult = 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 *13 * 14 * 15;
        final int result = arithmetic.multiplyIntegers(2, 3, integers);

      //  Assert.assertThat(result,CoreMatchers.describedAs("Not same object (different identity reference)",
       //         CoreMatchers.sameInstance(result)));
    }


}
