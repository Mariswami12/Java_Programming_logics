package Alphabets;

import java.util.Scanner;

public class W {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number--");
		int n=sc.nextInt();
		
		for (int i =1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(j==1 || i+j==n+1 && i>=n/2+1  || j==n || i-j==0 && i>=n/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
			
	}
}
