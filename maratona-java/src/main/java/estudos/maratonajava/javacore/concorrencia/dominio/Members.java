package estudos.maratonajava.javacore.concorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }
    }

    public void addMemberEmail(String email) {
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista");
            this.emails.add(email);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String retrieveEmails() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " cheking if there are emails");
        lock.lock();
        try {
            while (this.emails.size() == 0) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " Não tem email disponível na lista, entrando em modo de espera");
                condition.await();
            }
            return this.emails.poll();
        } finally {
        }
    }

    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Notificando que não estamos pegando mais emails.");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
