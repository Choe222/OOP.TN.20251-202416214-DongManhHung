package com.hust.kstn.models;

public class Store {
	private static final int MAX_NUMBER = 100;
	private int num;
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBER];
	
    public void addDVD(DigitalVideoDisc disc) {
        if (num == MAX_NUMBER) {
            System.out.println("The store is almost full");
        } else {
        	itemsInStore[num] = disc;
            num++;
            System.out.println("The disc has been added sucessfully");
        }
    }
 
    public void removeDVD(DigitalVideoDisc disc) {
        if (num == 0) {
            System.out.println("The store is empty");
            return;
        }

        int index = -1;
        for (int i = 0; i < num; i++) {
            if (itemsInStore[i] == disc) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("The disc does not exist");
        } else {
            for (int i = index; i < num - 1; i++) {
            	itemsInStore[i] = itemsInStore[i + 1];
            }
            itemsInStore[num - 1] = null;
            num--;
            System.out.println("The disc has been removed sucessfully");
        }
    }
}