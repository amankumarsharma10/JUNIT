package com.aman.firstExp;

import java.util.Arrays;

/**
 * Created by Aman on 28-12-2016.
 */
public class FirstDayAtSchool {
    public String[] prepareBag(){
        String[] schoolbag = {"Books", "Notebooks", "Pens"};
        System.out.println("My Bag contains "+ Arrays.toString(schoolbag));
        return schoolbag;
    }

    public String[] addPencils() {
        String[] schoolbag = {"Books", "Notebooks", "Pens", "Pencils"};
        System.out.println("Now my school bag contains: "+Arrays.toString(schoolbag));
        return schoolbag;
    }

}
