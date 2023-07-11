package Assignment;

public class Fibinocci {
	public static void main(String[] args) {
		int n=10;
		int f1=0;
		int f2=1;
		int f3=0;
		System.out.print(f1+"\t"+f2);
		for(int i=1; i<=n-2; i++)
		{
			 f3=f1+f2;
			 f1=f2;
			 f2=f3;
			System.out.print("\t"+f3);
		}
	}

}
