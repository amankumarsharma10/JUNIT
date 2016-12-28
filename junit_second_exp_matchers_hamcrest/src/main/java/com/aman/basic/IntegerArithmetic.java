package com.aman.basic;

/**
 * Created by Aman on 28-12-2016.
 */
public class IntegerArithmetic {

    public int multiplyIntegers(final int firstInteger, final int secondInteger, final int ... integers)
    {
        int returnInt = firstInteger * secondInteger;
        for (final int integer : integers)
        {
            returnInt *= integer;
        }
        return returnInt;
    }
}
