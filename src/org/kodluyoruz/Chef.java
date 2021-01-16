package org.kodluyoruz;

public class Chef implements Runnable{

    synchronized public void cook(){
        if (!(Restaurant.ordersReceived.peek() == null)) {
            System.out.println("cooking "+ Restaurant.ordersReceived.peek() + " by:" + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Restaurant.ordersReady.add(Restaurant.ordersReceived.poll());
            System.out.println("Order is made by:" + Thread.currentThread().getName());
        }

    }
    @Override
    public void run() {
        while (true){
            while (Restaurant.ordersReceived.isEmpty()){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cook();
            }
        }
    }
}
