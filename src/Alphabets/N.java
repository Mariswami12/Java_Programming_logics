package Alphabets;

import java.util.Scanner;

public class N {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 || i==j || j==n)
				{
					System.out.print("* ");
				} else
					System.out.print("  ");
		
			}
			System.out.println();
		}

	}

}
