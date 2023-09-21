package javaProgram;

public class vowels {
	
	public static void main(String[] args) {
		
		String str= "a cup of tea";
        int count=0;

		for(int i=0; i< str.length();i++) {
			
			char ch = str.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
				count++;
				//System.out.println(" contains "+ch+" at index "+i);
			
			
		}
		System.out.println("number of vowels"+count);
	}

}
