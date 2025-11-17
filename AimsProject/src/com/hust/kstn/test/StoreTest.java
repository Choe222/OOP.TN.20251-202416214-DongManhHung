package com.hust.kstn.test;

import java.util.ArrayList;
import java.util.List;

import com.hust.kstn.models.*;

public class StoreTest {

	public static void main(String[] args) {
		Store store = new Store();
		
        List<String> authors1 = new ArrayList<>();
        authors1.add("Christopher Nolan");
        List<String> authors2 = new ArrayList<>();
        authors2.add("Francis Ford Coppola");
        List<String> authors3 = new ArrayList<>();
        authors3.add("Frank Darabont");
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Dark Knight", "Action", authors1, 152, 17.99);
        DigitalVideoDisc dvd2= new DigitalVideoDisc("The Godfather", "Crime", authors2, 175, 19.99);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", authors3, 142, 14.99);

		//add dvd
		store.addDVD(dvd1);
		store.addDVD(dvd3);
		
		//remove non-existed dvd
		store.removeDVD(dvd2);

		//remove existed dvd
		store.removeDVD(dvd1);

	}

}
