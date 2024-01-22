package streamAPI_CodesToFilterTheDatas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPICodeToFilterTheData {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(10,20,13,15,18,30);
	
		/**
		 * ANINAMOUS IMPLIMENTATION
		 *		
		 *		Stream<Integer>stream1=list.stream();
				Predicate<Integer>predicate=new Predicate<Integer>() {
					@Override
					public boolean test(Integer t) {
						return t%2==0;
					}
				};
		 **/
		
		/**
		 * DAIMOND IMPLIMENTATION
		 * 		
		 * 		Stream<Integer>stream2=stream1.filter(predicate);
				List<Integer>evenList=stream2.collect(Collectors.toList());
				System.out.println(evenList);
				Stream<Integer>stream1=list.stream();
				Predicate<Integer>pre=t->t%2==0;
				Stream<Integer>stream2=stream1.filter(pre);
				List<Integer>evenList=stream2.collect(Collectors.toList());
				System.out.println(evenList);
		 * */

		/**LAMBNDA IMPLIMENTAON*/
		List<Integer>evenList=list.stream()
				.filter(t -> t%2==0)
				.collect(Collectors.toList());
		System.out.println(evenList);
	}
}
