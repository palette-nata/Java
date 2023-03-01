/* Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. 
Найти названия книг, в которых простое количество страниц, 
фамилия автора содержит «А» и год издания после 2010 г, включительно.*/
package org.example;
import java.util.ArrayList;
import java.util.List;
public class task10 {
    public static void main(String[] args) {
        Book book1 = new Book("Буратино", "Пушкин", 350.0, 2000, 50);
        Book book2 = new Book("Алые паруса", "Маяковский", 750.0, 2011, 23);
        Book book3 = new Book("Капитал", "Тютчев", 150.5, 1999, 25);
        Book book4 = new Book("Чук и Гек", "Дюма", 52.4, 2012, 100);
        Book book5 = new Book("Бегущая по волнам", "Фет", 465.0, 1964, 200);
        Book book6 = new Book("Айболит", "Достаевский", 98.0, 2025, 31);
        Book book7 = new Book("Три мушкетера", "Есенин", 790.0, 1974, 100);
        Book book8 = new Book("Колобок", "Донцова", 345.3, 2017, 570);

        List<Book> booksList = new ArrayList<>();

        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);
        System.out.println(booksList);

        StringBuilder sortedBooks = new StringBuilder();
        for (Book book : booksList) {
            if (isPrime(book.num) && book.author.toLowerCase().contains("а")) {
                if (book.year >= 2010) {
                    sortedBooks.append(book.name).append("\n");
                }
            }
        }
        System.out.println(sortedBooks);
    }

    private static boolean isPrime(Integer num) {

        if (num == 1) {
            return true;
        }
        if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
            return false;
        }
        for (int i = 2; i < num * num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }

}
