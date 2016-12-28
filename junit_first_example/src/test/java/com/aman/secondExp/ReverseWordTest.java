package com.aman.secondExp;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Aman on 28-12-2016.
 */
public class ReverseWordTest {

    ReverseWord reverseWord = new ReverseWord();

    @Test
    public void testReverseWord(){
        System.out.println("test case reverse word");
        Assert.assertEquals("ym eman si namA",reverseWord.reverseWord("my name is Aman"));
    }
}
