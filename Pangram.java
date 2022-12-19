package assignment3;
public class Pangram {
public static void main(String[] args) {
	      	String s1="The Quick Brown Fox Jumps Over The Lazy Dog";
	      	String s2="";
	      	int temp;
	      	boolean king=true;
	      	int[] ch2=new int[26];
	      	char[] ch1=s1.toCharArray();
	     for(int i=0;i<ch1.length;i++) {
	        if(ch1[i]>=97&&ch1[i]<=122)
	    	   s2=s2+(char)(ch1[i]-32);
	        else {
	        	s2=s2+(char)ch1[i];
	        }
	     }
	    s2=s2.replace(" ","");
	    //System.out.println(s2);
        char[] ch3=s2.toCharArray();
        for(int i=0;i<ch3.length;i++) {
		    int j=(ch3[i]-65);
		    	ch2[j]++;
		    }
        for(int j=0;j<ch2.length;j++) {
          if(ch2[j]==0) {
        	  System.out.println("it's not a pangram");
        	  king=false;
        	  
          }
        }
        if(king==true) {
        	System.out.println("it's a pangram");
        }
     }
}
       
       
       
       
       
       
       