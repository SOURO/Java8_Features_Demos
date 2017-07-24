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
public class ParallelStreamDemo {
	public static void main(String args[]) {
		List<String> researchFields = new ArrayList<String>();
		researchFields.add("Mathematics");
		researchFields.add("MachineLearning");

		Stream<String> streamResearchFields = researchFields.parallelStream();
		streamResearchFields.forEach(research -> System.out.println(research));

	}
}
