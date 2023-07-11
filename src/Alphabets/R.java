package Alphabets;

import java.util.Scanner;

public class R {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 || j==n && i<=n/2+1 || i==1 || i==n/2+1 || i>n/2 && i==j)
				{
					System.out.print("* ");
				} else
					System.out.print("  ");
		
			}
			System.out.println();
		}

	}


}
