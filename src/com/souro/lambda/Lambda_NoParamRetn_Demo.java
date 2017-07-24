/**
 * 
 */
package com.souro.lambda;

/**
 * @author sourabrata
 *
 */
public class Lambda_NoParamRetn_Demo {
	public static void main(String args[]) {
		Research2 research = () -> {
			System.out
					.println("Remember, deep down in Machine Learning, Math is hidden there !!");
		};
		research.provideInfo();
	}
}
