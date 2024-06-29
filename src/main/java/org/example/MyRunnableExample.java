package org.example;

public class MyRunnableExample implements Runnable {
    private int threadNumber;

    public MyRunnableExample(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadNumber + " is running.");
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(new MyRunnableExample(i));
            thread.start();
        }
    }
}
