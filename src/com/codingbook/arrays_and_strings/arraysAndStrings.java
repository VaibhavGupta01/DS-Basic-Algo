package com.codingbook.arrays_and_strings;

import com.codingbook.arrays_and_strings.util.StringUtil;

import java.util.*;

public class arraysAndStrings {
	
	public static void main(String[] args) {
//		IsUnique("Tom Marvolo Riddle");
//		System.out.println(CheckPermutation("tom marvolo riddle","i am lordvoldemort"));
//		System.out.println(URLify("Mr John Smith"));
//		System.out.println(IsPalindromePermutation("Tact Coa"));
//		System.out.println(OneAway("pale","bale"));
		System.out.println(CompressString("aabbbcc"));
	}

	/**
	 * Compress string using count of repeated characters
	 * @param inputString
	 * @return
	 */
	private static String CompressString(String inputString) {
		StringBuilder sb=new StringBuilder();
		char currentChar = inputString.charAt(0);
		int count = 1;

		for(int i=1;i<inputString.length();i++){
			if(currentChar==inputString.charAt(i)){
				count++;
			}else {
				sb.append(currentChar).append(count);
				currentChar=inputString.charAt(i);
				count=1;
			}
		}
		sb.append(currentChar).append(count);

		return inputString.length()>sb.length()? sb.toString(): inputString;
	}

	/**
	 * Check if 2 strings just differs by 1 character
	 * @param string1
	 * @param string2
	 * @return
	 */
	private static boolean OneAway(String string1, String string2) {
		if(Math.abs(string1.length()-string2.length())>1)
			return false;

		if(string1.length()==string2.length())
			return checkIfCharReplaced(string1,string2);

		return string1.length()>string2.length()? checkIfCharAppended(string1,string2):checkIfCharAppended(string2,string1);
	}

	private static boolean checkIfCharAppended(String longString, String shortString) {
		//Approach 1
		for (int i = 0; i < shortString.length(); i++) {
			if (longString.charAt(i) != shortString.charAt(i)) {
				String longStringWithoutChar = longString.substring(i+1);
				String shortStringWithoutChar = shortString.substring(i);
				return longStringWithoutChar.equals(shortStringWithoutChar);
			}
		}
		return true;

		//Approach 2
	}

	private static boolean checkIfCharReplaced(String string1, String string2) {
		boolean differentCharEncountered = false;

		for (int i = 0; i < string1.length(); i++) {
			if (string1.charAt(i) != string2.charAt(i)) {
				if (differentCharEncountered)
					return false;
				else
					differentCharEncountered = true;
			}
		}
		return true;
	}

	/**
	 * Can the input string be made palindrome by rearrangement
	 * @param inputString
	 * @return
	 */
	private static boolean IsPalindromePermutation(String inputString) {
		inputString = inputString.toLowerCase().replace(" ","");

		Map<Character, Integer> charCount = StringUtil.getCharCount(inputString);

		boolean oddCountEncountered=false;
		for(Map.Entry<Character,Integer> e:charCount.entrySet()){
			if(e.getValue()%2==1){
				if(oddCountEncountered)
					return false;
				else
					oddCountEncountered=true;
			}
		}
		return true;
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
		Map<Character, Integer> charCount = StringUtil.getCharCount(string1);

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
