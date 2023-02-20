/*Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.*/
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        System.out.print("Введите целое число N - длина последовательности: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Введите последовательность: ");
        int num1 = sc.nextInt();
        String not = "";
        for (int i = 1; i < n; i++) {
            int num2 = sc.nextInt();
            if (num1 < num2) {
                num1 = num2;
            }
            else {
                not = "не";
                break;
            }
        }
        System.out.println("Последовательность "+ not +" является возврастающей!");
    }
}



