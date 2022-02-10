
	
	import java.util.Scanner;
	public class PrintPattern {
	   	
		public void printPattern()
		{
			Scanner sc=new Scanner(System.in);
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



		public static void main (String args[]) {
			
	    System.out.println("Please enter numbers:");
			PrintPattern obj=new PrintPattern(); 
		    obj.printPattern();
			
	}
	}


