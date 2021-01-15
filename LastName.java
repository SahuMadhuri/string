package in.basic.String;

import java.util.Arrays;

public class LastName {
	public static void main(String[] args) {
		String s="Vijay dina nath Chauhan";
		String s1[] =s.split(" ");
		//System.out.println(s.substring(6));
		int j=s1.length-1;
		System.out.println(Arrays.toString(s1));
		
		System.out.println("Last name = "+s1[j]);
	}

}
