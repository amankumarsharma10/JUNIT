package com.aman.firstExp;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Aman on 28-12-2016.
 */
public class FirstDayAtSchoolTest1 {
    FirstDayAtSchool firstDayAtSchool = new FirstDayAtSchool();
    String[] schoolbag = {"Books", "Notebooks", "Pens"};

    @Test
    public void testPrepareBag(){
        System.out.println("Inside testprepareBag()");
        Assert.assertArrayEquals(schoolbag,firstDayAtSchool.prepareBag());
    }
}
