package estudos.maratonajava.javacore.jdbc.test;

import estudos.maratonajava.javacore.jdbc.conn.ConnectionFactory;
import estudos.maratonajava.javacore.jdbc.dominio.Producer;
import estudos.maratonajava.javacore.jdbc.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder()
                .name("NHK")
                .build();

        ProducerRepository.save(producer);
    }
}
