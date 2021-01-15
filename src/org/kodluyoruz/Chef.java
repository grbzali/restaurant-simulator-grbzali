package org.kodluyoruz;

public class Chef implements Runnable{


    @Override
    public void run() {
        while (true){
            while (Restaurant.cooks.isEmpty()){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Restaurant.cooks.peek() +" hazırlanıyor");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Restaurant.cooks.poll() +" hazır");

        }
    }
}
