package com.ggjiuw;

public class Main {
    public static void main(String[] args) {
        runThreads(10);
    }

    public static void runThreads(int threads) {
        for (int i = 0; i < threads; i++) {
            CountThread countThread = new CountThread(100);
            Thread thread = new Thread(countThread);
            thread.start();
        }
    }
}

