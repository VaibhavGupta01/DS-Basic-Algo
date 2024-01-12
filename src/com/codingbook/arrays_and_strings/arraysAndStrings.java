package com.codingbook.arrays_and_strings;

import java.util.*;

public class arraysAndStrings {
	
	public static void main(String[] args) {
//		IsUnique("Tom Marvolo Riddle");
//		System.out.println(CheckPermutation("tom marvolo riddle","i am lordvoldemort"));
		System.out.println(URLify("Mr John Smith"));
	}

	private static String URLify(String inputString) {
		return inputString.replace(" ","%20");
	}

	private static boolean CheckPermutation(String string1, String string2) {

		if(string1.length()!=string2.length())
			return false;
		//Approach 1
//		return sortString(string1).equals(sortString(string2));
		
		//Approach 2
		Map<Character,Integer> charCount = new HashMap<>();

		for(char c:string1.toCharArray()){
			if(charCount.containsKey(c)){
				charCount.put(c,charCount.get(c)+1);
			}else{
				charCount.put(c,1);
			}
		}

		for(char c:string2.toCharArray()){
			if(!charCount.containsKey(c)){
				return false;
			}else{
				charCount.put(c,charCount.get(c)-1);
			}
		}

		for ( Map.Entry<Character,Integer> e:charCount.entrySet()){
			if(e.getValue()!=0)
				return false;
		}
		return true;
	}
	
	private static String sortString(String inputString) {
		char[] charArray= inputString.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}

	public static void IsUnique(String input) {
		Set<Character> chars = new HashSet<Character>();
		for(Character c:input.toCharArray()) {
			if(chars.contains(c)) {
				System.out.println("Repeated Characters present.");
				return;
			}else {
				chars.add(c);
			}
		}
		
		System.out.println("Unique Characters present.");
	}
	
}
