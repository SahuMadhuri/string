package in.basic.String;

import java.util.Arrays;


/**
 * @author Madhuri
 * write a program to print reverse String.
 *
 */
public class ReverseFullName {
	public static void main(String[] args) {
		
		String s="Vijay dina nath Chauhan";
		 String s1[]=s.split(" ");  
		    String rev=""; 
		    System.out.println(Arrays.toString(s1));
		    
		    for(int i=0;i<s1.length;i++){  
		    	String w=s1[i];
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        rev=rev+sb.toString()+" ";
	}
		    System.out.println(rev);

	}
}
