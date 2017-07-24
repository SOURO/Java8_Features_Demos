/**
 * 
 */
package com.souro.stringjoinerdemo;

import java.util.StringJoiner;

/**
 * @author sourabrata
 *
 */
public class StringJoinerDemo {
	public static void main(String srgs[]){
		StringJoiner sj_name = new StringJoiner(" ","{","}");
		sj_name.add("Souro");
		sj_name.add("Mukherjee");
		System.out.println(sj_name);
		
		StringJoiner sj_company = new StringJoiner("-","(",")");
		sj_company.add("Tricon");
		sj_company.add("Infotech");
		System.out.println(sj_company);
		
		StringJoiner fullInfo = sj_name.merge (sj_company);
		System.out.println(fullInfo);
	}
}
