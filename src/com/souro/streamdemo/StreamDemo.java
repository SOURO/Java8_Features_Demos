/**
 * 
 */
package com.souro.streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author sourabrata
 *
 */
public class StreamDemo {
	public static void main(String args[]) {
		List<String> researchFields = new ArrayList<String>();
		researchFields.add("Mathematics");
		researchFields.add("MachineLearning");

		Stream<String> streamResearchFields = researchFields.stream();
		streamResearchFields.forEach(research -> System.out.println(research));
		// streamResearchFields.get().forEach(System.out::println);
		/*
		 * If the above line is uncommented, then we will get an error,
		 * java.lang.IllegalStateException: stream has already been operated
		 * upon or closed. we have to create a new Stream each time we need one.
		 */

		Stream<String> streamSorted = researchFields.stream().sorted();
		streamSorted.forEach(System.out::println);

	}
}
