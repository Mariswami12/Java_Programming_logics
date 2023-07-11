package Assignment;

import java.util.Scanner;

public class Fetch_product {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int product=1;
	while(num!=0){
		int d=num%10;
		product=product*d;
		num=num/10;
	}
	System.out.println(product);
}
}
