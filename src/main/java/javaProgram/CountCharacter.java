package javaProgram;

public class CountCharacter {
	
	public static void main(String[] args) {
		
		String string = "World Best Thing";
		int count = 0;
		for (int i=0; i< string.length();i++) {
			
			if(string.charAt(i)!=' ')
				count ++ ;
			}
		
		System.out.println("total number of character in string" +count);
	}

}
