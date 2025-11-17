package com.hust.kstn;

import java.util.ArrayList;
import java.util.List;

import com.hust.kstn.models.*;

public class Aims {
    public static void main(String[] args) {

        Cart cart = new Cart();
        List<String> authors1 = new ArrayList<>();
        List<String> authors2 = new ArrayList<>();
        List<String> authors3 = new ArrayList<>();
        authors1.add("Roger Allers");
        authors2.add("George Lucas");
        authors3.add("Son Tung MTP");
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                authors1, 87, 19.95);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
                authors2, 87, 18.95);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King", "Science Fiction",
                authors3, 84, 18.95);

        cart.addDVD(dvd1, dvd3);
        cart.print();
    }
}
