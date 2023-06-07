package estudos.maratonajava.javacore.streams.test;

import estudos.maratonajava.javacore.streams.dominio.Category;
import estudos.maratonajava.javacore.streams.dominio.LightNovel;
import estudos.maratonajava.javacore.streams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static estudos.maratonajava.javacore.streams.dominio.Promotion.NORMAL_PRICE;
import static estudos.maratonajava.javacore.streams.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion,
                        Collectors.toSet())));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion,
                        Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }
    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
