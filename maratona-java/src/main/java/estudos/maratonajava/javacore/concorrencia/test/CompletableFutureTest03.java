package estudos.maratonajava.javacore.concorrencia.test;

import estudos.maratonajava.javacore.concorrencia.service.StoreService;
import estudos.maratonajava.javacore.concorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeServiceDeprecated);
    }

    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        List<CompletableFuture<Double>> completableFuture = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s), executor))
                .collect(Collectors.toList());

        List<Double> prices = completableFuture.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());


        System.out.println(prices);
        long end = System.currentTimeMillis();
        executor.shutdown();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }
}
