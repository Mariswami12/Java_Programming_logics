package Assignment;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		boolean flag=true;
		for (int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
			flag=false;
			break;
		}
		}
		if(flag==true)
			System.out.println("It is  prime number");
		else
			System.out.println("It is not a prime number");
	}

}
