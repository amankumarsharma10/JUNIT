package com.aman.collectionMatcher;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.hamcrest.collection.IsMapContaining;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aman on 28-12-2016.
 */
public class MapHamcrestCollectionMatchersTest {

    MapHamcrestCollectionMatchers collectionMatchers = new MapHamcrestCollectionMatchers();

    Map<String, Integer> expected;

    @Test
    public void testIsEqualIgnoreOrder(){
        expected = new HashMap<String, Integer>();
        expected.put("One",1);
        expected.put("Two",2);
        expected.put("Four",4);
        expected.put("Three",3);
        Map<String, Integer> result = collectionMatchers.getMap();

        Assert.assertThat(result, CoreMatchers.is(expected));
    }

    @Test
    public void testCollectionSize(){
        expected = new HashMap<String, Integer>();
        expected.put("One",1);
        expected.put("Two",2);
        expected.put("Four",4);

        collectionMatchers.setMap(expected);
        Map<String, Integer> result = collectionMatchers.getMap();

        Assert.assertThat(result.size(), Matchers.is(3));
    }

    @Test
    public void testHasEntry(){
        expected = new HashMap<String, Integer>();
        expected.put("One",1);
        expected.put("Two",2);
        expected.put("Three",3);
        expected.put("Four",4);

        collectionMatchers.setMap(expected);
        Map<String, Integer> result = collectionMatchers.getMap();

        Assert.assertThat(result, IsMapContaining.hasEntry("One",1));

        Assert.assertThat(result,Matchers.not(IsMapContaining.hasEntry("one",1)) );

        Assert.assertThat(result,Matchers.hasEntry("One",1));

       // Assert.assertThat(result,IsMapContaining.hasEntry("one",1));
       // Assert.assertThat(result,IsMapContaining.hasEntry("Three",3));
    }

    @Test
    public void testHasKey(){
        expected = new HashMap<String, Integer>();
        expected.put("One",1);
        expected.put("Two",2);
        expected.put("Three",3);
        expected.put("Four",4);

        collectionMatchers.setMap(expected);
        Map<String, Integer> result = collectionMatchers.getMap();

        Assert.assertThat(result,IsMapContaining.hasKey("One"));
        Assert.assertThat(result,Matchers.not(IsMapContaining.hasKey("one")) );

    }

    @Test
    public void testHasValue(){
        expected = new HashMap<String, Integer>();
        expected.put("One",1);
        expected.put("Two",2);
        expected.put("Three",3);
        expected.put("Four",4);

        collectionMatchers.setMap(expected);
        Map<String, Integer> result = collectionMatchers.getMap();

        Assert.assertThat(result,IsMapContaining.hasValue(1));
        Assert.assertThat(result,Matchers.not(IsMapContaining.hasValue(5)) );
    }
}
