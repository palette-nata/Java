/* Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.*/

public class task3 {
    public static void main(String[] args) {
        String str =  "a good   example";
        str = reverseString(str);
        System.out.println(str.replaceAll("\\s+", " "));
     }
     public static String reverseString(String s) {
    
        String result = "";
        String[] parts = s.split(" ");
   
        for (int i = parts.length - 1; i >= 0; i--) {
           result = result +" "+ parts[i];
        }
        return result;
      }
}
