package Patterns;

public class Rectangle {
public static void main(String[] args) {
	int n=5;
 for (int i = 0; i <=n; i++) {
	for (int j = 0; j <=n; j++) {
		if(i==1||j==1||j==n||i==n*2)
			System.out.println("* ");
		else
			System.out.println(" ");
	}
	System.out.println();
}
}
}
