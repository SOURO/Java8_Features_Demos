/**
 * 
 */
package com.souro.streamdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sourabrata
 *
 */
public class StreamFilteringAndIterating {
	public static void main(String args[]){
		List<Research> researchFields = new ArrayList<Research>();
		Research research1 = new Research();
		research1.fieldId = 5;
		research1.fieldName = "MachineLearning";
		researchFields.add(research1);
		Research research2 = new Research();
		research2.fieldId = 3;
		research2.fieldName = "Mathematics";
		researchFields.add(research2);
		Research research3 = new Research();
		research3.fieldId = 8;
		research3.fieldName = "Coding";
		researchFields.add(research3);
		researchFields.stream().filter(research -> research.fieldId > 4).forEach(research -> System.out.println(research.fieldName));
	}
}
