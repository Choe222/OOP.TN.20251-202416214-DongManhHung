package com.hust.kstn.models;

import java.util.*;

public class Book {
	private int id;
	private String title;
	private String category;
	private double cost;
	private int numOfTokens;
	private List<BookAuthor> authors = new ArrayList<>(); 
	private static int nbBook = 0;
	public Book(String title, String category, double cost, int numOfTokens, List<BookAuthor> authors) {
		nbBook++;
		this.id = nbBook;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.numOfTokens = numOfTokens;
		this.authors = authors;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public double getPrice() {
		return cost;
	}
	public int getWordCount() {
		return numOfTokens;
	}
	public List<BookAuthor> getAuthors() {
		return authors;
	}
	@Override 
	public String toString() { 
	return "Book[" + this.id + "]["  
	+ this.title + "]["  
	+ this.cost + "]["  
	+ this.category + "][" 
	+ this.numOfTokens + "]" 
	+ "\nAuthors: " + this.authors; 
	}
	public void print() {
		System.out.println(this.toString());
	}
}
