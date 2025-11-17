package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
	private int id;
	private String title;
	private String category;
	private double cost;
	private List<String> artists = new ArrayList<>(); 
	private List<String> director = new ArrayList<>(); 
	private List<Track> tracks = new ArrayList<>(); 
	private static int nbCD = 0;
	public CompactDisc(String title, String category, double cost, List<String> artists, List<String> director,
			List<Track> tracks) {
		nbCD++;
		this.id = nbCD;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.artists = artists;
		this.director = director;
		this.tracks = tracks;
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
	public double getCost() {
		return cost;
	}
	public List<String> getArtists() {
		return artists;
	}
	public List<String> getDirector() {
		return director;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	@Override 
	public String toString() { 
		return "CD[" + this.id + "]["  
				+ this.title + "]["  
				+ this.cost + "]["  
				+ this.category + "]" 
				+ "\nArtists: " + this.artists
				+ "\nDirector: " + this.director
				+ "\nTrackList: " + this.tracks;
	}
	public void print() {
		System.out.println(this.toString());
	}
	public int totalLength() {
		int length = 0;
		for(Track item: tracks) {
			length += item.getLength();
		}
		return length;
	}
	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println("That track is already existed");
		}else {
			tracks.add(track);
			System.out.println("Added successfully");
		}
	}
	public void removeTrack(Track track) {
		if(tracks.isEmpty()) {
			System.out.println("The tracks is empty");
		}else if(tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Deleted successfully");
		}else {
			System.out.println("The track isn't existed");
		}
	}
}
