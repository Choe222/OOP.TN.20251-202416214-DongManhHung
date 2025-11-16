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

        book1.print();
	}

}
