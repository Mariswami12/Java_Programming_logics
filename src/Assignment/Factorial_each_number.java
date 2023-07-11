package Assignment;

public class Factorial_each_number {
public static void main(String[] args) {
	int num=3546;
	while(num!=0)
	{
		int d=num%10;
		int fact=1;
		for(int i=1; i<=d; i++){
			fact=fact*i;
		}
		System.out.println(fact);
		num=num/10;
	}

}
}

