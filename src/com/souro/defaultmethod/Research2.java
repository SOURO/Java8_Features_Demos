/**
 * 
 */
package com.souro.defaultmethod;

/**
 * @author sourabrata
 *
 */
public interface Research2 {
	default void provideExtraInfo(){
		System.out.println("For research passion is required, skills are addons !!");
	}
}
