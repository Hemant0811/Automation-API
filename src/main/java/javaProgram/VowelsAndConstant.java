package javaProgram;

public class VowelsAndConstant {
	
	public static void main(String[] args) {
		String str= "a hardworking man";
		char ch;
		int vCount=0, cCount=0;
		for (int i=0; i<str.length();i++) {
			 ch = str.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				vCount++;
			}
		
			else if(ch >='a' && ch<='z') { 
				cCount++;
			}
		
	}
		System.out.println("number of vowels"+vCount);
		System.out.println("number of constants"+cCount);
	}
}
