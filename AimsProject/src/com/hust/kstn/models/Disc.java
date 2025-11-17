package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Disc extends Media {
	private List<String> director = new ArrayList<>();
	public Disc(String title, String category, double cost, List<String> director) {
	    super(title, cost, category);
		this.director = director;
	}
	public List<String> getDirector() {
		return director;
	}
	@Override 
	public String toString() { 
		return super.toString() 
				+ "\nDirector: " + this.director;
		
	}
}
