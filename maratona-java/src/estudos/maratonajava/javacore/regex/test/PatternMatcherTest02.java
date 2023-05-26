package estudos.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos numericos
        // \D = Tudo o que não for digitos
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-z A-Z, digítos, _
        // \W = Tudo que não for inclusivo no \w
        String regex = "\\W";
        String texto = "abaaba";
        String texto2 = "@#hh_j212g vh21kh";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("Regex " + regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n" );
        }

    }
}
