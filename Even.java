import java.util.Scanner;
public class Even
{
	public static void main(String args[])
	{
		int num1,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		num1= sc.nextInt();
		c=num1%2;
		if (c==0)
			System.out.println("num1 is even:"+num1);
		else
		System.out.println("num1 is odd:"+num1);
		
	}
}