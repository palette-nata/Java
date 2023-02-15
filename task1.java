/*Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"*/

public class task1 {
     
    public static void main(String[] args) {
       String str =  "the sky is blue";
       String str2 = reverseString(str);
       System.out.println(str2);

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

