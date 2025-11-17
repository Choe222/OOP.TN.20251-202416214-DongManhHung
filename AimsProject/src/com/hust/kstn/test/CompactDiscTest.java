package com.hust.kstn.test;

import java.util.*;
import com.hust.kstn.models.*;

public class CompactDiscTest {

    public static void main(String[] args) {
        List<String> artists2 = Arrays.asList(
            "Daft Punk"
        );

        List<String> directors2 = Arrays.asList(
            "Joseph Kosinski"
        );

        List<Track> tracks2 = new ArrayList<>();
        tracks2.add(new Track("Derezzed", 125));
        tracks2.add(new Track("The Grid", 95));
        tracks2.add(new Track("End of Line", 150));
        tracks2.add(new Track("TRON Legacy Theme", 225));

        CompactDisc cd2 = new CompactDisc(
            "TRON: Legacy Soundtrack",
            "Electronic",
            18.49,
            artists2,
            directors2,
            tracks2
        );


        List<String> artists1 = Arrays.asList(
            "Michael Jackson"
        );

        List<String> directors1 = Arrays.asList(
            "John Landis"
        );
        Track track1 = new Track("Thriller", 357);
        
        List<Track> tracks1 = new ArrayList<>();
        tracks1.add(track1);
        tracks1.add(new Track("Beat It", 258));
        tracks1.add(new Track("Billie Jean", 294));

        CompactDisc cd1 = new CompactDisc(
            "Thriller",
            "Pop",
            15.99,
            artists1,
            directors1,
            tracks1
        );
        //print
        cd1.print();
        cd2.print();
        
        //total length
		System.out.println("Length of CD1: " + cd1.totalLength());
		
		//add non-existed track 
        cd1.addTrack(new Track("Noi nay co anh", 458));
        cd1.print();
        
        //add existed track
        cd1.addTrack(track1);
        
        //remove existed track
        cd1.removeTrack(track1);
        cd1.print();
        
        //remove non-existed track
        cd1.removeTrack(track1);
    }
}
