package Patterns;

import java.util.Scanner;

public class Pattern_X4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the odd number");
		int n=sc.nextInt();
		int space=0;
		int star=n;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print((char)(i+96)+" ");
			}
			System.out.println();
			if(i<n/2+1)
			{
			   star=star-2;
			   space++;
			}
			else 
			{
			   star=star+2;
				space--;
			}
}
}

}
