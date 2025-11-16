package com.hust.kstn.test;

import java.util.*;

import com.hust.kstn.models.*;

public class BookTest {

	public static void main(String[] args) {
        List<BookAuthor> authors1 = new ArrayList<>();
        BookAuthor a1_1 = new BookAuthor("Robert C. Martin", 1952, "American software engineer and author");
        BookAuthor a1_2 = new BookAuthor("Dean Wampler", 1965, "Software architect and consultant");
        authors1.add(a1_1);
        authors1.add(a1_2);

        Book book1 = new Book(
            "Clean Code",
            "Programming",
            29.99,
            350,
            authors1
        );

        List<BookAuthor> authors2 = new ArrayList<>();
        BookAuthor a2_1 = new BookAuthor("J. R. R. Tolkien", 1892, "British writer, poet and philologist");
        authors2.add(a2_1);

        Book book2 = new Book(
            "The Hobbit",
            "Fantasy",
            15.50,
            950,
            authors2
        );

        List<BookAuthor> authors3 = new ArrayList<>();
        BookAuthor a3_1 = new BookAuthor("George Orwell", 1903, "English novelist and critic");
        authors3.add(a3_1);

        Book book3 = new Book(
            "1984",
            "Dystopian",
            12.99,
            700,
            authors3
        );
        
        book1.print();
	}

}
