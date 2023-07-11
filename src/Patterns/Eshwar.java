package Patterns;

import java.util.Scanner;

public class Eshwar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter the odd num only");
	int n=sc.nextInt();
	for (int i = 1; i <=n ; i++) {
		for(int j=1;j<=n; j++){
			if(i==j || j==1 || i+j==6 || j==n)
			{
				System.out.print("*");
			}
			else System.out.print(" ");
		}
	System.out.println();	
	}
	}
}
