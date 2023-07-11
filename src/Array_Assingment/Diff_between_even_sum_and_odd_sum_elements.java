package Array_Assingment;

import java.util.Arrays;
import java.util.Scanner;

public class Diff_between_even_sum_and_odd_sum_elements {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter element...");
		int size=sc.nextInt();
		int arr[]=new int [size];
		int Esum=0;
		int Osum=0;
		System.out.println("Enter"+size+"elements...");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			if(i%2==0)
				Esum=Esum+arr[i];
			else
				Osum=Osum+arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Difference of Esum & Osum"+(Esum-Osum));
}
}
