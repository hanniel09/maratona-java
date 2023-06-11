package estudos.maratonajava.javacore.concorrencia.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        int number = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < number; i++) {
            System.out.printf("%s executando uma tarefa Callable", Thread.currentThread().getName());
        }
        return String.format("%s finished and the random number is %d", Thread.currentThread().getName(), number);
    }
}
public class CallableTest01 {
    public static void main(String[] args) {
        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executorsService = Executors.newFixedThreadPool(2);
        Future<String> future = executorsService.submit(randomNumberCallable);
        String s = future.get();
        System.out.printf("Program finished %s", s);
        System.out.println("Program finished");
        executorsService.shutdown();
    }
}
