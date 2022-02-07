import java.util.*;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
		Random random = new Random();
		random.ints().limit(5).forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		
		System.out.println(squaresList);
		
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		//get count of empty string
		int count = (int)strings.stream().filter(string -> string.isEmpty()).count();
		
		System.out.println(count);
	}

}
