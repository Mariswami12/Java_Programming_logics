package Alphabets;

public class A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=5;
    for(int i=1;i<=n;i++)
    {
    	for(int j=1;j<=n;j++){
    		if((j==1 && i<=n) || (i==1 && j<=n) || (j==n && i<=n) || (i==n/2 +1 && j<=n)  || 
    				(i!=n/2 && (j>1 && j<1)))
    			System.out.print("* ");
    		else
    			System.out.print("  ");
    	}
      System.out.println();
    }
	}
}