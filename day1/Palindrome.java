package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		String value = "madam";
		char[] ch= value.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}

	}

}
