package Task_2;


import java.util.concurrent.atomic.AtomicInteger;

public class TaskTwo {
    public static void main(String[] args) {
        FizzBuzzLauncher launcher = new FizzBuzzLauncher(15);
        Thread A = new Thread(launcher::fizz);
        Thread B = new Thread(launcher::buzz);
        Thread C = new Thread(launcher::fizzbuzz);
        Thread D = new Thread(launcher::number);

        A.start();
        B.start();
        C.start();
        D.start();
    }
}




