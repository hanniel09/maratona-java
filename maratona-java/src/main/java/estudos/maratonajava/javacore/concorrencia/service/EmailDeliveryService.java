package estudos.maratonajava.javacore.concorrencia.service;


import estudos.maratonajava.javacore.concorrencia.dominio.Members;

public class EmailDeliveryService implements Runnable {
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Starting to deliver emails...");
        while (members.isOpen() || members.pendingEmails() > 0) {
            try {
                String email = members.retrieveEmails();
                if (email == null) continue;
                System.out.println(threadName + " enviando email para " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " enviou email com sucesso para " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Todos os emails foram enviados com sucesso");
    }
}
