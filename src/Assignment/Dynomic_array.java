package Assignment;

import java.util.Scanner;

public class Dynomic_array {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int size=sc.nextInt();
	int arr[]=new int [size];
	for(int i=0; i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	System.out.println("After loading");
	for(int j=0; j<arr.length; j++)
	{
		System.out.println(arr[j]);
	}
	
}
}
