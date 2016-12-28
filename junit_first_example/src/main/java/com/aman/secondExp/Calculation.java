package com.aman.secondExp;

/**
 * Created by Aman on 28-12-2016.
 */
public class Calculation {
    public int findMaximum(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
