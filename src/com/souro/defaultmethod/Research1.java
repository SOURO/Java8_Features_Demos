/**
 * 
 */
package com.souro.defaultmethod;

/**
 * @author sourabrata
 *
 */
public interface Research1 {
	public void provideInfo();
	default void provideExtraInfo(){
		System.out.println("For research passion is required, skills are addons !!");
	}
	static void provideMoreInfo(){
		System.out.println("Theory is good, but prcatical do the reality check !!");
	}
}
