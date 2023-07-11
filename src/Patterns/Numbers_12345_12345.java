package Patterns;

import java.util.Scanner;

public class Numbers_12345_12345 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number...");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1;j<=n;j++)
			{	
					System.out.print(j+" ");
			}
			System.out.println();
		}
}
}
