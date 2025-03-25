package com.ggjiuw;

public class CountThread extends Thread{
    int value;

    public CountThread(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = 0; i <= value; i++)
            System.out.println(i);
    }
}
