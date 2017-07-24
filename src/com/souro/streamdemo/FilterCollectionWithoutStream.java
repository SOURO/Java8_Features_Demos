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

public class FilterCollectionWithoutStream {
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
		List<Integer> fieldIds = new ArrayList<Integer>();
		for(Research researchField : researchFields){
			if(researchField.fieldId>4){
				fieldIds.add(researchField.fieldId);
			}
		}
		System.out.println(fieldIds);
	}
}
