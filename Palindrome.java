package assignment3;

public class Palindrome {

	public static void main(String[] args) {
		String s1="2552";
		String s2="";
		int flag=0;
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}	
			System.out.println(s2);
			if(s1.equals(s2)) {
				System.out.println("it is a palindrome");
			}
			else {
				System.out.println("it is not a palindrome");
			}
	}
}
	 
