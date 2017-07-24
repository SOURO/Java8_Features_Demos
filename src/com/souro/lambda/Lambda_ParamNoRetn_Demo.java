/**
 * 
 */
package com.souro.lambda;

/**
 * @author sourabrata
 *
 */
public class Lambda_ParamNoRetn_Demo {
	public static void main(String args[]) {
		String field = "MachineLearning";
		Research3 research = (arg) -> {
			if (arg != null && ! arg.isEmpty()
					&& arg.equalsIgnoreCase("MachineLearning")) {
				System.out
						.println("Remember, deep down in Machine Learning, Math is hidden there !!");
			}
		};
		research.provideInfo(field);
	}
}
