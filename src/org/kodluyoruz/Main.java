package org.kodluyoruz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        ExecutorService exe = Executors.newFixedThreadPool(5);

        new Restaurant();

    }
}



