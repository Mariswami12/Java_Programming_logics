package Assignment;

import java.util.Scanner;

public class Special_2num {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int sum=0;
	int d1=num%10;
	int d2=num/10;
	sum=d1+d2+d1*d2;
	if(sum==num)
		System.out.println(sum+" is a Special 2 digit number");
	else
		System.out.println(sum+" is not aspecial digit number");
}
}
