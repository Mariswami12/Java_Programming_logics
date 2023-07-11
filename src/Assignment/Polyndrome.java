package Assignment;

import java.util.Scanner;

public class Polyndrome {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int num=s.nextInt();
	int sum=0;
	int copy=num;
	while(num!=0)
	{
	int d=num%10;
	sum=sum*10+d;
	num=num/10;
	}
if(sum==copy)
	System.out.println(sum+" is a polyndrome number");
else
	System.out.println(sum+" is not a polyndrome number");
	
}
}
