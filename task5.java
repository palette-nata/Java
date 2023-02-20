/* Дана последовательность N целых чисел. Найти сумму простых чисел. */
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
            int sum = 0;
            System.out.print("Введите целое число N - длина последовательности: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("Введите последовательность: ");
            for (int i = 0; i < n; i++) {
               int num=sc.nextInt();
               if (isSimpleNumber(num)) {
                sum += num;
                }
            }
            System.out.println("Сумма простых чисел в последовательности = " + sum);
        }
        public static boolean isSimpleNumber(int num) {
            if (num > 1) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) return false;
                }
                return true;
            } else return false;
        }
}

    
    

