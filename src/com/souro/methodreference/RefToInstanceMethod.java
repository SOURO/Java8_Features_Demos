/**
 * 
 */
package com.souro.methodreference;

/**
 * @author sourabrata
 *
 */
public class RefToInstanceMethod {
	public void doProvideInfo(){
		System.out.println("Remember, deep down in Machine Learning, Math is hidden there !!");
	}
	public static void main(String args[]){
		RefToInstanceMethod instance = new RefToInstanceMethod();
		Research1 research = instance::doProvideInfo;
		research.provideInfo();
	}
}
