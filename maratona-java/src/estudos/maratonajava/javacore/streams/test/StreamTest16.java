package estudos.maratonajava.javacore.streams.test;

import estudos.maratonajava.javacore.streams.dominio.Category;
import estudos.maratonajava.javacore.streams.dominio.LightNovel;
import estudos.maratonajava.javacore.streams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static estudos.maratonajava.javacore.streams.dominio.Promotion.NORMAL_PRICE;
import static estudos.maratonajava.javacore.streams.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

public class StreamTest16 {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }

    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i < num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("Sum sumStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelStreamIterate(long num) {
        System.out.println("Sum sumParallelStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num) {
        System.out.println("Sum sumLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelLongStreamIterate(long num) {
        System.out.println("Sum sumParallelLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

}
