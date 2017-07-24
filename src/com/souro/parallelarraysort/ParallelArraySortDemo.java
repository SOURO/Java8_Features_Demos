/**
 * 
 */
package com.souro.parallelarraysort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author sourabrata
 *
 */
public class ParallelArraySortDemo {
	public static void main(String args[]){
		int array[] = {9,2,8,4,1,6,3,7,5};
		Arrays.parallelSort(array,2,5);
		for(int arr: array){
			System.out.print(arr);
		}
		Arrays.parallelSort(array);
		System.out.println();
		for(int arr: array){
			System.out.print(arr);
		}
	}
}
