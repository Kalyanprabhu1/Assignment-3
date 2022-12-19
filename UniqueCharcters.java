package assignment3;
import java.util.Scanner;
public class UniqueCharcters {
@SuppressWarnings("resource")
	public static void main(String[] args) {
		   Scanner Scan = new Scanner(System.in);
		   System.out.println("please enter string s1 :");
		   String s1=Scan.nextLine();
		   boolean king=false;
		   char ch[]=s1.toCharArray();
		   for(int i=0;i<=ch.length-1;i++) {
			 int k=(int)(s1.charAt(i));
			  for(int j=i+1;j<=ch.length-1;j++) {  
			   int l=(int)(s1.charAt(j));
				  if(k==l) {
					System.out.println("Given strng doesn't have all unique charcters due to repetation of  "+(s1.charAt(j)));  
				     king=true;
				     break;
				  }
             }  
       }
		   if(king==false)
		   System.out.println("Given string have all unique charcters");  
    }    
}	   