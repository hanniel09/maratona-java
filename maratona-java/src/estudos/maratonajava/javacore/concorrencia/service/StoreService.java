package estudos.maratonajava.javacore.concorrencia.service;

import java.util.concurrent.*;

public class StoreService {
    public static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return priceGeneretor();
    }

    public Future<Double> getPricesAsyncFuture(String storeName){
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return ex.submit(this::priceGeneretor);
    }

    public CompletableFuture<Double> getPricesAsyncCompletableFuture(String storeName){
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return CompletableFuture.supplyAsync(this::priceGeneretor);
    }

    public static void shutdown(){
        ex.shutdown();
    }

    private double priceGeneretor() {
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
