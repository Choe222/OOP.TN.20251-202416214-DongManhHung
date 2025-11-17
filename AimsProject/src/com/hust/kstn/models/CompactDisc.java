package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
	private List<String> artists = new ArrayList<>();  
	private List<Track> tracks = new ArrayList<>(); 
	public CompactDisc(String title, String category, double cost, List<String> artists, List<String> director,
			List<Track> tracks) {
	    super(title, category, cost, director);
		this.artists = artists;
		this.tracks = tracks;
	}
	public List<String> getArtists() {
		return artists;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	@Override 
	public String toString() { 
		return super.toString() 
				+ "\nArtists: " + this.artists
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
