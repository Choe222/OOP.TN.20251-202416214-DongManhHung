package com.hust.kstn.test;

import com.hust.kstn.models.*;

public class StoreTest {

	public static void main(String[] args) {
		Store store = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Sci-Fi", "The Wachowskis", 136, 14.50);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 18.99);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Fight Club", "Drama", "David Fincher", 139, 11.99);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lord of the Rings: The Return of the King", "Fantasy", "Peter Jackson", 201, 20.99);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Gladiator", "Action", "Ridley Scott", 155, 13.50);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 15.99);
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("Saving Private Ryan", "War", "Steven Spielberg", 169, 14.99);
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("The Silence of the Lambs", "Thriller", "Jonathan Demme", 118, 12.99);
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Jurassic Park", "Adventure", "Steven Spielberg", 127, 13.99);
		DigitalVideoDisc dvd10 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers, Rob Minkoff", 88, 10.50);
		DigitalVideoDisc dvd11 = new DigitalVideoDisc("Star Wars: A New Hope", "Sci-Fi", "George Lucas", 121, 17.99);
		DigitalVideoDisc dvd12 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 16.50);
		DigitalVideoDisc dvd13 = new DigitalVideoDisc("Parasite", "Thriller", "Bong Joon-ho", 132, 18.99);
		
		//add dvd
		store.addDVD(dvd1);
		store.addDVD(dvd13);
		
		//remove non-existed dvd
		store.removeDVD(dvd2);

		//remove existed dvd
		store.removeDVD(dvd1);

	}

}
