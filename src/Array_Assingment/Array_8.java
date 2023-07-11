package Array_Assingment;

public class Array_8 {
public static void main(String[] args) {
	int arr[]={10,4,6,8,9};
	int opr=0;
	for (int i = 0; i < arr.length; i++) {
		opr=arr[i]*arr[i]+arr[i];
		System.out.println(opr);
	}
}
}
