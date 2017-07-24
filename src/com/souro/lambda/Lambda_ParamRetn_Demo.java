/**
 * 
 */
package com.souro.lambda;

/**
 * @author sourabrata
 *
 */
public class Lambda_ParamRetn_Demo {
	public static void main(String args[]) {
		String field = "MachineLearning";
		Research4 research = (arg) -> {
			if (arg != null && ! arg.isEmpty()
					&& arg.equalsIgnoreCase("MachineLearning")) {
			return "Remember, deep down in Machine Learning, Math is hidden there !!";
			}
			return null;
		};
		System.out
		.println("Info: " + research.provideInfo(field));
	}
}
