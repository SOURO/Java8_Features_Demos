/**
 * 
 */
package com.souro.optionalclass;

import java.util.Optional;

/**
 * @author sourabrata
 *
 */
public class WithOptional_IsPresent {
	public static void main(String args[]) {
		String arrStrings[] = new String[5];
		Optional<String> optString = Optional.ofNullable(arrStrings[0]);
		if (optString.isPresent()) {
			if (arrStrings[0].contains("Souro")) {
				System.out.println("Souro is present in the string !!");
			}
		}
		else{
			System.out.println("There is no string at 1st index !!");
		}
		String res = optString.orElse("DefaultString");
		System.out.println(res);
		
		arrStrings[0]="Souro";
		optString=Optional.ofNullable(arrStrings[0]);
		
		res = optString.orElse("DefaultString");
		System.out.println(res);
		
		res = optString.get();
		System.out.println(res);
	}
}
