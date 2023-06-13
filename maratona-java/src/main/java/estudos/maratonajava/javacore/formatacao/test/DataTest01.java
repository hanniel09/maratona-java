package estudos.maratonajava.javacore.formatacao.test;

import java.util.Date;

public class DataTest01 {
    public static void main(String[] args) {
        Date data = new Date(1684277044716L);
        data.setTime(data.getTime() + 3_600_000);
        System.out.println(data);

    }
}
