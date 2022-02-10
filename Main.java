import java.util.Scanner;
public class Main {
Scanner sc = new Scanner(System.in);

//function to checkPalindrome
			public void checkPalindrome()  {
    		System.out.println("Please enter number");
    		int temp,reverse=0,r;
    		int n=sc.nextInt();
    		temp=n;
   		
    	    while(n>0)
    		{
    		r=n%10;
    	    reverse=reverse*10+r;
    	    n=n/10;
    		}
       		if(temp==reverse)
    		{
    			System.out.printf("%d  is a palindrome number \n",temp);
    		}
    		else
    		{
    			System.out.printf("%d is not palindrome number \n",temp);
    		}
			}
			
			//function to printPattern
    		public void printPattern()
    		{
    			System.out.println("Please enter no. of rows:");
    			int n=sc.nextInt();
    			for (int i=1;i<=n;i++)
    	    	{
    				for(int j=n;j>=i;j--)
    				{
    				System.out.print("*");
    				}
    				System.out.println(" ");
    			}
    	
    		
    		}

  //function to check no is prime or not

       public void checkPrimeNumber() {
    	   
    	   int n,count=0;
    	   System.out.println("Please enter no:");
    	    n=sc.nextInt();
			   	     
    	   for (int i=1;i<=n;i++)
    		{
    			if(n%i==0)
    			{
    				count++;
    			}
    		}
    		if (count==2)
    		{
    		System.out.printf("%d is a prime number. \n",n);
    		}
    		else
    		System.out.printf("%d is not a prime number. \n",n);
    	}
        
               // function to print Fibonacci Series
       			public void printFibonacciSeries() {

       			 int n1=0,n2=1,n3,i;
					 System.out.println("Please enter number:");
       			 int n=sc.nextInt();
       			 System.out.println("Fibonacci series is:");
       			 System.out.print("  "+n1);
       			 System.out.print("  "+n2);
       				
       				 for(i=2;i<=n;i++)
       				 {
       					 n3=n1+n2;
       					 n1=n2;
       					 n2=n3;
       					 System.out.print("  "+n3);
       				 }
   					 System.out.println();

       			}

          

 


//main method which contains switch and do while loop

      public static void main(String args[]) {
               Main obj = new Main();
                int choice;
                Scanner sc = new Scanner(System.in);
do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();
choice = sc.nextInt();

switch (choice) { 
case 0:
choice = 0;
break;

case 1: {
obj.checkPalindrome();
}
break;

case 2: {
obj.printPattern();
}
break;

case 3: {
obj.checkPrimeNumber();
}
break;

case 4: {
obj.printFibonacciSeries();
}
break;

default:
System.out.println("Invalid choice. Enter a valid no.\n");
}

}
while (choice != 0);
System.out.println("Exited Successfully!!!");
sc.close();
}
      }

