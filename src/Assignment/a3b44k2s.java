package Assignment;

public class a3b44k2s {
	public static void main(String[] args) {
String str="2a3b4k2s";
for (int i = 0; i < str.length(); i++) {
	char ch=str.charAt(i);
	if(ch>='0' && ch<='9')
	{
		int num=(int) (ch-48);
		for (int j = 1; j <= num; j++) {
			System.out.print(str.charAt(i+1));
		}
	 }
   }
 }
}
