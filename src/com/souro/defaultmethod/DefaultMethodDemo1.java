/**
 * 
 */
package com.souro.defaultmethod;

/**
 * @author sourabrata
 *
 */
public class DefaultMethodDemo1 implements Research1 {
	public void provideInfo(){
		System.out.println("Remember, deep down in Machine Learning, Math is hidden there !!");
	}
	public static void main(String args[]){
		DefaultMethodDemo1 obj = new DefaultMethodDemo1();
		obj.provideInfo();
		obj.provideExtraInfo();
		Research1.provideMoreInfo();
	}
}
