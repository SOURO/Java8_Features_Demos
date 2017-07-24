/**
 * 
 */
package com.souro.streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sourabrata
 *
 */

public class FilterCollectionWithStream {
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
		List<Integer> fieldIds = researchFields.stream().filter(research -> research.fieldId > 4).map(research -> research.fieldId).collect(Collectors.toList());
		System.out.println(fieldIds);
	}
}
