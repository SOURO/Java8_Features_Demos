/**
 * 
 */
package com.souro.defaultmethod;

/**
 * @author sourabrata
 *
 */
public class DefaultMethodDemo2 implements Research2, Research3 {
	public void method(){
		Research2.super.provideExtraInfo();
		Research3.super.provideExtraInfo();
	}
	public void provideExtraInfo(){
		System.out.println("Remember, deep down in Machine Learning, Math is hidden there !!");
	}
	public static void main(String args[]){
		DefaultMethodDemo2 obj = new DefaultMethodDemo2();
		obj.provideExtraInfo();
		obj.method();
	}
}
