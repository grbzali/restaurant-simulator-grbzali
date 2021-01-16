package org.kodluyoruz;

import java.util.concurrent.LinkedBlockingQueue;

public class Restaurant {

    public static LinkedBlockingQueue<Integer> orders = new LinkedBlockingQueue<>();
    public static LinkedBlockingQueue<Integer> ordersReceived = new LinkedBlockingQueue<>();
    public static LinkedBlockingQueue<Integer> ordersReady = new LinkedBlockingQueue<>();

    public void OpenRestaurant(){

    }
    public boolean isFull(){

        return true;
    }

}
