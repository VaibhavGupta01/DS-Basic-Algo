package com.codingbook.arrays_and_strings.util;

import java.util.Arrays;
import java.util.HashMap;

public class StringUtil {

    /**
     * Sort the input string provided
     * @param inputString
     * @return sorted string
     */
    public static String sortString(String inputString) {
        char[] charArray= inputString.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    /**
     * Returns a Map having frequency of each character from the input string
     * @param inputString
     * @return
     */
    public static HashMap<Character, Integer> getCharCount(String inputString) {
        HashMap<Character,Integer> charCount = new HashMap<>();

        for(char c:inputString.toCharArray()){
            if(charCount.containsKey(c)){
                charCount.put(c,charCount.get(c)+1);
            }else{
                charCount.put(c,1);
            }
        }
        return charCount;
    }

}
