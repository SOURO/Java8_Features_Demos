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
public class StreamMinAndMax {
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
		
		Book maxQtyProduct = books.stream().max((compareBook1, compareBook2) -> compareBook1.quantity>compareBook2.quantity?1:-1).get();
		System.out.println(maxQtyProduct.bookName + " " + + maxQtyProduct.isbn + " " + maxQtyProduct.quantity);
		
		Book minQtyProduct = books.stream().max((compareBook1, compareBook2) -> compareBook1.quantity<compareBook2.quantity?1:-1).get();
		System.out.println(minQtyProduct.bookName + " " + + minQtyProduct.isbn + " " + minQtyProduct.quantity);
	}
}
