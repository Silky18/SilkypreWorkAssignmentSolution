import java.util.Scanner;

public class GlCheckPalindromeMethod {
	public void checkPrime(int num,int rev) 
	{
		//System.out.println(" user entered number comes in method:"+num);
		//System.out.println(" Reverse entered number comes in method:"+rev);
		if(num==rev)
		{
			System.out.printf("%d  is a palindrome number",num);
		}
		else
		{
			System.out.printf("%d is not a palindrome number",num);
		}

	}
	
	public static void main(String args[]) {
 
		int r, reverse=0;
		GlCheckPalindromeMethod obj=new GlCheckPalindromeMethod();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number:");
		int n=sc.nextInt();
		int temp=n;
		//System.out.println("user entered number:"+n);
		
		 while(n>0)
		 {
			 r=n%10;
		     reverse=reverse*10+r;
		     n=n/10;
		 }
	  //	System.out.println("Reverse is"+reverse);
	  obj.checkPrime(temp,reverse);
	}
	
	
	
}