package codebase.streams_1;

import java.util.List;
import java.util.stream.IntStream;

public class Calculations {
    public static void main(String[] args) {

        List<Item> itemLists = IntStream
                .rangeClosed(1, 10)
                .mapToObj(n -> new Item("Item" + n, n, n * 10))
                .toList();


        int max = IntStream
                .rangeClosed(1, 10)
                .mapToObj(n -> new Item("Item" + n, n, n * 10))
                .mapToInt(Item::price)
                .reduce(0, Integer::max);

        double averagePrice = itemLists.stream()
                .mapToInt(Item::price)
                .average()
                .orElse(0.0);;

        System.out.println(averagePrice);

        List<Item> itemsWithPriceLowerThan90 = itemLists.stream().dropWhile(item -> item.price() < 90).toList();

        System.out.println(itemsWithPriceLowerThan90);







        for (Item itemList : itemLists) {
            System.out.println(itemList);
        }

    }
}
