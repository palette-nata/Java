/* Дан массив записей: наименование товара, цена, сорт. 
Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
*/
package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



public class task8 {
    

    public static void main(String[] args) {
        Item item1 = new Item("Мука ржаная", 50.6, 1);
        Item item2 = new Item("Сахар", 54.7, 1);
        Item item3 = new Item("Мука пшеничная Высший сорт", 71.0, 2);
        Item item4 = new Item("Колбаса докторская высший сорт", 880.9, 1);
        Item item5 = new Item("Масло подсолнечное", 139.0, 2);
        Item item6 = new Item("Пельмени высший сорт", 600.0, 2);
        Item item7 = new Item("Хлеб высший сорт", 52.5, 3);
        Item item8 = new Item("Хлеб ржаной", 40.5, 2);

        List<Item> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        itemsList.add(item5);
        itemsList.add(item6);
        itemsList.add(item7);
        itemsList.add(item8);

        String searchName = "высший";
        Double maxPrice = 0.0;
        String maxPriceSortedNames = "";

        for (Item items : itemsList) {
            if (items.name.toLowerCase().contains(searchName) && (items.sort == 1 || items.sort == 2)) {
                if (maxPrice < items.price) {
                    maxPrice = items.price;
                }
            }
        }

        for (Item items : itemsList) {
            if (items.name.toLowerCase().contains(searchName) && (items.sort == 1 || items.sort == 2)) {
                if (Objects.equals(items.price, maxPrice)) {

                    maxPriceSortedNames += items.name + "\n";
                }
            }
        }
        System.out.println("Товары первого и второго сорта с наибольшей ценой, в названии которых есть слово 'высший': ");
        System.out.println(maxPriceSortedNames);
        System.out.println("Наибольшая цена: " + maxPrice);
}
}


