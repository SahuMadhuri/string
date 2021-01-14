package in.basic.String;

public class ReverseString {

	public static void main(String[] args) {
		String s="MADHURI";
		String t="";
		int j=s.length()-1;
		System.out.println(s);
		for(int i=0;i<=j;i++){
			t=s.charAt(i)+t;
		}
       System.out.println(t); 
	}

}
