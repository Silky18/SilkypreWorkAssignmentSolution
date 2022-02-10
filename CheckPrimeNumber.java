import java.util.Scanner;

public class CheckPrimeNumber {
	int count=0;	
	Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    
public void checkPrimeNumber(){
	

	for (int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if (count==2)
	{
	System.out.println("Entered no is a prime number");
	}
	else
	System.out.println("Entered no is not a prime number ");
}


    
	public static void main(String[] args) {
    
	System.out.println("Please enter no");
    
    CheckPrimeNumber obj=new CheckPrimeNumber();
   obj.checkPrimeNumber();
}
}