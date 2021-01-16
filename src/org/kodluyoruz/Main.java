package org.kodluyoruz;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        Thread chef1 = new Thread(new Chef());

        Thread waiter1 = new Thread(new Waiter());


        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Customer());

        chef1.start();
        //chef2.start();
        waiter1.start();
        //waiter2.start();
        //waiter3.start();

    }
}



