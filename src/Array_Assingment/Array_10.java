package Array_Assingment;

public class Array_10 {
public static void main(String[] args) {
	int arr[]={1,2,3,4,5,7};
	for (int i = 0; i < arr.length; i++) {
		System.out.println(prime(arr[i]));
	}
}
static int prime(int b)
{
	int c=0;
	if(b>1)
	c=1;
	for (int i = 2; i <b/2; i++) {
		if(b%i==0)
			c=0;
		break;
	}
	if(c==1)
		return b;
	else
		return 0;
}
}
