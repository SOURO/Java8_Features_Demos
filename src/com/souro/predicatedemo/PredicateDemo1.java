/**
 * 
 */
package com.souro.predicatedemo;

import java.util.function.Predicate;

/**
 * @author sourabrata
 *
 */
public class PredicateDemo1 {
	public static void main(String args[]){
		Predicate<Integer> prdict = p -> (p<5);
		System.out.println(prdict.test(3));
	}
}
