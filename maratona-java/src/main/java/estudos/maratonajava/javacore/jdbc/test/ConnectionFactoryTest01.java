package estudos.maratonajava.javacore.jdbc.test;

import estudos.maratonajava.javacore.jdbc.conn.ConnectionFactory;
import estudos.maratonajava.javacore.jdbc.dominio.Producer;
import estudos.maratonajava.javacore.jdbc.repository.ProducerRepository;
import estudos.maratonajava.javacore.jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(9).name("StudioDeen").build();
//     ProducerService.save(producer);
//          ProducerService.delete(6);
       ProducerService.update(producerToUpdate);

    }
}
