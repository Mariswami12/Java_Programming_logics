package Alphabets;

import java.util.Scanner;

public class V {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for (int i = 1; i <=n ; i++) {
			for (int j = 1; j <=n; j++) {
				if (i-j==1 && j<=n/2+1 || i+j==n+2 && j>=n/2+1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
				
			}
			System.out.println();
	}

}
}
