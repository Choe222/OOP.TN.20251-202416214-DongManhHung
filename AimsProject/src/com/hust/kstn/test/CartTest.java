package com.hust.kstn.test;

import java.util.ArrayList;
import java.util.List;

import com.hust.kstn.models.*;

public class CartTest {

	public static void main(String[] args) {
        List<String> authors1 = new ArrayList<>();
        authors1.add("Christopher Nolan");
        List<String> authors2 = new ArrayList<>();
        authors2.add("Francis Ford Coppola");
        List<String> authors3 = new ArrayList<>();
        authors3.add("Frank Darabont");
        List<String> authors4 = new ArrayList<>();
        authors4.add("Quentin Tarantino");
        List<String> authors5 = new ArrayList<>();
        authors5.add("Robert Zemeckis");
        List<String> authors6 = new ArrayList<>();
        authors6.add("Christopher Nolan");
        
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Dark Knight", "Action", authors1, 152, 17.99);
        DigitalVideoDisc dvd2= new DigitalVideoDisc("The Godfather", "Crime", authors2, 175, 19.99);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", authors3, 142, 14.99);
        DigitalVideoDisc[] discs = {       	           	
        	    new DigitalVideoDisc("Pulp Fiction", "Crime", authors4, 154, 13.99),
        	    new DigitalVideoDisc("Forrest Gump", "Drama", authors5, 142, 12.99),
        	    new DigitalVideoDisc("Inception", "Sci-Fi", authors6, 148, 16.50),
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
