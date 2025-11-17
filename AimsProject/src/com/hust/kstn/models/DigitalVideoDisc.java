package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class DigitalVideoDisc extends Disc {
	private int length;
	
	public DigitalVideoDisc(String title) {
		super(title, "", 0.0, new ArrayList<>());
	}
	public DigitalVideoDisc(String title, String category, List<String> director, int length, double cost) {
	    super(title, category, cost, director);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	@Override 
	public String toString() { 
		return super.toString()  
				+ "\nLength: [" + this.length + "] ";  


	} 
}
