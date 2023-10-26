package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		System.out.println("Length of the string is " + text1.length());
		System.out.println("Length of the string is " + text2.length());
		char[] ch = text1. toCharArray();
		char[] cha = text2. toCharArray();
		Arrays.sort(ch);
		Arrays.sort(cha);
		System.out.println("Sorted Array : " + Arrays.toString(ch));
		System.out.println("Sorted Array : " + Arrays.toString(cha));
	}

}
