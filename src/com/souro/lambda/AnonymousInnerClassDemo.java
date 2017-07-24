/**
 * 
 */
package com.souro.lambda;

/**
 * @author sourabrata
 *
 */
public class AnonymousInnerClassDemo {
	public static void main(String args[]) {
		Research1 research = new Research1() {
			public void provideInfo() {
				System.out
						.println("Remember, deep down in Machine Learning, Math is hidden there !!");
			}
		};
		research.provideInfo();
	}
}
