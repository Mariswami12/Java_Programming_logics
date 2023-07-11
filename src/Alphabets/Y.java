package Alphabets;

import java.util.Scanner;

public class Y {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the odd number->");
		int n=sc.nextInt();
		
		for (int i = 1; i <= n;i++) {
			for (int j = 1; j <=n ; j++) {
			if(i-j==0 && (i<=n/2+1 && j<=n/2) || i+j==n/2+ 4 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}
