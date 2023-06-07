package estudos.maratonajava.javacore.streams.test;

import estudos.maratonajava.javacore.streams.dominio.Category;
import estudos.maratonajava.javacore.streams.dominio.LightNovel;
import estudos.maratonajava.javacore.streams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static estudos.maratonajava.javacore.streams.dominio.Promotion.*;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game No Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels
                .stream()
                .collect(groupingBy(ln -> {
                            return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
                        }
                ));
        System.out.println(collect);
        // Map<Category, Map<Promotion, List<ligthNovel>>>

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels
                .stream()
                .collect(groupingBy(LightNovel::getCategory, groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE
                )));

        System.out.println(collect1);
    }
}
