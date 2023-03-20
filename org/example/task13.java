/*• Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
• - Создать множество ноутбуков.
• - Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 + ОЗУ
2 + Объем ЖД
3 + Операционная система
4 + Цвет …
• - Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
• - Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */
package org.example;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {


        List<laptop> ourData = new ArrayList<>();
        StringBuilder ourSentence = new StringBuilder();
       
            System.out.println(System.getProperty("user.dir"));
            String ourPath2 = System.getProperty("user.dir") + "/org/example/db.txt";
            File ourFile = new File(ourPath2);
            
            try (BufferedReader ourReader = new BufferedReader(new FileReader(ourFile))) {
                System.out.println("File opened");
                String str=null;
                str = ourReader.readLine();
                do {
                    //System.out.println(str);
                    laptop laptop = new laptop(str);
                    ourData.add(laptop);

                    ourSentence.append(str + "\n");
                    str = ourReader.readLine();
                } while (str != null);
    

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            List<laptop> laptops = ourData;
            try (Scanner reader = new Scanner(System.in)) {

                int n = 0;

                do {
                    System.out.println(""" 
                    Введите цифру, соответствующую необходимому критерию:
                    1 ОЗУ
                    2 Объем ЖД
                    3 Операционная система
                    4 Цвет
                    5 Выход
                        """);

                    n = reader.nextInt();

                    switch (n){
                        case 1:
                            System.out.println("Введите минимальное значение");
                            laptops = laptopPredicates.filteredLaptops(laptops, laptopPredicates.isRamHigherThan(reader.nextInt()));
                            break;
                        case 2:
                            System.out.println("Введите минимальное значение");
                            laptops = laptopPredicates.filteredLaptops(laptops, laptopPredicates.isHDDHigherThan(reader.nextInt())); 
                            break;
                        case 3:
                            System.out.println("Введите значение");
                            laptops = laptopPredicates.filteredLaptops(laptops, laptopPredicates.isOsEqualsTo(reader.next()));
                        case 4:
                            System.out.println("Введите значение");
                            laptops = laptopPredicates.filteredLaptops(laptops, laptopPredicates.isColorEqualsTo(reader.next()));
                    }

                } while (n!=5);

                for (laptop laptop : laptops) {
                    System.out.println(laptop.toString());
                }
            }
    }
}
