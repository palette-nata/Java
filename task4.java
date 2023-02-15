import java.util.Scanner;

/* Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, 
после которых следует отрицательное число.
Пример: 1 2 1 2 -1 1 3 1 3 -1 0
2 -1 переход - 2 в сумму
3 -1 переход 3 в сумму
суммарно выведет 5 */

public class task4 {
    public static void main(String [] args){
        int [] n = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        int sum = 0;
        int num1= n[0];
        for(int i = 1; i < n.length; i++){
            int num2 = n[i];
            if (num1 > 0 && num2 < 0){
                sum = sum + num1;
            }
            num1 = num2;
        }
        System.out.println(sum);
    }
}
