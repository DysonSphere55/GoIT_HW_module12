package Task_2;

import java.util.concurrent.atomic.AtomicInteger;

class FizzBuzzLauncher {

    private int number;
    AtomicInteger value;

    public FizzBuzzLauncher(int number) {
        this.number = number;
        value = new AtomicInteger(0);
    }

    public void fizz() {
        synchronized (this) {
            while (value.get() <= number) {
                if (value.get() % 3 == 0 && value.get() % 5 != 0) {
                    System.out.println("fizz");
                    value.getAndIncrement();
                    notifyAll();
                } else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
    public void buzz() {
        synchronized (this) {
            while (value.get() <= number) {
                if (value.get() % 3 != 0 && value.get() % 5 == 0) {
                    System.out.println("buzz");
                    value.getAndIncrement();
                    notifyAll();
                } else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
    public void fizzbuzz() {
        synchronized (this) {
            while (value.get() <= number) {
                if (value.get() % 3 == 0 && value.get() % 5 == 0) {
                    System.out.println("fizzbuzz");
                    value.getAndIncrement();
                    notifyAll();
                } else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
    public void number() {
        synchronized (this) {
            while (value.get() <= number) {
                if (value.get() % 3 != 0 && value.get() % 5 != 0) {
                    System.out.println(value);
                    value.getAndIncrement();
                    notifyAll();
                } else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}