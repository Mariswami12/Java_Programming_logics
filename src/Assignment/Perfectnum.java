package Assignment;

import java.util.Scanner;

public class Perfectnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1; i<=num/2; i++)
		{
			if(num%i==0)
				sum=sum+i;	
		}
		
		System.out.println(sum);
	}

}
