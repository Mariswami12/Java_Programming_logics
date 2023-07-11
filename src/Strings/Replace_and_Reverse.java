package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace_and_Reverse {
	/*String =" I work  at V2 technologies and.."; extract string "V2 technologies" 
	from the given string and reverse it.*/ 
    public static void main(String[] args) {
	        String str = "I work at V2 technologies and..";
	        Pattern p = Pattern.compile("V2 technologies");
	        Matcher matcher = p.matcher(str);

	        if (matcher.find()) {
	            String matchedString = matcher.group();
	            String reversedString = new StringBuilder(matchedString).reverse().toString();
	            System.out.println(reversedString);
	        }
	    }
	}
