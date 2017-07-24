/**
 * 
 */
package com.souro.streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author sourabrata
 *
 */
public class StreamReduce {
	public static void main(String args[]){
		List<Book> books = new ArrayList<Book>();
		Book book1 = new Book();
		book1.isbn = 5;
		book1.bookName = "MachineLearning";
		book1.quantity=1;
		books.add(book1);
		Book book2 = new Book();
		book2.isbn = 3;
		book2.bookName = "Mathematics";
		book2.quantity=2;
		books.add(book2);
		Optional<Integer> totalNos1 = books.stream().map(book -> book.quantity).reduce((sum,nos)->sum+nos);
		int totalNos2 = books.stream().map(book -> book.quantity).reduce(1,(sum,nos)->sum+nos);
		totalNos1.ifPresent(System.out::println);
		System.out.println(totalNos2);
		
		Optional<Integer> totalNos3 = books.stream().map(book -> book.quantity).reduce(Integer::sum);
		int totalNos4 = books.stream().map(book -> book.quantity).reduce(2,Integer::sum);
		totalNos3.ifPresent(System.out::println);
		System.out.println(totalNos4);
	}
}
