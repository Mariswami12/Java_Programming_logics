package Assignment;

public class Reverce_2a3b4k2s {
	public static void main(String[] args) {
String str="aabbbkkkkss";
for (int i = 0; i < str.length(); i++) {
	char ch=str.charAt(i);
	if(ch>='0' && ch<='9')
	{
		char num=(char) (ch-48);
		for (int j = 1; j <= num; j++) {
			System.out.print(str.charAt(i+1));
		}
	 }
   }
 }
}
