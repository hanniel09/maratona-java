package estudos.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os dígitos numericos
        // \D = Tudo o que não for digitos
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-z A-Z, digítos, _
        // \W = Tudo que não for inclusivo no \w
        // [] = Letras dentro do Rage ["a-zA-Z"]
        // ? Zero ou uma
        // * Zero ou mais
        // + uma oumais
        // {n,m} de n até m
        // ()
        // |
        // $
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmai.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email valido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("Regex " + regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n" );
        }

    }
}
