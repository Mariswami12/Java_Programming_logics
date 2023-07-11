package Assignment;

import java.util.Scanner;

public class N_power_p {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base number");
		int base=sc.nextInt();
		System.out.println("Enter exp number");
		int exp=sc.nextInt();
		int x=1;
		while(exp!=0)
		{
			x=x*base;
			exp--;
		}
		System.out.println(x);
	}

}
