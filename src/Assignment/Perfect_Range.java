package Assignment;

import java.util.Scanner;

public class Perfect_Range {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		int start = sc.nextInt();
		System.out.println("Enter the ending number");
		int end = sc.nextInt();
		for (int num = start; num <= end; num++) {
			if(num>1){
				int sum = 0;
				for (int i = 1; i <=num/2; i++) {
					if (num%i ==0 )
						sum = sum+i;
				}
				if(sum == num)
					System.out.println(num+ "   It is a perfect number");
			}
		}
	}

}
