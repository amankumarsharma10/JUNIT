package com.aman.secondExp;

import java.util.Arrays;

/**
 * Created by Aman on 28-12-2016.
 */
public class ReverseWord {

    public String reverseWord(String str){

        String []strArr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        int size = strArr.length-1;
        while (size>=0){
            String word = strArr[(strArr.length-1)-size];
            String rword = "";
            for (int i = word.length()-1; i >=0 ; i--) {
                rword+=word.charAt(i);
            }
            sb = size != 0 ? sb.append(rword+" "):sb.append(rword);
            size--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseWord reverseWord = new ReverseWord();
        System.out.println(reverseWord.reverseWord("my name is Aman"));
    }
}
