package estudos.maratonajava.javacore.concorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(5);
            return 4.88D;
        });
        System.out.println(doSomething());
        Double dollarResponse = null;
        try {
            dollarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
        System.out.println("Dollar: " + dollarResponse);

    }
    private static long doSomething(){
        System.out.println(Thread.currentThread().getName());
        int sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;

        }
        return sum;
    }
}
