/*Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. 
Получить наименования товаров заданного сорта с наименьшей ценой.
*/

package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {


        Item2 item1 = new Item2("Яблоки ГАЛА", "Польша", 150.0, 1000, 2);
        Item2 item2 = new Item2("Бананы", "Эквадор", 79.0, 100, 2);
        Item2 item3 = new Item2("Мандарины", "Марокко", 189.0, 1000, 1);
        Item2 item4 = new Item2("Мука", "Россия", 64.0, 200, 1);
        Item2 item5 = new Item2("Мука Ржаная", "Россия", 47.5, 400.0, 2);
        Item2 item6 = new Item2("Мука Кукурузная", "Россия", 79.0, 250.0, 3);
        Item2 item7 = new Item2("Молоко", "Россия", 70.9, 850.0, 1);
        Item2 item8 = new Item2("Кефир", "Казахстан", 56.6, 900, 3);

        List<Item2> itemsList2 = new ArrayList<>();

        itemsList2.add(item1);
        itemsList2.add(item2);
        itemsList2.add(item3);
        itemsList2.add(item4);
        itemsList2.add(item5);
        itemsList2.add(item6);
        itemsList2.add(item7);
        itemsList2.add(item8);

        System.out.println(itemsList2);
        int ourSort = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("Введите номер сорта (1, 2, 3)");
            String sort = scanner.nextLine();
            try {
                if (Integer.parseInt(sort) > 0 && Integer.parseInt(sort) <= 3) {
                    flag = false;
                    ourSort = Integer.parseInt(sort);
                }
            } catch (Exception e) {
                System.out.println("Error. Попробуйте еще раз, введите номер сорта (1, 2, 3)");
            }
        }
        scanner.close();

        double minPrice = itemsList2.get(0).price;
        for (Item2 item : itemsList2) {

            if (item.sort.equals(ourSort)) {
                if (item.price < minPrice) {
                    minPrice = item.price;
                }
            }
        }
        StringBuilder ourNames = new StringBuilder();
        for (Item2 item : itemsList2) {

            if (item.sort.equals(ourSort) && (item.price == minPrice)) {
                ourNames.append(item.name).append("\n");
            }
        }
        System.out.println("Товары с самой низкой ценой сорта " + ourSort + ": \n" + ourNames);


    }

}
