package Array_Assingment;

import java.util.Scanner;

public class Row_wise_smallest_element {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row value");
		int row=sc.nextInt();
		System.out.println("Enter the col value");
		int col=sc.nextInt();
		int arr [][]=new int [row][col];
		System.out.println("Enter "+row*col+" elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
	System.out.println("After loading");
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	int small;
	for (int i = 0; i < arr.length; i++) {
		small=arr[i][0];
		for (int j = 0; j < arr[i].length; j++) {
			if(small>arr[i][j])
				small=arr[i][j];
		}
		System.out.println("Biggest element of"+(1+i)+"row-->"+small);
		}
	}
}
