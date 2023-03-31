package ru.gb.interview.Lesson3.Task1;

public class Ping implements Runnable {
    private Object lock;

    public Ping(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (lock) { // блокируем объект-блокировку
                System.out.println("ping from thread " + Thread.currentThread().getName());
                lock.notify(); // будим другой поток
                try {
                    lock.wait(); // ждем, пока другой поток напишет свое сообщение
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
