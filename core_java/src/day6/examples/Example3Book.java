package day6.examples;
import java.util.*;

import day6.beans.Book;
public class Example3Book {
	
	public static void main(String[] args) {
		Book book1 =new Book(19,"abc","Java","1000");
		Book book2 =new Book(6,"zzz",".Net","900");
		Book book3 =new Book(42,"mmm","C++","533.23");
		
		ArrayList<Book> bDetails = new ArrayList<Book>();
		
		bDetails.add(book1);
		bDetails.add(book2);
		bDetails.add(book3);
		
		
		Iterator<Book> iter =bDetails.iterator();
		while(iter.hasNext()) {
			Book a =iter.next();
			System.out.println(a);
		}
		
		
		
	}

}
