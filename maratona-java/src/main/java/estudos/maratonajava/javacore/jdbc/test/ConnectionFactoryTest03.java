package estudos.maratonajava.javacore.jdbc.test;

import estudos.maratonajava.javacore.jdbc.dominio.Producer;
import estudos.maratonajava.javacore.jdbc.repository.ProducerRepository;

import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("Toei Animation").build();
        Producer producer2 = Producer.builder().name("White fox").build();
        Producer producer3 = Producer.builder().name("Studio Ghibli").build();
        ProducerRepository.saveTransaction(List.of(producer1, producer2, producer3));
    }
}
