package javaProgram;

public class CountUcaseLcase {
	
	public static void main(String[] args) {
		String str = "aBckhL09@quD#45KD";
	    
		int Upper=0,Lower=0,Special=0,number=0;
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			if(ch>='A'&& ch<='Z') Lower ++;
			
			else if(ch>='a'&& ch<='z') Upper ++;
			else if(ch>='0'&& ch<='9') number ++;
			else Special ++;
		}
		
		System.out.println("lower case letter"+Lower);
		System.out.println("upper case letter"+Upper);
		System.out.println("numberic"+number);
		System.out.println("Special case" +Special);
	}

}
