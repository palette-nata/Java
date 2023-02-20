/* Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива. */
import java.util.Arrays;
import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        System.out.print("Введите длину массива: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        int sumIndex = 0;
        System.out.println("Введите данные в массив:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if ((arr[i] > 9 && arr[i] < 100) || (arr[i] < -9 && arr[i] > -100)) {
                sumIndex += i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = sumIndex;
        }
        System.out.println(Arrays.toString(arr));
}
}
