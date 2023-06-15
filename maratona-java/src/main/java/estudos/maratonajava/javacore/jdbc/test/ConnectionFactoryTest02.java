package estudos.maratonajava.javacore.jdbc.test;

import estudos.maratonajava.javacore.jdbc.dominio.Producer;
import estudos.maratonajava.javacore.jdbc.repository.ProducerRepositoryRowSet;
import estudos.maratonajava.javacore.jdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("Mad House").build();
        ProducerRepositoryRowSet.updateCachedRowSet(producerToUpdate);
//        log.info("-------");
//        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
//        log.info(producers);



    }
}
