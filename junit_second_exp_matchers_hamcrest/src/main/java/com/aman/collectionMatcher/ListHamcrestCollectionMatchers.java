package com.aman.collectionMatcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Aman on 28-12-2016.
 */
public class ListHamcrestCollectionMatchers {

    List<Integer> list = new ArrayList<Integer>();

    public void setList(Integer[] integers) {
        list = Arrays.asList(integers);
    }
    public List<Integer> getList() {
        return list;
    }
}
