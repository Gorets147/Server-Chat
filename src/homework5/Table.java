package homework5;

import java.util.concurrent.CountDownLatch;

public class Table extends Thread {
    private final int PHILOSOPHER_COUNT = 5;
    private Fork[] forks;
    private Philosopher[] philosophers;
    private CountDownLatch cdl;

    public Table() {
        forks = new Fork[PHILOSOPHER_COUNT];
        philosophers = new Philosopher[PHILOSOPHER_COUNT];
        this.cdl = new CountDownLatch(PHILOSOPHER_COUNT);
        init();
    }

    @Override
    public void run() {
        System.out.println("Философы собрались за столом");
        try {
            thinkingProcess();
            cdl.await();
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Все философы наелись");
    }

    public synchronized boolean tryGetForks(int leftForks, int rightForks){
        if(!forks[leftForks].isUsing() && !forks[rightForks].isUsing()){
            forks[leftForks].setUsing(true);
            forks[rightForks].setUsing(true);
            return true;
        }
        return false;
    }

    public void putForks(int leftFork, int rightFork) {
        forks[leftFork].setUsing(false);
        forks[rightFork].setUsing(false);
    }

    private void init() {
        for (int i = 0; i < PHILOSOPHER_COUNT; i++) {
            forks[i] = new Fork();
        }
        for (int i = 0; i < PHILOSOPHER_COUNT; i++) {
            philosophers[i] = new Philosopher("Philosopher #" + i, this,
                    i, (i + 1) % PHILOSOPHER_COUNT, cdl);
        }
    }

    private void thinkingProcess() {
        for (Philosopher philosopher : philosophers){
            philosopher.start();
        }
    }
}
