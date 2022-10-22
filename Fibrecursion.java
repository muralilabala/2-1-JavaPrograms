import java.util.*;
class Fibrecursion
{
static int i,n,r;
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		n=s.nextInt();
		System.out.println("Fibonacci series is:");
		for(i=0;i<n;i++)
		{	r=fib(i);
			System.out.println(r);
			}
	}

	public static int fib(int i)
	{
		if(i==0)
		return 0;
		else if(i==1)
		return 1;
		else
		return (fib(i-1)+fib(i-2));
	}
}