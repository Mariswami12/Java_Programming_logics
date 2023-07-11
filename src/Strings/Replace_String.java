package Strings;

public class Replace_String {
	public static void main(String[] args) {

		String str = "AB?EF?XY?";
		System.out.println(str);
		String sub = "KLM";
		char ch[] = str.toCharArray();
		char bh[] = sub.toCharArray();
		String ans = "";
		int x = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '?') {
				ans = ans + bh[x];
				x++;
			} else {
				ans = ans + ch[i];

			}
		}
		System.out.println(ans);
	}
}
