package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(5, 1, 4, 1, 1, 4, 1);
		System.out.println(list);
		Map<Integer,Integer> map = list
				.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(Integer::intValue)));
		System.out.println(map);
		
	}

}
