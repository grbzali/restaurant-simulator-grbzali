package org.kodluyoruz;

public class Waiter implements Runnable{


    synchronized public void orderReceive(){
        if (!(Restaurant.orders.peek() == null)) {
            System.out.println("Receiving order by:" + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Restaurant.ordersReceived.add(Restaurant.orders.poll());
            System.out.println("Order is received by:" + Thread.currentThread().getName());
        }
    }
    synchronized public void orderServe(){
        if (!(Restaurant.ordersReady.peek() == null)) {
            System.out.println("Serving order by:" + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Order is served by:" + Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        while(true){
            while (Restaurant.orders.isEmpty() || Restaurant.ordersReady.isEmpty()){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (!(Restaurant.orders.peek() == null)) orderReceive();
            else orderServe();

        }
    }
}
