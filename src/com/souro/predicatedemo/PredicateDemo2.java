/**
 * 
 */
package com.souro.predicatedemo;

import java.util.function.Predicate;

/**
 * @author sourabrata
 *
 */
class Demo{
	static Boolean demoTest(int num){
		if(num<3){
			return true;
		}
		else{
			return false;
		}
	}
}
public class PredicateDemo2 {
	public static void main(String args[]){
		Predicate<Integer> prdict = Demo::demoTest;
		System.out.println(prdict.test(5));
	}
}
