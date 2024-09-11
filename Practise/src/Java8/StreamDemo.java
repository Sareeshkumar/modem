package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("sareesh", "varun", "advik", "mallesh");


		List<String> result = names.stream().filter(s->s.startsWith("s"))
				.collect(Collectors.toList());

		System.out.println(result);
	}

}
