package org.kodluyoruz;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Restaurant {

    public static LinkedBlockingQueue<Order> orders = new LinkedBlockingQueue<>();
    public static LinkedBlockingQueue<Order> cooks = new LinkedBlockingQueue<>();




    Thread thWaiter = new Thread(new Waiter());


}


