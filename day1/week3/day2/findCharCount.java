package week3.day2;

public class findCharCount {

	public static void main(String[] args) {
		String data ="Aadhaar card";
		char targetchar = 'a';
		int count= 0;
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)==targetchar) {
			count++;
			
		}
		}
			
	System.out.println(targetchar +":its present:" +count);
	
	}
}
