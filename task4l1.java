import java.util.Scanner;

/* ПОСЛЕДОВАТЕЛЬНОСТЬ ЦЕЛЫХ ЧИСЕЛ ВВОДИТ ПОЛЬЗОВАТЕЛЬ, данная последовательность оканчивается нулем. 
Найти сумму положительных чисел, после которых следует отрицательное число.
Пример: 1 2 1 2 -1 1 3 1 3 -1 0
2 -1 переход - 2 в сумму
3 -1 переход 3 в сумму
суммарно выведет 5 */

public class task4l1 {
    public static void main(String [] args){
        int num1 = 0, num2 = 0, sum = 0;
        Scanner scan = new Scanner(System.in);
        do
        {
            num2 = num1;
            System.out.println ("Введите целое число, 0-закончить ввод: ");
            num1 = scan.nextInt();
            if (num1 < 0 && num2 > 0){
                sum = sum + num2;
            }
        }      while (num1 != 0);

        System.out.println(String.format("Сумма: %s", sum));
    }
}
