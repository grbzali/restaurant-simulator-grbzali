package org.kodluyoruz;

public class Waiter implements Runnable{

    @Override
    public void run() {
        while(true){
            while (Restaurant.orders.isEmpty()){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Restaurant.cooks.add(Restaurant.orders.poll());
            System.out.println("siparis alındı");
        }
    }
}
