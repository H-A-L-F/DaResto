package helper;

import java.util.Random;

public class StringHelper {
	
	private final int LEFT_LIMIT = 97;
	private final int RIGHT_LIMIT = 122;
	private final Random rand = new Random();
	
	private static StringHelper instance;
	
	private StringHelper() {

	}
	
	public static StringHelper getInstance() {
		if(instance == null) instance = new StringHelper();
		return instance;
	}
	
	public String genRandString(int len) {
		return rand.ints(LEFT_LIMIT, RIGHT_LIMIT + 1)
				.limit(len)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			    .toString();
	}

}
