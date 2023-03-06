
/*1) Подсчитать количество вхождения каждого слова
Пример:
Россия идет вперед всей планеты. Планета — это не Россия.
toLoverCase().
2) Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом) */

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class task5
{
	public static void main(String[] args) {

		Map<String, Integer> words = new HashMap<String, Integer>();
		String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
		String[] parts = str.toLowerCase().split("\\P{L}+");

		for (String string : parts) {
			Integer count = words.get(string);
			words.put(string, count != null ? count + 1 : 1);
		}

		System.out.println(Arrays.toString(words.entrySet().toArray()));
		String findingWord = "планета";
		System.out.println(String.format("слово %s встречается %d раз", findingWord, words.get(findingWord)));
	}
}
