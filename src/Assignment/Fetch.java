package Assignment;

import java.util.Scanner;

public class Fetch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	while(num!=0)
	{
		int d=num%10;
	System.out.println(d);
	num=num/10;
	}
}
}
