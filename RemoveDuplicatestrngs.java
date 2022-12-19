package assignment3;
import java.util.Scanner;
public class RemoveDuplicatestrngs {
    public static void main(String[] args) {
		  @SuppressWarnings("resource")
		 Scanner Scan = new Scanner(System.in);
		 System.out.println("please enter string s1 :");
		 String s1=Scan.nextLine(); 
	     char ar[]=s1.toCharArray();
		 for(int i=0;i<ar.length;i++) {
			 int l=(int)(s1.charAt(i));
			for(int j=i+1;j<ar.length;j++) {
				int k=(int)(s1.charAt(j));
				if(l==k)
				{
					System.out.println("Duplicates detected @"+ j +"i.e is :" +ar[j]);
					ar[j]=0;
					break;
				}
			}
	    }
		for(char elem :ar) {
			System.out.print(elem); 
		}
    }
}
