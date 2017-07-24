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
public class ForEachUsingLambda {
	public static void main(String args[]){
		List<String> researchFields = new ArrayList<String>();
		researchFields.add("MachineLearning");
		researchFields.add("Mathematics");
		researchFields.forEach(researchField->System.out.println(researchField));
		researchFields.stream().forEachOrdered(researchField->System.out.println(researchField));
	}
}
