package Array_Assingment;

public class Array7 {
public static void main(String[] args) {
	int arr[]={1,2,3,5,6};
	int oddsum=0;
	int evensum=0;
	for (int i = 0; i < arr.length; i++) {
		if (i%2==0) {
			evensum=evensum+arr[i];
		}
		else
	       oddsum=oddsum+arr[i];	
	}
	System.out.println("oddsum-->"+oddsum+"even cum-->"+evensum);
}
}
