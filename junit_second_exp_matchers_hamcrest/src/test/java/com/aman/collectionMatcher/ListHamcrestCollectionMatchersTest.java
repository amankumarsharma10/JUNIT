package com.aman.collectionMatcher;

import org.hamcrest.Matchers;
import org.hamcrest.core.Every;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Aman on 28-12-2016.
 */
public class ListHamcrestCollectionMatchersTest {

/*
    1.  has a size of 3
    2.  contains the elements 2, 4, 5 in any order
    3.  every item is greater than 1
*/
    ListHamcrestCollectionMatchers collectionMatchers = new ListHamcrestCollectionMatchers();

    @Test   //  size of a collection
    public void testhasSize() {
        collectionMatchers.setList(new Integer[]{3,5,23,4});
        List<Integer> result = collectionMatchers.getList();
        Assert.assertThat(result, Matchers.hasSize(4));
    }

    @Test   //  check all elements with anyOrder
    public void testContains() {
        collectionMatchers.setList(new Integer[]{3,5,23,4});
        List<Integer> result = collectionMatchers.getList();
        Assert.assertThat(result, Matchers.containsInAnyOrder(4,5,23,3));
    }

    @Test   //  check all elements with Strict Order
    public void testStrictOrderContains() {
        collectionMatchers.setList(new Integer[]{3,5,23,4});
        List<Integer> result = collectionMatchers.getList();
        Assert.assertThat(result, Matchers.contains(3,5,23,4));
    }

    @Test   //  condition on every item => Every.everyItem
    public void testGreaterThan() {
        collectionMatchers.setList(new Integer[]{3,5,23,4});
        List<Integer> result = collectionMatchers.getList();
        Assert.assertThat(result, Every.everyItem(Matchers.greaterThan(2)));
    }

    @Test   //  check if collection is empty
    public void testEmpty() {
      //  collectionMatchers.setList(new Integer[]{3,5,23,4});
        List<Integer> result = collectionMatchers.getList();
        Assert.assertThat(result, Matchers.empty());
    }

    @Test   //  size of an iterable
    public void testIterableSize() {
        collectionMatchers.setList(new Integer[]{3,5,23,4});
        List<Integer> result = collectionMatchers.getList();
        Assert.assertThat(result, Matchers.<Integer>iterableWithSize(4));
    }
}
