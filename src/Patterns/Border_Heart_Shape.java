package Patterns;

import java.util.Scanner;

public class Border_Heart_Shape {
	  public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the number...");
	        int n=sc.nextInt();
	        for (int i = 0; i <= n; i++) {
	            for (int j = 0; j <= n; j++) {
	                if ((i == 0 && j % 3 != 0) || (i == 1 && j % 3 == 0)
	                		|| (i - j == 2) || (i + j == n + 2)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
}
