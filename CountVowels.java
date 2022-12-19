package assignment3;
import java.util.Scanner;
public class CountVowels {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		    Scanner Scan = new Scanner(System.in);
			System.out.println("please enter string s1 :");
			 String s1=Scan.nextLine(); 
			 char[] ch1=s1.toCharArray();
			 char[] ch2=new char[5];
			 ch2[0]='a';
			 ch2[1]='e';
			 ch2[2]='i';
			 ch2[3]='o';
			 ch2[4]='u';
			 int v=0;
			 int s=0;
			 int c=0;
			 for(int i=0;i<ch1.length;i++) {
			   int l=(int)(s1.charAt(i)); 
			     for(int j=0;j<ch2.length;j++){ 
				   int k=(int)(s1.charAt(j)); 
				     if(l==k) 
				       { v++;
				         break;}
				     else if(l>=33&&l<=64) 
				       { s++;
				         break;}
				     else if(l>=65&&l<=90) 
				       { c++;
				    	 break;}
				   }	
			 }
	    System.out.println("no.of vowels in the given string are :"+v);
		System.out.println("no.of specialcharcters including numbers in the given string are :"+s);
		System.out.println("no.of capitals in the given string are :"+c);
		System.out.println("no.of consonants in the given string are :"+(s1.length()-v-s-c));
	}
}   
   
