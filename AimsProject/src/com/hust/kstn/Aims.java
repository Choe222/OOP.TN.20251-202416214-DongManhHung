package com.hust.kstn;

import com.hust.kstn.models.*;

public class Aims {
    public static void main(String[] args) {

        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Allers", 87, 19.95);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
                "George Lucas", 87, 18.95);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King", "Science Fiction",
                "Son Tung MTP", 84, 18.95);
        
        cart.addDVD(dvd1);
        cart.addDVD(dvd2);
        cart.addDVD(dvd3);
        cart.calculateTotalCost();

        cart.sortTitle();
        cart.sortCost();
    }
}
