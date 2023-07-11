package Patterns;

import java.util.Scanner;

public class Names {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your beautiful name");
		String str=sc.next();
		char ch[]=str.toCharArray();
		int n=str.length();
		int space=0;
		int star=n;
		int x;
		for (int i = 1; i <=n; i++) {
			x=0;
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print(ch[x]+" ");
				x++;
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
