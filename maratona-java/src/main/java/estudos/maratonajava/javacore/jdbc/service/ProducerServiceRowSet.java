package estudos.maratonajava.javacore.jdbc.service;

import estudos.maratonajava.javacore.jdbc.dominio.Producer;
import estudos.maratonajava.javacore.jdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name){
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }
    public static void updateJdbcRowSet(Producer producer){
        ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }
}
