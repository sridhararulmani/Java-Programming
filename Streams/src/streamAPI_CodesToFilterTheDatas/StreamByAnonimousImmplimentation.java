package streamAPI_CodesToFilterTheDatas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamByAnonimousImmplimentation {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(30,15,13,7,88,93);
		//		Annonimous implimentation

		//		Stream<Integer> stream=list.stream();
		//		Predicate<Integer>pre=new Predicate<Integer>() {
		//			@Override
		//			public boolean test(Integer t) {
		//				return t%2==0;
		//			}
		//		};
		//		Stream<Integer> stream1=stream.filter(pre);
		//		List<Integer>elist=stream1.collect(Collectors.toList());
		//		System.out.println(elist);

		//		OR
		//		dimonnd implimentation
		
		//		Stream<Integer> stream=list.stream();
		//		Stream<Integer> stream1=stream.filter(t->t%2==0);
		//		List<Integer>elist=stream1.collect(Collectors.toList());
		//		System.out.println(elist);

		//		OR

		List<Integer>elist=list.stream()
				.filter(t->t%2==0)
				.collect(Collectors.toList());
		System.out.println(elist);
	}
}