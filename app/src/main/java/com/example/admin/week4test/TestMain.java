package com.example.admin.week4test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 9/22/2017.
 */

public class TestMain {
    public static void main(String[] args) {
        String word = "rbail";
        printSubStrings(word);

        int[] myints =  {2,8,9,3,4,3,2,6,6,2,4,90,8};
        myints = sortInts(myints);
        String out = "{";
        for (int i = 0; i < myints.length; i++) {
            if(i != myints.length-1) {
                out += myints[i] + ",";
            }
            else
                out += myints[i];
        }

        out+="}";
        System.out.println(out);
    }

    private static int[] sortInts(int[] myints) {
        for (int i = 0; i < myints.length; i++) {
            for (int j = i+1; j < myints.length; j++) {
                if(myints[i] > myints[j]){
                    int temp = myints[i];
                    myints[i] = myints[j];
                    myints[j] = temp;
                }

            }
            //System.out.print(myints[i]);
        }
        System.out.println(myints[myints.length-1]);
        return myints;
    }

    private static List<String> printSubStrings(String word) {
        List<String> ls = new ArrayList<>();
        for (int i = 0; i <= word.length(); i++) {
            for (int j = i+1; j <= word.length(); j++) {
                String myWord = word.substring(i, j);
                System.out.println(myWord);
                ls.add(myWord);
                while(myWord.length() > 2){
                        myWord = myWord.substring(0,1)+myWord.substring(2,myWord.length());
                        System.out.println(myWord);
                        ls.add(myWord);
                }
            }
        }
        ls.add("");

        return ls;
    }
}
