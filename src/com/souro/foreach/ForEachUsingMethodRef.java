/**
 * 
 */
package com.souro.foreach;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sourabrata
 *
 */
public class ForEachUsingMethodRef {
	public static void main(String args[]){
		List<String> researchFields = new ArrayList<String>();
		researchFields.add("MachineLearning");
		researchFields.add("Mathematics");
		researchFields.forEach(System.out::println);
		researchFields.stream().forEachOrdered(System.out::println);
	}
}
