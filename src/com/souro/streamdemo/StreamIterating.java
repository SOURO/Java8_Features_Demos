/**
 * 
 */

package com.souro.streamdemo;
import java.util.stream.*; 

/**
 * @author sourabrata
 *
 */
public class StreamIterating {
	public static void main(String args[]){
		Stream.iterate(1, research -> research+1).filter(research->research%2==1).limit(8).forEach(System.out::println);
	}
}
