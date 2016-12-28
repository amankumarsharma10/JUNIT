package com.aman.collectionMatcher;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aman on 28-12-2016.
 */
public class MapHamcrestCollectionMatchers {

    Map<String ,Integer> map = new HashMap<String, Integer>();
    MapHamcrestCollectionMatchers(){
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
    }
    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Map<String, Integer> getMap() {
        return map;
    }
}
