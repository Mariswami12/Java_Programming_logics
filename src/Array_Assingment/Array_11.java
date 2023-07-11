package Array_Assingment;

public class Array_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]={1,2,3,4,5};
    int ans=0;
    for (int i = 1; i < arr.length; i++) {
		System.out.println(ans=arr[i]*arr[i]+arr[i-1]);
	}
	}

}
