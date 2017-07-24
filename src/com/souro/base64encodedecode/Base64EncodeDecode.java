/**
 * 
 */
package com.souro.base64encodedecode;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * @author sourabrata
 *
 */
public class Base64EncodeDecode {
	public static void main(String args[]){
		Base64.Encoder encoder = Base64.getEncoder();
		String src = "Souro";
		System.out.println("The string before encoding: " + src);
		
		try {
			String en_src = encoder.encodeToString(src.getBytes("utf-8"));
			System.out.println("The resultant encoded string: " + en_src);
			
			Base64.Decoder decoder = Base64.getDecoder();
			String de_src = new String(decoder.decode(en_src), "utf-8");
			System.out.println("The resultant decoded string: " + de_src);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
}
