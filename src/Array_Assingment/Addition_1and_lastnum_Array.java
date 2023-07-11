package Array_Assingment;

public class Addition_1and_lastnum_Array {
public static void main(String[] args) {
	int arr[]={3,2,10,5,6};
	int sum=0;
	for (int i = 0; i < arr.length; i++) {
		if(i==0 || i==4)
			
			sum=sum+arr[i];
	}
	System.out.println(factorial(sum));
}
static int factorial(int num) 
{
	int fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	return fact;
	
}
}
