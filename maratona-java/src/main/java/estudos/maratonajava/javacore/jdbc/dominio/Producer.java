package estudos.maratonajava.javacore.jdbc.dominio;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value
@Builder
public class Producer {
     Integer id;
     String name;

}
