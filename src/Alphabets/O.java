package Alphabets;

import java.util.Scanner;

public class O {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 &&(i>1 && i<n) || (i==1 && (j>1 && j<n)) || i==n && (j>1 && j<n) || j==n && (i>1 && i<n))
				{
					System.out.print("* ");
				} else
					System.out.print("  ");
		
			}
			System.out.println();
		}

	}
}
