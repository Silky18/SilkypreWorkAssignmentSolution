import java.util.Scanner;


public class PrintFibonacciSeriesMethod {
	 int n1=0,n2=1,n3,i;

	public void printFibonacciSeries() {
		 Scanner sc=new Scanner(System.in);
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
	}
 
		
	
public static void main(String args[])
{
	PrintFibonacciSeriesMethod obj =new PrintFibonacciSeriesMethod();

System.out.println("Please enter number:");

obj.printFibonacciSeries();
	
}
}