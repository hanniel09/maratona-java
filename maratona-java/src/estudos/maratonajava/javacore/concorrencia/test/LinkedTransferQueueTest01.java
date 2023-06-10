package estudos.maratonajava.javacore.concorrencia.test;

import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Hanniel"));
        System.out.println(tq.offer("Hanniel"));
        System.out.println(tq.offer("Hanniel", 10, TimeUnit.SECONDS));
        tq.put("Developer");
        if(tq.hasWaitingConsumer()){
            tq.transfer("Backend");
        }
        System.out.println(tq.tryTransfer("Java Developer"));
        System.out.println(tq.tryTransfer("Java Developer", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
