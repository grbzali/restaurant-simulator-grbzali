package org.kodluyoruz;

public class Customer implements Runnable{
    private int orderId;
    synchronized public void createOrder(){
        System.out.println("creating order by:" + Thread.currentThread().getName()+" id:"+Thread.currentThread().getId());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        orderId = (int) (Thread.currentThread().getId() +1);
        System.out.println(orderId + ". order is created by:" + Thread.currentThread().getName()+" id:"+Thread.currentThread().getId());
        Restaurant.orders.add(orderId);
        System.out.println(Restaurant.orders);

    }
    synchronized public void eatOrder(){
        System.out.println("eating order by:" + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!(Restaurant.ordersReady.peek() == null)) {
            System.out.println(Restaurant.ordersReady.poll() + ". order is ate by:" + Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getId()+ ". thread left the restaurant");
        Thread.currentThread().interrupt();
    }

    @Override
    public void run() {
        while (true){
            createOrder();
            while (Restaurant.ordersReady.isEmpty()){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            eatOrder();

        }

    }
}