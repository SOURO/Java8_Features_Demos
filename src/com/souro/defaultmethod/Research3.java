/**
 * 
 */
package com.souro.defaultmethod;

/**
 * @author sourabrata
 *
 */
public interface Research3 {
	default void provideExtraInfo(){
		System.out.println("Theory is good, but prcatical do the reality check !!");
	}
}
