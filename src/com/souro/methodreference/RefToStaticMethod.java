/**
 * 
 */
package com.souro.methodreference;

/**
 * @author sourabrata
 *
 */

public class RefToStaticMethod {
	public static void doProvideInfo() {
		System.out
				.println("Remember, deep down in Machine Learning, Math is hidden there !!");
	}
	public static void main(String args[]){
		Research1 research = RefToStaticMethod::doProvideInfo;
		research.provideInfo();
	}
}
