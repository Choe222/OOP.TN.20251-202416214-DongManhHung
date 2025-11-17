package com.hust.kstn.models;

import java.util.*;

public class Book extends Media {
	private int numOfTokens;
	private List<BookAuthor> authors = new ArrayList<>(); 
	public Book(String title, String category, double cost, int numOfTokens, List<BookAuthor> authors) {
	    super(title, cost, category);
		this.numOfTokens = numOfTokens;
		this.authors = authors;
	}
	public int getWordCount() {
		return numOfTokens;
	}
	public List<BookAuthor> getAuthors() {
		return authors;
	}
	@Override 
	public String toString() { 
		return super.toString()  
		+ "[" + this.numOfTokens + "]" 
		+ "\nAuthors: " + this.authors; 
	} 
	public void print() {
		System.out.println(this.toString());
	}
}
