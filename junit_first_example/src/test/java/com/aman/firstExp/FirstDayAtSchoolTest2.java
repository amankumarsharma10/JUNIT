package com.aman.firstExp;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Aman on 28-12-2016.
 */
public class FirstDayAtSchoolTest2 {
    FirstDayAtSchool firstDayAtSchool = new FirstDayAtSchool();
    String[] schoolpencil = {"Books", "Notebooks", "Pens","Pencils"};

    @Test
    public void testAddPencils(){
        System.out.println("Inside testAddPencils()");
        Assert.assertArrayEquals(schoolpencil,firstDayAtSchool.addPencils());
    }
}
