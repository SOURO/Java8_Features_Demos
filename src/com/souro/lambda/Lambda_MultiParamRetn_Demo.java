/**
 * 
 */
package com.souro.lambda;

/**
 * @author sourabrata
 *
 */
public class Lambda_MultiParamRetn_Demo {
	public static void main(String args[]) {
		String field = "MachineLearning";
		boolean grad = false;
		Research5 research = (arg1, arg2) -> {
			if (arg1 != null && ! arg1.isEmpty()
					&& arg1.equalsIgnoreCase("MachineLearning")) {
				if(arg2 == true){
					return "Remember, deep down in Machine Learning, Math is hidden there !!";
				}
				else{
					return "Complete your graduation first !!";
				}
			}
			return null;
		};
		System.out
		.println("Info: " + research.provideInfo(field, grad));
	}
}
