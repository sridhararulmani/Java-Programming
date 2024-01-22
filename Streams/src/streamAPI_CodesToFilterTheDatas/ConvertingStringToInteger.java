package streamAPI_CodesToFilterTheDatas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertingStringToInteger {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("31","21","34","55","88");
		List<Integer>v1=list.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		System.out.println(v1);
	}
}