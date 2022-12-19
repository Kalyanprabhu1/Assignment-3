package assignment3;
public class Anagram {
public static void main(String[] args) {
		 String s="Older and Wiser";
		 String s1="";
		 String S="i lerned Words";
		 String s2="";
		 boolean king = false;
		 s=s.replace(" ","");
		 S=S.replace(" ","");
		for(int i=0;i<s.length();i++) {
		        if(s.charAt(i)>=65&&s.charAt(i)<=90)
		    	   s1=s1+(char)(s.charAt(i)+32);
		        else {
		        	s1=s1+(char)s.charAt(i);
		        }
		     }
		 for(int i=0;i<S.length();i++) {
		        if(S.charAt(i)>=65&&S.charAt(i)<=90)
		    	   s2=s2+(char)(S.charAt(i)+32);
		        else {
		        	s2=s2+(char)S.charAt(i);
		        }
		     }
		 char[] ch1=s1.toCharArray();
		 char[] ch2=s2.toCharArray();
		 for(int i=0;i<ch1.length;i++) {
		    for(int j=0;j<ch2.length;j++) {
			    if(ch1[i]==ch2[j]) {  
			       if(i==ch1.length-1) {
			          System.out.println("it's a anagram");
			            break;}break;
			    }
			    else 
			    {    if(j==ch2.length-1) {
			      System.out.println("it's not a anagram");
			          i=ch1.length;
			            break;}
			    } 
	      }
       }
    } 
  }

