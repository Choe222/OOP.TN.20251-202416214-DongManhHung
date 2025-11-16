package com.hust.kstn.models;

import java.util.*;

public class Cart {
	private static final int MAX_NUMBER_ORDERED = 20;
	private int qtyOrdered;
	private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
        } else {
            itemsInCart[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added sucessfully");
        }
    }
	
    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }

        int index = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i] == disc) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("The disc does not exist");
        } else {
            for (int i = index; i < qtyOrdered - 1; i++) {
            	itemsInCart[i] = itemsInCart[i + 1];
            }
            itemsInCart[qtyOrdered - 1] = null;
            qtyOrdered--;
            System.out.println("The disc has been removed sucessfully");
        }
    }
	
	public double calculateTotalCost() {
		double res = 0.0;
		for(int i = 0; i < qtyOrdered; i++) {
			res += itemsInCart[i].getCost();
		}
		return  res;
	}
	
	public void print() {
		System.out.println("=== Total items in cart: " + qtyOrdered + " ===");
		System.out.println("=== All items in cart ===");
		for(int i = 0 ; i < qtyOrdered; i++) {
			System.out.println("[Title]: " + itemsInCart[i].getTitle() + ", " + "[Cost]: " + itemsInCart[i].getCost());
		}
	}
	
	public void sortTitle() {
	    System.out.println("=== Title sorting ... ===");

	    DigitalVideoDisc[] tmp = new DigitalVideoDisc[qtyOrdered];
	    System.arraycopy(itemsInCart, 0, tmp, 0, qtyOrdered);

	    Arrays.sort(tmp, Comparator.comparing(DigitalVideoDisc::getTitle).thenComparingDouble(DigitalVideoDisc::getCost));

	    for (int i = 0; i < qtyOrdered; i++) {
	        System.out.println("[Title]: " + tmp[i].getTitle() + ", " + "[Cost]: " + tmp[i].getCost());
	    }
	}

	public void sortCost() {
	    System.out.println("=== Cost sorting ... ===");

	    DigitalVideoDisc[] tmp = new DigitalVideoDisc[qtyOrdered];
	    System.arraycopy(itemsInCart, 0, tmp, 0, qtyOrdered);

	    Arrays.sort(tmp, Comparator.comparing(DigitalVideoDisc::getCost).thenComparing(DigitalVideoDisc::getTitle));

	    for (int i = 0; i < qtyOrdered; i++) {
	        System.out.println("[Title]: " + tmp[i].getTitle() + ", " + "[Cost]: " + tmp[i].getCost());
	    }
	}
}
