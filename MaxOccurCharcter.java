package assignment3;

import java.util.Scanner;

public class MaxOccurCharcter {

	public static void main(String[] args) {
		  @SuppressWarnings("resource")
			 Scanner Scan = new Scanner(System.in);
			 System.out.println("please enter string s1 with out any special charcters :");
			 String s1=Scan.nextLine();
			 s1=s1.toLowerCase();
			 int max;
			 int[] c=new int[s1.length()];
			 char maxchar=s1.charAt(0);
			 char ar[]=s1.toCharArray();
			 for(int i=0;i<ar.length;i++) {
			          c[i]=1;
				for(int j=i+1;j<ar.length;j++) {
				      if(ar[i]==ar[j]&&ar[i]!=0) {
						 c[i]++;
					   }
			    }
		}
                     max=c[0];
              for(int i=0;i<c.length;i++) {
            	   if(max<=c[i]) 
            	   { max=c[i];
            		maxchar=ar[i];
            	   }
              }
           System.out.println("Maximum Occuring Character  "+maxchar +" occurs "+max+" times");  
            	   
              
              
           // System.out.println("Maximum Occuring Character  "+maxchar +" occurs "+max+" times");         
	    }
}				
				
			
					
					
		
	


	


