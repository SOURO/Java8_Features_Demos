/**
 * 
 */
package com.souro.methodreference;

/**
 * @author sourabrata
 *
 */
class ClassWithConstructor{
	ClassWithConstructor(String info){
		System.out.println(info);
	}
}

public class RefToConstructor {
	public static void main(String args[]){
		Research2 research = ClassWithConstructor::new;
		research.provideInfo("Remember, deep down in Machine Learning, Math is hidden there !!");
		
	}
}
