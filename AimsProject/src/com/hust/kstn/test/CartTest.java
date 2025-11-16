package com.hust.kstn.test;

import com.hust.kstn.models.*;

public class CartTest {

	public static void main(String[] args) {

        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 17.99);
        DigitalVideoDisc dvd2= new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 19.99);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 14.99);
        DigitalVideoDisc[] discs = {       	           	
        	    new DigitalVideoDisc("Pulp Fiction", "Crime", "Quentin Tarantino", 154, 13.99),
        	    new DigitalVideoDisc("Forrest Gump", "Drama", "Robert Zemeckis", 142, 12.99),
        	    new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 16.50),
        	};

        //Remove empty cart
        cart.removeDVD(dvd1);
        
        //Add a dvd
        cart.addDVD(dvd1);
        cart.print();
        
        //Remove dvd that is not in the cart
        cart.removeDVD(dvd3);
        
        //Add 2 dvds
        cart.addDVD(dvd2, dvd3);
        cart.print();
        
        //Add a list dvds
        cart.addDVD(discs);
        cart.print();
	}

}
