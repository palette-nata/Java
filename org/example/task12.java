/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.*/

package org.example;

public class task12 {
        public boolean isValid(String s) {
            boolean valid =  true;
            String str = s; //
            int lenstrnew = -1;
            int lenstr = str.length();
    
            do {
                
            str = str.replace("()","");
            str = str.replace("[]","");
            str = str.replace("{}","");
            lenstrnew = str.length();
            valid =  lenstrnew < lenstr;
            lenstr = lenstrnew;
    
            } while (lenstr>0 && valid );
    
            return valid;
     
        }
    }
    
    
    
}
