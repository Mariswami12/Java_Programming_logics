package Alphabets;

import java.util.Scanner;

public class Z {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the odd only->");
		int num=sc.nextInt();
		
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=num; j++) {
				if(i==1 || i==num || i+j==num/2+ 4){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	  }
}
