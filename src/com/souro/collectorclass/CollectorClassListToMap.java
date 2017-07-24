/**
 * 
 */
package com.souro.collectorclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author sourabrata
 *
 */
public class CollectorClassListToMap {
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
		Book book3 = new Book();
		book3.isbn = 8;
		book3.bookName = "Coding";
		book3.quantity=3;
		books.add(book3);
		Map<Integer, String> bookMap = books.stream().collect(Collectors.toMap(b->b.isbn, b->b.bookName));
		System.out.println(bookMap);
	}
}
