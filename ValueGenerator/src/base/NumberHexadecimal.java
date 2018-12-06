package base;

import java.util.Random;

public class NumberHexadecimal {
	
	
	public static String generate(String HexAlphabet) {
		 return String.valueOf(HexAlphabet.charAt(new Random().nextInt(HexAlphabet.length())));
			
	}

}
