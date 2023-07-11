package Array_Assingment;


import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_square_All_elements {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter element...");
		int size=sc.nextInt();
		int arr[]=new int [size];
		int sum=0;
		System.out.println("Enter"+size+"elements...");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
				sum=sum+arr[i]*arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
}
}
