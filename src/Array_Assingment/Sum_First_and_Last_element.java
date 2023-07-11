package Array_Assingment;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_First_and_Last_element {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter element...");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter"+size+"elements...");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum of first and last element-->"+(arr[0]+arr[arr.length-1]));
}
}
