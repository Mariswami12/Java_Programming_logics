package Patterns;

import java.util.Scanner;

public class Solid_Daimond1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value...");
		int n=sc.nextInt();
		 int space=n/2;
		 int star=1;
		 for (int i = 1; i<=n ;i++) {
			 for(int j=1;j<=space;j++)
			 {
				 System.out.print("  ");
			 }
			for (int k =1 ; k <=star ; k++) {
				System.out.print((char)(k+64)+" ");
			}
			System.out.println();
		if(i< n/2 +1)
		{
			space--;
			star=star+2;
			
		}
		
		else{
			space++;
			star=star-2;
		}
		 }
		}
		
}
