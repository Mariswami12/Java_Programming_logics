package Patterns;

import java.util.Scanner;

public class Butter_fly {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the odd number");
	int n=sc.nextInt();
	int star=1;
	int space=n-2;
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <= star; j++) {
			System.out.print("* ");
		}
		for (int k = 1; k <= space; k++) {
			System.out.print("  ");
		}
		for (int l = star; l >= 1; l--) {
			if(l<n/2+1)
				System.out.print("* ");
		}
		System.out.println();
		if(i<n/2+1)
		{
		   space=space-2;
		   star++;
		}
		else 
		{
		   space=space+2;
			star--;
		}
	}
}
}
