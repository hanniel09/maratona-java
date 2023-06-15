package estudos.maratonajava.javacore.jdbc.test;

import estudos.maratonajava.javacore.jdbc.conn.ConnectionFactory;
import estudos.maratonajava.javacore.jdbc.dominio.Producer;
import estudos.maratonajava.javacore.jdbc.repository.ProducerRepository;
import estudos.maratonajava.javacore.jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(3).name("Studio Deen").build();
//        ProducerService.save(producer);
//        ProducerService.delete(9);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Producers found '{}'", producers);
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
//        log.info("Producers found '{}'", producers);
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("Bo");
//        log.info("Producers found '{}'", producers);
//        ProducerService.updatePreparedStatement(producerToUpdate);
        List<Producer> producers = ProducerService.findByNameCallableStatement("nhk");
        log.info("Producers found '{}'", producers);


    }
}
